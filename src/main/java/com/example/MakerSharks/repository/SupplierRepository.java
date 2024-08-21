package com.example.MakerSharks.repository;

import com.example.MakerSharks.entity.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    @Query("SELECT s FROM Supplier s WHERE s.location = :location " +
            "AND s.natureOfBusiness = :natureOfBusiness " +
            "AND s.manufacturingProcesses = :manufacturingProcesses")
    Page<Supplier> findSuppliersByCriteria(
            @Param("location") String location,
            @Param("natureOfBusiness") String natureOfBusiness,
            @Param("manufacturingProcesses") String manufacturingProcesses,
            Pageable pageable);
}

