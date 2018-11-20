package com.classscheduling.models;

import java.util.ArrayList;

public class Classroom {
    private final int defaultCapacity = 50;
    private String classroomName;
    private int capacity;
    private ArrayList<Facility> facilityList;

    public Classroom() {
        this.classroomName = "";
        this.capacity = defaultCapacity;
        this.facilityList = new ArrayList<>();
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
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
}
