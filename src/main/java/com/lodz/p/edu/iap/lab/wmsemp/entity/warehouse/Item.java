package com.lodz.p.edu.iap.lab.wmsemp.entity.warehouse;

import com.lodz.p.edu.iap.lab.wmsemp.entity.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Item extends BaseEntity {

    @ManyToOne
    @JoinColumn
    private ItemType itemType;
    private Long quantity;
    @ManyToOne
    @JoinColumn
    private Warehouse warehouse;

    @Builder
    public Item(Long id, String externalId, boolean addedOrUpdated, ItemType itemType, Long quantity, Warehouse warehouse) {
        super(id, externalId, addedOrUpdated);
        this.itemType = itemType;
        this.quantity = quantity;
        this.warehouse = warehouse;
    }
}
