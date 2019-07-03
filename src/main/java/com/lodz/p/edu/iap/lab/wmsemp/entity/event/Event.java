package com.lodz.p.edu.iap.lab.wmsemp.entity.event;

import com.lodz.p.edu.iap.lab.wmsemp.entity.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="action", discriminatorType = DiscriminatorType.STRING)
@Data
@NoArgsConstructor
public class Event extends BaseEntity {

    @NonNull
    private String type;
    @NonNull
    private Long objectId;
    @NonNull
    private String status;
    @NonNull
    private boolean processed = false;
    @NonNull
    private boolean accepted = false;
    @NonNull
    private boolean read = false;
    private String comment;
    @NonNull
    private Instant creationDate;
}
