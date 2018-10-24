package com.demo.common.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/name")
    public String getName() {
        return "INVENTORY-SERVICE";
    }
}
