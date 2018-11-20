package com.classscheduling.models;

public class Facility {
    private String facilityName;
    private int amount;

    public Facility(String facilityName, int amount) {
        this.facilityName = facilityName;
        this.amount = amount;
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
