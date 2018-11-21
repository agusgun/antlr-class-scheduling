package com.classscheduling.models;

import jdk.internal.org.objectweb.asm.ClassReader;

import java.util.ArrayList;

public class ScheduleCell {
    private ArrayList<Classroom> listOfAvailableClassrooms;
    private ArrayList<Lecturer> listOfAvailableLecturers;
    private ArrayList<ScheduledLecture> listOfScheduledLectures;


    public ScheduleCell() {
        this.listOfAvailableClassrooms = new ArrayList<>();
        this.listOfAvailableLecturers = new ArrayList<>();
        this.listOfScheduledLectures = new ArrayList<>();
    }

    public void setListOfAvailableClassrooms(ArrayList<Classroom> listOfAvailableClassrooms) {
        this.listOfAvailableClassrooms = new ArrayList<>(listOfAvailableClassrooms);
    }

    public void setListOfAvailableLecturers(ArrayList<Lecturer> listOfAvailableLecturers) {
        this.listOfAvailableLecturers = new ArrayList<>(listOfAvailableLecturers);
    }

    public ArrayList<Classroom> getListOfAvailableClassrooms() {
        return listOfAvailableClassrooms;
    }

    public ArrayList<Lecturer> getListOfAvailableLecturers() {
        return listOfAvailableLecturers;
    }

    // return true if success to assign lecture
    public boolean assignLectureWithPreference(ArrayList<Lecture> listOfLecture) {
        ArrayList<Classroom> tempListOfAvailableClassrooms = new ArrayList<>(this.listOfAvailableClassrooms);
        ArrayList<Lecturer> tempListOfAvailableLecturers = new ArrayList<>(this.listOfAvailableLecturers);

        ArrayList<Classroom> matchedListOfClassrooms = new ArrayList<>();
        ArrayList<Lecturer> matchedListOfLecturers = new ArrayList<>();

        // Check all prefered lecture are assigned
        for (int i = 0; i < listOfLecture.size(); i++) {
            Classroom matchClassroom = findMatchClassroom(listOfLecture.get(i), tempListOfAvailableClassrooms);

            if (matchClassroom == null) {
                return false;
            }

            Lecturer matchLecturer = findMatchLecturer(listOfLecture.get(i), tempListOfAvailableLecturers);

            if (matchLecturer == null) {
                return false;
            }
            tempListOfAvailableClassrooms.remove(matchClassroom);
            tempListOfAvailableLecturers.remove(matchLecturer);

            matchedListOfClassrooms.add(matchClassroom);
            matchedListOfLecturers.add(matchLecturer);
        }

        // If correct assignment
        for (int i = 0; i < matchedListOfClassrooms.size(); i++) {
            listOfScheduledLectures.add(new ScheduledLecture(matchedListOfClassrooms.get(i), listOfLecture.get(i), matchedListOfLecturers.get(i)));
        }

        return true;
    }

    // return true if success to assign lecture
    public boolean assignLecture(Lecture lecture) {
        Classroom matchClassroom = findMatchClassroom(lecture);

        if (matchClassroom == null) {
            return false;
        }

        Lecturer matchLecturer = findMatchLecturer(lecture);

        if (matchLecturer == null) {
            return false;
        }

        listOfScheduledLectures.add(new ScheduledLecture(matchClassroom, lecture, matchLecturer));
        this.listOfAvailableClassrooms.remove(matchClassroom);
        this.listOfAvailableLecturers.remove(matchLecturer);

        return true;
    }

    public boolean isAllowed(ArrayList<ArrayList<String>> constraints, Lecture lecture) {
        boolean found = false;
        int i = 0;

        while (!found && i < constraints.size()) {
            int j = 0;

            while (!found && j < this.listOfScheduledLectures.size()) {

                if (constraints.get(i).contains(lecture.getLectureName()) && constraints.get(i).contains(this.listOfScheduledLectures.get(j).getLecture().getLectureName())) {
                    found = true;
                } else {
                    j++;
                }
            }
            i++;
        }

        return !found;
    }

    private Lecturer findMatchLecturer(Lecture lecture) {
        boolean found = false;
        int i = 0;

        while (!found && i < this.listOfAvailableLecturers.size()) {
            if (this.listOfAvailableLecturers.get(i).getGroup().equals(lecture.getGroup())) {
                found = true;
            } else {
                i++;
            }
        }

        if (found) {
            return this.listOfAvailableLecturers.get(i);
        } else {
            return null;
        }
    }

    private Lecturer findMatchLecturer(Lecture lecture, ArrayList<Lecturer> listOfLecturer) {
        boolean found = false;
        int i = 0;

        while (!found && i < listOfLecturer.size()) {
            if (listOfLecturer.get(i).getGroup().equals(lecture.getGroup())) {
                found = true;
            } else {
                i++;
            }
        }

        if (found) {
            return listOfLecturer.get(i);
        } else {
            return null;
        }
    }

    private Classroom findMatchClassroom(Lecture lecture) {
        boolean found = false;

        int i = 0;
        while (!found && i < this.listOfAvailableClassrooms.size()) {
            if (lecture.getCapacity() == this.listOfAvailableClassrooms.get(i).getCapacity() && areFacilitiesEnough(lecture, this.listOfAvailableClassrooms.get(i))) {
                found = true;
            } else {
                i++;
            }
        }

        if (found) {
            return this.listOfAvailableClassrooms.get(i);
        } else {
            return null;
        }
    }

    private Classroom findMatchClassroom(Lecture lecture, ArrayList<Classroom> listOfClassrooms) {
        boolean found = false;

        int i = 0;
        while (!found && i < listOfClassrooms.size()) {
            if (lecture.getCapacity() == listOfClassrooms.get(i).getCapacity() && areFacilitiesEnough(lecture, listOfClassrooms.get(i))) {
                found = true;
            } else {
                i++;
            }
        }

        if (found) {
            return listOfClassrooms.get(i);
        } else {
            return null;
        }
    }

    private boolean areFacilitiesEnough(Lecture lecture, Classroom classroom) {
        boolean enough = true;
        int i = 0;

        while (enough && i < lecture.getFacilityList().size()) {
            int j = 0;
            boolean match = false;

            while (!match && j < classroom.getFacilityList().size()) {
                if (lecture.getFacility(i).getFacilityName().equals(classroom.getFacility(j).getFacilityName()) && lecture.getFacility(i).getAmount() == classroom.getFacility(j).getAmount()) {
                    match = true;
                } else {
                    j++;
                }
            }

            if (!match) {
                enough = false;
            } else {
                i++;
            }
        }

        return enough;
    }

    private class ScheduledLecture {
        private Classroom classroom;
        private Lecture lecture;
        private Lecturer lecturer;

        ScheduledLecture(Classroom classroom, Lecture lecture, Lecturer lecturer) {
            this.classroom = classroom;
            this.lecture = lecture;
            this.lecturer = lecturer;
        }

        public Classroom getClassroom() {
            return classroom;
        }

        public void setClassroom(Classroom classroom) {
            this.classroom = classroom;
        }

        public Lecture getLecture() {
            return lecture;
        }

        public void setLecture(Lecture lecture) {
            this.lecture = lecture;
        }

        public Lecturer getLecturer() {
            return lecturer;
        }

        public void setLecturer(Lecturer lecturer) {
            this.lecturer = lecturer;
        }
    }
}
