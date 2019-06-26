package com.lodz.p.edu.iap.lab.wmsemp.api.warehouse;

import com.lodz.p.edu.iap.lab.wmsemp.entity.warehouse.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}
