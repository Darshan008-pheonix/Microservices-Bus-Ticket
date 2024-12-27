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
    @JsonFormat(pattern = "yyyy-MM-dd") LocalDate fromdate,
    @JsonFormat(pattern = "yyyy-MM-dd") LocalDate todate,
    String busid,
    String drivername,
    String phno,
    Integer seats,
    Double price,
    @JsonFormat(pattern = "hh:mm a") LocalTime departuretime,
    @JsonFormat(pattern = "hh:mm a") LocalTime arrivaltime
) {
    public Inventory toEntity() {
        return new Inventory(
            travelingid,
            source,
            destination,
            stops,
            fromdate,
            todate,
            busid,
            drivername,
            phno,
            seats,
            price,
            departuretime,
            arrivaltime
        );
    }
}

