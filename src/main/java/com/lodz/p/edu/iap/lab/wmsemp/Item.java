package com.lodz.p.edu.iap.lab.wmsemp;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String code;

    @NonNull
    private String name;

    @NonNull
    private Long quantity;
}
