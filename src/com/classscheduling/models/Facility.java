package com.classscheduling.models;

public class Facility {
    private String facilityName;
    private int amount;

    public Facility() {
        this.facilityName = "";
        this.amount = 0;
    }

//    @Override
//    public boolean equals(Object other) {
//        if(!(other instanceof Facility)) {
//            return false;
//        }
//
//        Facility otherFacility = (Facility) other;
//        return this.facilityName.equals(otherFacility.getFacilityName()) && this.amount == otherFacility.getAmount();
//    }

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
