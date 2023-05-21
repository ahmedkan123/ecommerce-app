package com.example.EcommerceApp.controller;

import com.example.EcommerceApp.entity.Order;
import com.example.EcommerceApp.entity.Shipment;
import com.example.EcommerceApp.service.implementation.ShipmentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipments")
@RequiredArgsConstructor
public class ShipmentController {
    private final ShipmentServiceImpl shipmentService;
    @PostMapping("")
    public Shipment createShipment(@RequestBody Order order) {
        return shipmentService.createShipment(order);
    }
    @PutMapping("/{shipmentId}")
    public Shipment updateShipmentStatus(@PathVariable Long shipmentId
            , @RequestParam String status) {
        return shipmentService.updateShipmentStatus(shipmentId, status);
    }
    @GetMapping("/shipmentId")
    public Shipment getShipmentById(@PathVariable Long shipmentId) {
        return shipmentService.getShipmentById(shipmentId);
    }


}
