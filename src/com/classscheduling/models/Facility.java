package com.classscheduling.models;

public class Facility {
    private String facilityName;
    private int amount;

    public Facility() {
        this.facilityName = "";
        this.amount = 0;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
