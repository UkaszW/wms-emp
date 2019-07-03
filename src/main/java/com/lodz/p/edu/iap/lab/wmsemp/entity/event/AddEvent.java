package com.lodz.p.edu.iap.lab.wmsemp.entity.event;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ADD")
@Data
@NoArgsConstructor
public class AddEvent extends Event {

    private Long quantity;
}
