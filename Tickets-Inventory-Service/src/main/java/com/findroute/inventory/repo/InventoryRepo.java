package com.findroute.inventory.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.findroute.inventory.entity.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, String> {

}
