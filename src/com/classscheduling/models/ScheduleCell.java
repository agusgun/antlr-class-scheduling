package com.classscheduling.models;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Collections;

public class ScheduleCell {
    private ArrayList<Classroom> listOfAvailableClassrooms;
    private ArrayList<Lecturer> listOfAvailableLecturers;
    private ArrayList<ScheduledLecture> listOfScheduledLectures;
    private int day;
    private int time;


    public ScheduleCell(int day, int time) {
        this.day = day;
        this.time = time;
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

    public ArrayList<ScheduledLecture> getListOfScheduledLectures() {
        return this.listOfScheduledLectures;
    }

    public ArrayList<Classroom> getListOfAvailableClassrooms() {
        return listOfAvailableClassrooms;
    }

    public ArrayList<Lecturer> getListOfAvailableLecturers() {
        return listOfAvailableLecturers;
    }
    private void removeElement(ArrayList<Classroom> arr, int removedIdx) {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.size() - 1 - removedIdx);
    }
    private void removeLecturer(ArrayList<Lecturer> arr, int removedIdx) {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.size() - 1 - removedIdx);
    }
    // return true if success to assign lecture
    public boolean assignLectureWithPreference(ArrayList<Lecture> preferredListOfLecture) {
        ArrayList<Classroom> tempListOfAvailableClassrooms = new ArrayList<>(this.listOfAvailableClassrooms);
        ArrayList<Lecturer> tempListOfAvailableLecturers = new ArrayList<>(this.listOfAvailableLecturers);

        ArrayList<Classroom> matchedListOfClassrooms = new ArrayList<>();
        ArrayList<Lecturer> matchedListOfLecturers = new ArrayList<>();

        Collections.sort(tempListOfAvailableClassrooms);

        // Check all prefered lecture are assigned
        for (int i = 0; i < preferredListOfLecture.size(); i++) {
            Classroom matchClassroom = findMatchClassroom(preferredListOfLecture.get(i), tempListOfAvailableClassrooms);

            if (matchClassroom == null) {
                return false;
            }

            Lecturer matchLecturer = findMatchLecturer(preferredListOfLecture.get(i), tempListOfAvailableLecturers);

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
            Classroom dumm = matchedListOfClassrooms.get(i);
            Lecturer lect = matchedListOfLecturers.get(i);
            listOfScheduledLectures.add(new ScheduledLecture(dumm,
                    preferredListOfLecture.get(i),
                    lect));

            listOfAvailableClassrooms.remove(dumm);
            listOfAvailableLecturers.remove(lect);
//            boolean found = false;
//            int x = 0;
//            while (x < listOfAvailableClassrooms.size() && !found) {
//                if (listOfAvailableClassrooms.get(i) == dumm) {
//                    found = true;
//                } else {
//                    x++;
//                }
//            }
//
//            if (found) {
//                removeElement(listOfAvailableClassrooms, x);
//            }
//
//            found = false;
//            x = 0;
//
//            while (x < listOfAvailableLecturers.size() && !found) {
//                if (listOfAvailableLecturers.get(i) == lect) {
//                    found = true;
//                } else {
//                    x++;
//                }
//            }
//
//            if (found) {
//                removeLecturer(listOfAvailableLecturers, x);
//            }
        }

        return true;
    }

    // return true if success to assign lecture
    public boolean assignLecture(Lecture lecture) {
        Collections.sort(this.listOfAvailableClassrooms);
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
            if (lecture.getCapacity() <= this.listOfAvailableClassrooms.get(i).getCapacity() && areFacilitiesEnough(lecture, this.listOfAvailableClassrooms.get(i))) {
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
            if (lecture.getCapacity() <= listOfClassrooms.get(i).getCapacity() && areFacilitiesEnough(lecture, listOfClassrooms.get(i))) {
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

    public String toString() {
        String text = getDayFromInt(this.day) + " (" + getTimeFromInt(this.time) + "-" + getTimeFromInt(this.time + 1) + ")" + "\n";

        if(listOfScheduledLectures.size() > 0) {
            for (int i = 0; i < listOfScheduledLectures.size(); i++) {
                text += (i + 1) + ". " + listOfScheduledLectures.get(i).toString() + "\n";
            }
        } else {
            text += "No lecture assigned." + "\n";
        }

        return text;
    }

    public String getDayFromInt(int day) {
        switch (day) {
            case 0:
                return "MONDAY";
            case 1:
                return "TUESDAY";
            case 2:
                return "WEDNESDAY";
            case 3:
                return "THURSDAY";
            case 4:
                return "FRIDAY";
        }
        return "NOT FOUND";
    }

    public String getTimeFromInt(int time) {
        switch (time) {
            case 0:
                return "07:00";
            case 1:
                return "08:00";
            case 2:
                return "09:00";
            case 3:
                return "10:00";
            case 4:
                return "11:00";
            case 5:
                return "12:00";
            case 6:
                return "13:00";
            case 7:
                return "14:00";
            case 8:
                return "15:00";
            case 9:
                return "16:00";
            case 10:
                return "17:00";
        }
        return "18.00";
    }

    private class ScheduledLecture {
        private Classroom classroom;
        private Lecture lecture;
        private Lecturer lecturer;
        private final String separator = " / ";

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

        public String toString() {
            return lecture.getLectureName() + separator + lecturer.getLecturerName() + separator + classroom.getClassroomName();
        }
    }
}
