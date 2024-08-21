package com.example.MakerSharks.service.serviceImpl;

import com.example.MakerSharks.entity.Supplier;
import com.example.MakerSharks.repository.SupplierRepository;
import com.example.MakerSharks.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public Page<Supplier> getSuppliers(String location, String natureOfBusiness, String manufacturingProcesses, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return supplierRepository.findSuppliersByCriteria(location, natureOfBusiness, manufacturingProcesses, pageable);
    }
}
