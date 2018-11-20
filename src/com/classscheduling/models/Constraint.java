package com.classscheduling.models;

import java.util.ArrayList;

public class Constraint {
    private ArrayList<ArrayList<String>> separatedLecturesList;

    public Constraint() {
        this.separatedLecturesList = new ArrayList<>();
    }

    public void setSeparatedLectures(ArrayList<String> separatedLectures) {
        this.separatedLecturesList.add(separatedLectures);
    }

    public ArrayList<String> getSeparatedLectures(int index) {
        return this.separatedLecturesList.get(index);
    }

    public ArrayList<ArrayList<String>> getSeparatedLecturesList() {
        return separatedLecturesList;
    }

    public void setSeparatedLecturesList(ArrayList<ArrayList<String>> separatedLecturesList) {
        this.separatedLecturesList = separatedLecturesList;
    }
}
