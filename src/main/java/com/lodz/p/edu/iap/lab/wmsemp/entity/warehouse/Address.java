package com.lodz.p.edu.iap.lab.wmsemp.entity.warehouse;

import com.lodz.p.edu.iap.lab.wmsemp.entity.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Address extends BaseEntity {

    private String street;
    private Long number;
    private String postalCode;
    private String city;
}
