package com.example.MakerSharks.utils;

import com.example.MakerSharks.MakerSharksApplication;
import com.example.MakerSharks.dto.SupplierDto;
import com.example.MakerSharks.entity.Supplier;
import org.springframework.stereotype.Component;


@Component
public class Mapper {
    // map the user entity to user dto
    public static SupplierDto mapToSupplierDto(Supplier supplier) {
        return MakerSharksApplication.modelMapper().map(supplier, SupplierDto.class);
    }

    // map the user dto to user entity
    public static Supplier mapToSupplierEntity(SupplierDto supplierDto) {
        return MakerSharksApplication.modelMapper().map(supplierDto, Supplier.class);
    }

}


