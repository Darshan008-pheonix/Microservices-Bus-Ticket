package com.findroute.inventory.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.findroute.inventory.entity.Inventory;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public record InventoryDto(
    String travelingid,
    String source,
    String destination,
    List<String> stops,
    @JsonFormat(pattern = "yyyy-MM-dd") LocalDate fromDate,
    @JsonFormat(pattern = "yyyy-MM-dd") LocalDate toDate,
    String busId,
    String driverName,
    String phNo,
    Integer seats,
    Double price,
    @JsonFormat(pattern = "hh:mm a") LocalTime departureTime,
    @JsonFormat(pattern = "hh:mm a") LocalTime arrivalTime
) {
    public Inventory toEntity() {
        return new Inventory(
            travelingid,
            source,
            destination,
            stops,
            fromDate,
            toDate,
            busId,
            driverName,
            phNo,
            seats,
            price,
            departureTime,
            arrivalTime
        );
    }
}

