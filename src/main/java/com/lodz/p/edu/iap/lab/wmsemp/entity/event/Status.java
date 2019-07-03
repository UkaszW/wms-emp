package com.lodz.p.edu.iap.lab.wmsemp.entity.event;

public enum Status {

    SUBMIT_FOR_APPROVAL("Submit for approval"),
    APPROVED("Approved"),
    REJECTED("Rejected");

    private String name;

    private Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
