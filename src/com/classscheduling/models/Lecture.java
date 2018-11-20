package com.classscheduling.models;

import java.util.ArrayList;

public class Lecture {
    private final int defaultCapacity = 50;
    private String lectureName;
    private int capacity;
    private ArrayList<Facility> facilityList;
    private String group;

    public Lecture(String lectureName) {
        this.lectureName = lectureName;
        this.capacity = defaultCapacity;
        this.facilityList = new ArrayList<>();
        this.group = "";
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFacility(Facility facility) {
        this.facilityList.add(facility);
    }

    public Facility getFacility(int index) {
        return this.facilityList.get(index);
    }

    public ArrayList<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(ArrayList<Facility> facilityList) {
        this.facilityList = facilityList;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
