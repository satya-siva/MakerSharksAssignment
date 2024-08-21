package com.example.MakerSharks.controller;

import com.example.MakerSharks.entity.Supplier;
import com.example.MakerSharks.service.serviceImpl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
    @Autowired
    private SupplierServiceImpl supplierService;

    @PostMapping("/query")
    public ResponseEntity<List<Supplier>> querySuppliers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam String manufacturingProcesses,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        List<Supplier> suppliers = (List<Supplier>) supplierService.getSuppliers(location, natureOfBusiness, manufacturingProcesses, page, size);
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }
}

