package com.classscheduling.models;

import java.util.ArrayList;

public class Preference {
    private ArrayList<ArrayList<String>> cooccurLecturesList;

    public Preference() {
        this.cooccurLecturesList = new ArrayList<>();
    }

    public void setCooccurLectures(ArrayList<String> cooccurLectures) {
        this.cooccurLecturesList.add(cooccurLectures);
    }

    public ArrayList<String> getCooccurLectures(int index) {
        return this.cooccurLecturesList.get(index);
    }

    public ArrayList<ArrayList<String>> getCooccurLecturesList() {
        return cooccurLecturesList;
    }

    public void setCooccurLecturesList(ArrayList<ArrayList<String>> cooccurLecturesList) {
        this.cooccurLecturesList = cooccurLecturesList;
    }
}
