package com.lodz.p.edu.iap.lab.wmsemp.entity.warehouse;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Status {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String code;
    @NonNull
    private String name;
}