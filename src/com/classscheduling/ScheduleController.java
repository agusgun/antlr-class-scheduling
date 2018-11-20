package com.classscheduling;

import com.classscheduling.models.*;

import java.util.ArrayList;

public class ScheduleController {
    private ArrayList<Classroom> classroomList;
    private ArrayList<Lecture> lectureList;
    private ArrayList<Lecturer> lecturerList;
    private Preference preference;
    private Constraint constraint;
    private Schedule schedule;
    private ArrayList<ScheduleCell> scheduleCellList;

    public ScheduleController() {
        this.classroomList = new ArrayList<>();
        this.lectureList = new ArrayList<>();
        this.lecturerList = new ArrayList<>();
        this.preference = new Preference();
        this.constraint = new Constraint();
        this.schedule = new Schedule();
        this.scheduleCellList = new ArrayList<>();
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

    public Preference getPreference() {
        return preference;
    }

    public void setPreference(Preference preference) {
        this.preference = preference;
    }

    public Constraint getConstraint() {
        return constraint;
    }

    public void setConstraint(Constraint constraint) {
        this.constraint = constraint;
    }

    private void

    private void applyPreference() {

        for (int i = 0; i < preference.getCooccurLecturesList().size(); i++) {
            ArrayList<String> preferenceListName = new ArrayList<>();
            for (int j = 0; j < preference.getCooccurLectures(i).size(); j++) {
                preferenceListName.add(preference.getCooccurLectures(i).get(j));
            }



//            Lecture currentLecture = findLectureWithName(preference.getCooccurLectures(i).get(0));
//            this.lectureList.remove(currentLecture);
//
//            Classroom matchClassroom = findMatchClassroom(currentLecture);
//            this.classroomList.remove(matchClassroom);
//
//            String newClassroomName = matchClassroom.getClassroomName();
//
//            Lecturer currentLecturer = findMatchLecturer(currentLecture);
//
//            String newLecturerName = currentLecturer.getLecturerName();
//            boolean[][] newLecturerAvailability = currentLecturer.getLecturerAvailability();
//
//            for (int j = 1; j < preference.getCooccurLectures(i).size(); j++) {
//                newLectureName += ", " + preference.getCooccurLectures(i).get(j);
//
//                currentLecture = findLectureWithName(preference.getCooccurLectures(i).get(j));
//                this.lectureList.remove(currentLecture);
//
//                currentLecturer = findMatchLecturer(currentLecture);
//                newLecturerName += ", " + currentLecturer.getLecturerName();
//                newLecturerAvailability = getAvailabilityIntersection(newLecturerAvailability, currentLecturer.getLecturerAvailability());
//
//                matchClassroom = findMatchClassroom(currentLecture);
//                this.classroomList.remove(matchClassroom);
//
//                newClassroomName += ", " + matchClassroom.getClassroomName();
//            }
//
//            ScheduleCell sc = new ScheduleCell();
//            sc.setClassroom(new Classroom(newClassroomName));
//            sc.setLecture(new Lecture(newLectureName));
//            sc.setLecturer(new Lecturer(newLecturerName, newLecturerAvailability));
//            this.scheduleCellList.add(sc);
        }
    }

//    private boolean[][] getAvailabilityIntersection(boolean[][] a1, boolean[][] a2) {
//        boolean[][] availability = new boolean[a1.length][a1[0].length];
//
//        for(int i = 0; i < a1.length; i++) {
//            for(int j = 0; j < a1[i].length; j++) {
//                availability[i][j] = a1[i][j] && a2[i][j];
//            }
//        }
//
//        return availability;
//    }
//
//    private Lecturer findMatchLecturer(Lecture lecture) {
//        boolean found = false;
//        int i = 0;
//
//        while(!found && i < this.lecturerList.size()) {
//            if(this.lecturerList.get(i).getGroup().equals(lecture.getGroup())) {
//                found = true;
//            } else {
//                i++;
//            }
//        }
//
//        if(found) {
//            return this.lecturerList.get(i);
//        } else {
//            return null;
//        }
//    }
//
//    private Lecture findLectureWithName(String lectureName) {
//        boolean found = false;
//        int i = 0;
//
//        while(!found && i < this.lectureList.size()) {
//            if(this.lectureList.get(i).getLectureName().equals(lectureName)) {
//                found = true;
//            } else {
//                i++;
//            }
//        }
//
//        if(found) {
//            return this.lectureList.get(i);
//        } else {
//            return null;
//        }
//    }
//
//    private Classroom findMatchClassroom(Lecture lecture) {
//        boolean found = false;
//
//        int i = 0;
//        while (!found && i < this.classroomList.size()) {
//            if (lecture.getCapacity() == this.classroomList.get(i).getCapacity() && areFacilitiesEnough(lecture, this.classroomList.get(i))) {
//                found = true;
//            } else {
//                i++;
//            }
//        }
//
//        if(found) {
//            return this.classroomList.get(i);
//        } else {
//            return null;
//        }
//    }
//
//    private boolean areFacilitiesEnough(Lecture lecture, Classroom classroom) {
//        boolean enough = true;
//        int i = 0;
//
//        while (enough && i < lecture.getFacilityList().size()) {
//            int j = 0;
//            boolean match = false;
//
//            while (!match && j < classroom.getFacilityList().size()) {
//                if(lecture.getFacility(i).getFacilityName().equals(classroom.getFacility(j).getFacilityName()) && lecture.getFacility(i).getAmount() == classroom.getFacility(j).getAmount()) {
//                    match = true;
//                } else {
//                    j++;
//                }
//            }
//
//            if(!match) {
//                enough = false;
//            } else {
//                i++;
//            }
//        }
//
//        return enough;
//    }
}
