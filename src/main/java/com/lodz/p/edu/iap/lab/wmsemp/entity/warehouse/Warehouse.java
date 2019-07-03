package com.lodz.p.edu.iap.lab.wmsemp.entity.warehouse;

import com.lodz.p.edu.iap.lab.wmsemp.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Warehouse extends BaseEntity {

    @NonNull
    private String code;
    @NonNull
    private String name;
    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Address address;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "warehouse")
    private Set<Item> items;
}
