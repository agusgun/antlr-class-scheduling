package com.classscheduling.models;

public class Lecturer {
    private final int rows = 11; // 07.00-17.00
    private final int columns = 5; // Mon-Sat
    private String lecturerName;
    private boolean[][] lecturerAvailability;
    private String group;

    public Lecturer(String lecturerName) {
        this.lecturerName = lecturerName;
        this.group = "";
        this.lecturerAvailability = new boolean[rows][columns]; // all false by default
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public boolean[][] getLecturerAvailability() {
        return lecturerAvailability;
    }

    public void setAvailable(int row, int column) {
        this.lecturerAvailability[row][column] = true;
    }

    public void setUnavailable(int row, int column) {
        this.lecturerAvailability[row][column] = false;
    }

    public boolean getLecturerAvailabilityAt(int row, int column) {
        return this.lecturerAvailability[row][column];
    }

    public void setLecturerAvailability(boolean[][] lecturerAvailability) {
        this.lecturerAvailability = lecturerAvailability;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
