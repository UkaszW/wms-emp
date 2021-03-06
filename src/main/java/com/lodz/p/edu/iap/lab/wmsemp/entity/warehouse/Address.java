package com.lodz.p.edu.iap.lab.wmsemp.entity.warehouse;

import com.lodz.p.edu.iap.lab.wmsemp.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Address extends BaseEntity {

    @NonNull
    private String street;
    @NonNull
    private Long number;
    @NonNull
    private String postalCode;
    @NonNull
    private String city;
}
