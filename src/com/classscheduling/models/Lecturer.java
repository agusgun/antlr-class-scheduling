package com.classscheduling.models;

public class Lecturer {
    private final int rows = 11; // 07.00-17.00
    private final int columns = 5; // Mon-Fri
    private String lecturerName;
    private boolean[][] lecturerAvailability;
    private String group;

    public Lecturer() {
        this.lecturerName = "";
        this.group = "";
        this.lecturerAvailability = new boolean[rows][columns]; // all false by default
    }

    public Lecturer(String lecturerName, boolean[][] lecturerAvailability) {
        this.lecturerName = lecturerName;
        this.group = "";
        this.lecturerAvailability = lecturerAvailability;
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

    public void setLecturerAvailableByDayString(String dayString) {
        int day = getDayFromString(dayString);
        System.out.println(dayString);
        for (int i = 0; i < rows; i++) {
            lecturerAvailability[i][day] = true;
        }
    }

    public void setLecturerUnavailableByDayString(String dayString) {
        int day = getDayFromString(dayString);
        for (int i = 0; i < rows; i++) {
            lecturerAvailability[i][day] = false;
        }
    }

    public void setLecturerAvailableByDayTimeString(String dayString, String timeString) {
        int day = getDayFromString(dayString);
        int time = getTimeFromString(timeString);
        lecturerAvailability[time][day] = true;
    }

    public void setLecturerUnavailableByDayTimeString(String dayString, String timeString) {
        int day = getDayFromString(dayString);
        int time = getTimeFromString(timeString);
        lecturerAvailability[time][day] = false;
    }

    public int getDayFromString(String day) {
        switch (day) {
            case "MONDAY":
                return 0;
            case "TUESDAY":
                return 1;
            case "WEDNESDAY":
                return 2;
            case "THURSDAY":
                return 3;
            case "FRIDAY":
                return 4;
        }
        return -1;
    }

    public int getTimeFromString(String time) {
        switch (time) {
            case "07:00":
                return 0;
            case "08:00":
                return 1;
            case "09:00":
                return 2;
            case "10:00":
                return 3;
            case "11:00":
                return 4;
            case "12:00":
                return 5;
            case "13:00":
                return 6;
            case "14:00":
                return 7;
            case "15:00":
                return 8;
            case "16:00":
                return 9;
            case "17:00":
                return 10;
        }
        return -1;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
