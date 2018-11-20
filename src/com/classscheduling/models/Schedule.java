package com.classscheduling.models;

import java.util.ArrayList;

public class Schedule {
    private final int rows = 11; // 07.00-17.00
    private final int columns = 5; // Mon-Sat
    private ArrayList<ArrayList<ScheduleCell>> schedule;

    public Schedule() {
        this.schedule = new ArrayList<>();
        for(int i = 0; i < rows; i++) {
            this.schedule.add(new ArrayList<>());
            for(int j = 0; j < columns; j++) {
                this.schedule.get(i).add(new ScheduleCell());
            }
        }
    }

    public void setSchedule(ArrayList<ArrayList<ScheduleCell>> schedule) {
        this.schedule = schedule;
    }

    public ArrayList<ArrayList<ScheduleCell>> getSchedule() {
        return this.schedule;
    }

    public void setScheduleCell(int row, int column, ScheduleCell scheduleCell) {
        this.schedule.get(row).set(column, scheduleCell);
    }

    public ScheduleCell getScheduleCell(int row, int column) {
        return this.schedule.get(row).get(column);
    }

    public String toString() {
        StringBuilder text = new StringBuilder();
        for(int i = 0; i < rows; i++) {
            StringBuilder text_row = new StringBuilder(this.schedule.get(i).get(0).toString());;
            for(int j = 1; j < columns; j++) {
                text_row.append("\t").append(this.schedule.get(i).get(j).toString());
            }
            text.append(text_row).append("\n");
        }

        return String.valueOf(text);
    }
}
