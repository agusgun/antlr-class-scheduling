package com.classscheduling;

import com.classscheduling.models.*;

import java.util.ArrayList;

public class ScheduleController {
    private ArrayList<Classroom> classroomList;
    private ArrayList<Lecture> lectureList;
    private ArrayList<Lecturer> lecturerList;
    private ArrayList<Preference> preferenceList;
    private ArrayList<Constraint> constraintList;

    public ScheduleController() {
        this.classroomList = new ArrayList<>();
        this.lectureList = new ArrayList<>();
        this.lecturerList = new ArrayList<>();
        this.preferenceList = new ArrayList<>();
        this.constraintList = new ArrayList<>();
    }

    public ArrayList<Classroom> getClassroomList() {
        return classroomList;
    }

    public void setClassroomList(ArrayList<Classroom> classroomList) {
        this.classroomList = classroomList;
    }

    public ArrayList<Lecture> getLectureList() {
        return lectureList;
    }

    public void setLectureList(ArrayList<Lecture> lectureList) {
        this.lectureList = lectureList;
    }

    public ArrayList<Lecturer> getLecturerList() {
        return lecturerList;
    }

    public void setLecturerList(ArrayList<Lecturer> lecturerList) {
        this.lecturerList = lecturerList;
    }

    public ArrayList<Preference> getPreferenceList() {
        return preferenceList;
    }

    public void setPreferenceList(ArrayList<Preference> preferenceList) {
        this.preferenceList = preferenceList;
    }

    public ArrayList<Constraint> getConstraintList() {
        return constraintList;
    }

    public void setConstraintList(ArrayList<Constraint> constraintList) {
        this.constraintList = constraintList;
    }
}
