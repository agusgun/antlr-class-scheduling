package com.classscheduling.models;

import java.util.ArrayList;

public class Lecture {
    private final int defaultCapacity = 50;
    private String lectureName;
    private int capacity;
    private ArrayList<Facility> facilityList;
    private String group;

    public Lecture() {
        this.lectureName = "";
        this.capacity = defaultCapacity;
        this.facilityList = new ArrayList<>();
        this.group = "";
    }

    public boolean equals(Object other) {
        if (!(other instanceof Lecture)) {
            return false;
        }
        Lecture otherLecture = (Lecture) other;
        return this.lectureName.equals(otherLecture.getLectureName()) &&
                this.capacity == otherLecture.getCapacity() &&
                areFacilityListsEqual(otherLecture.getFacilityList()) &&
                this.group.equals(otherLecture.getGroup());
    }

    private boolean areFacilityListsEqual(ArrayList<Facility> otherFacilityList) {
        if(this.facilityList.size() != otherFacilityList.size()) {
            return false;
        }

        boolean match = true;
        int i = 0;
        while(match && i < this.facilityList.size()) {
            if(this.facilityList.contains(otherFacilityList.get(i))) {
                i++;
            } else {
                match = false;
            }
        }

         return match;
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
