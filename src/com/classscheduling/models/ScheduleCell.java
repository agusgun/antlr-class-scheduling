package com.classscheduling.models;

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

    // return true if success to assign lecture
    public boolean assignLectureWithPreference(ArrayList<String> listOfLectureName) {

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

    private boolean isAllowed(ArrayList<ArrayList<String>> constraints, Lecture lecture) {
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
        }

        return found;
    }

    private boolean[][] getAvailabilityIntersection(boolean[][] a1, boolean[][] a2) {
        boolean[][] availability = new boolean[a1.length][a1[0].length];

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                availability[i][j] = a1[i][j] && a2[i][j];
            }
        }

        return availability;
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

//    private Lecture findLectureWithName(String lectureName) {
//        boolean found = false;
//        int i = 0;
//
//        while(!found && i < this.listOfValidLectures.size()) {
//            if(this.listOfValidLectures.get(i).getLectureName().equals(lectureName)) {
//                found = true;
//            } else {
//                i++;
//            }
//        }
//
//        if(found) {
//            return this.listOfValidLectures.get(i);
//        } else {
//            return null;
//        }
//    }

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

    //    public void setProperties(Classroom classroom, Lecture lecture, Lecturer lecturer) {
//        this.classroom = classroom;
//        this.lecture = lecture;
//        this.lecturer = lecturer;
//    }
//
//    public Classroom getClassroom() {
//        return classroom;
//    }
//
//    public void setClassroom(Classroom classroom) {
//        this.classroom = classroom;
//    }
//
//    public Lecture getLecture() {
//        return lecture;
//    }
//
//    public void setLecture(Lecture lecture) {
//        this.lecture = lecture;
//    }
//
//    public Lecturer getLecturer() {
//        return lecturer;
//    }
//
//    public void setLecturer(Lecturer lecturer) {
//        this.lecturer = lecturer;
//    }
//
//    public String toString() {
//        return classroom.getClassroomName() + "\t" + lecture.getLectureName() + "\t" + lecturer.getLecturerName();
//    }

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
