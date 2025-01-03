package com.findroute.book.client;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.findroute.book.dto.ResponseStructure;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class InventoryClientService {

    private final InventoryClient inventoryClient;

    public InventoryClientService(InventoryClient inventoryClient) {
        this.inventoryClient = inventoryClient;
    }

    @CircuitBreaker(name = "inventoryService", fallbackMethod = "fallbackForValidate")
    public ResponseEntity<ResponseStructure<Boolean>> validate(String travelid, int seats) {
    	
        return inventoryClient.validate(travelid, seats);
    }

    // Fallback method
    public ResponseEntity<ResponseStructure<Boolean>> fallbackForValidate(String travelid, int seats, Throwable throwable) {
        ResponseStructure<Boolean> responseStructure = new ResponseStructure<>();
        responseStructure.setStatusCode(HttpStatus.SERVICE_UNAVAILABLE.value());
        responseStructure.setMsg("Fallback triggered due to: " + throwable.getMessage());
        responseStructure.setData(false);
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(responseStructure);
    }
}
