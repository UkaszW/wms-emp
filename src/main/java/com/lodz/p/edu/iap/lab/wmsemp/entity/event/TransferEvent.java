package com.lodz.p.edu.iap.lab.wmsemp.entity.event;

import com.lodz.p.edu.iap.lab.wmsemp.entity.warehouse.Warehouse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("TRANSFER")
@Data
@NoArgsConstructor
public class TransferEvent extends Event {

    @NonNull
    private Long quantity;
    @NonNull
    @ManyToOne
    @JoinColumn
    private Warehouse sourceWarehouse;
    @ManyToOne
    @JoinColumn
    private Warehouse destinationWarehouse;
}
