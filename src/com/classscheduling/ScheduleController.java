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
    private int row = 11;
    private int col = 5;

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
        this.classroomList = new ArrayList<>(classroomList);
    }

    public ArrayList<Lecture> getLectureList() {
        return lectureList;
    }

    public void setLectureList(ArrayList<Lecture> lectureList) {
        this.lectureList = new ArrayList<>(lectureList);
    }

    public ArrayList<Lecturer> getLecturerList() {
        return lecturerList;
    }

    public void setLecturerList(ArrayList<Lecturer> lecturerList) {
        this.lecturerList = new ArrayList<>(lecturerList);
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

    public void printAll() {
        System.out.println("List of Classroom:");
        for (int i = 0; i < classroomList.size(); i++) {
            Classroom classroom = classroomList.get(i);
            System.out.println(classroom.getClassroomName() + " " + classroom.getCapacity());
            System.out.println("Facility List:");
            ArrayList<Facility> classroomFacilityList = classroom.getFacilityList();
            if (classroomFacilityList.size() == 0) {
                System.out.println("No Facility Found");
            } else {
                for (int j = 0; j < classroomFacilityList.size(); j++) {
                    System.out.println(classroomFacilityList.get(j).getFacilityName() + " " + Integer.toString(classroomFacilityList.get(j).getAmount()));
                }
            }

        }

        System.out.println("List of Lecture:");
        for (int i = 0; i < lectureList.size(); i++) {
            Lecture lecture = lectureList.get(i);
            System.out.println(lecture.getLectureName() + " " + lecture.getCapacity() + " " + lecture.getGroup());
            System.out.println("Facility List:");
            ArrayList<Facility> lectureFacilityList = lecture.getFacilityList();
            if (lectureFacilityList.size() == 0) {
                System.out.println("No Facility Found");
            } else {
                for (int j = 0; j < lectureFacilityList.size(); j++) {
                    System.out.println(lectureFacilityList.get(j).getFacilityName() + " " + Integer.toString(lectureFacilityList.get(j).getAmount()));
                }
            }
        }

        System.out.println("List of Lecturer:");
        for (int i = 0; i < lecturerList.size(); i++) {
            Lecturer lecturer = lecturerList.get(i);
            System.out.println(lecturer.getLecturerName() + " " + lecturer.getGroup());
            for (int timeIterator = 0; timeIterator < 11; timeIterator++) {
                for (int dayIterator = 0; dayIterator < 5; dayIterator++) {
                    System.out.print(lecturer.getLecturerAvailabilityAt(timeIterator, dayIterator) + " ");
                }
                System.out.println();
            }
        }

        System.out.println("List of Preference:");
        for (int i = 0; i < preference.getCooccurLecturesList().size(); i++) {
            ArrayList<String> onePreferenceList = preference.getCooccurLectures(i);
            for (int j = 0; j < onePreferenceList.size(); j++) {
                System.out.print(onePreferenceList.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println("List of Constraint:");
        for (int i = 0; i < constraint.getSeparatedLecturesList().size(); i++) {
            ArrayList<String> oneConstraintList = constraint.getSeparatedLectures(i);
            for (int j = 0; j < oneConstraintList.size(); j++) {
                System.out.print(oneConstraintList.get(j) + " ");
            }
            System.out.println();
        }
    }

    // After Set All Classroom, Lecture, Lecturer, Preference, Constraint, Call this from listener
    public void init() {
        // Init Classroom
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ScheduleCell scheduleCell = new ScheduleCell();
                scheduleCell.setListOfAvailableClassrooms(classroomList);
                scheduleCellList.add(scheduleCell);
            }
        }

//        // Test Copy Classroom
////        scheduleCellList.get(1).getListOfAvailableClassrooms().remove(2);
//        for (int i = 0; i < 2; i++) {
//            ArrayList<Classroom> tempClassroom;
//            tempClassroom = scheduleCellList.get(i).getListOfAvailableClassrooms();
//            for (int j = 0; j < tempClassroom.size(); j++) {
//                System.out.println(Integer.toString(i) + " " + tempClassroom.get(j).getClassroomName());
//            }
//        }

        //  Init Lecturer
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ArrayList<Lecturer> tempLecturer = new ArrayList<>();
                for (int k = 0; k < lecturerList.size(); k++) {
                    if (lecturerList.get(k).getLecturerAvailabilityAt(i, j)) {
                        tempLecturer.add(lecturerList.get(k));
                    }
                }
                scheduleCellList.get(i * 5 + j).setListOfAvailableLecturers(tempLecturer);
            }
        }

        // Test Copy Lecturer
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                ArrayList<Lecturer> tempLecturer;
//                tempLecturer = scheduleCellList.get(i * 5 + j).getListOfAvailableLecturers();
//                for (int k = 0; k < tempLecturer.size(); k++) {
//                    System.out.print(tempLecturer.get(k).getLecturerName() + " ");
//                }
//                System.out.println(Integer.toString(i) + " " + Integer.toString(j));
//            }
//        }
    }

    public void applyPreference() {
        Lecturer tempLecturer = new Lecturer();
        for (int i = 0; i < preference.getCooccurLecturesList().size(); i++) {
            ArrayList<Lecture> listOfPreferenceLecture = new ArrayList<>();
            for (int j = 0; j < preference.getCooccurLectures(i).size(); j++) {
                listOfPreferenceLecture.add(findLectureWithName(preference.getCooccurLectures(i).get(j)));
            }

            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    boolean assigned = scheduleCellList.get(j * 5 + k).assignLectureWithPreference(listOfPreferenceLecture);
                    if (assigned) {
                        for (int l = 0; l < listOfPreferenceLecture.size(); l++) {
                            System.out.println("Assigned" + listOfPreferenceLecture.get(l).getLectureName() + " " + tempLecturer.getTimeFromInt(j) + " " + tempLecturer.getDayFromInt(k));
                            lectureList.remove(listOfPreferenceLecture.get(l));
                        }
                    }
                }
            }
        }
    }

    // Assign lecture without preference (can with constraint)
    public void applyNormal() {
        Lecturer tempLecturer = new Lecturer();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < lectureList.size(); k++) {
                    Lecture tempLecture;
                    tempLecture = lectureList.get(k);
                    // Apply Constraint
                    boolean isAllowed = scheduleCellList.get(i * 5 + j).isAllowed(constraint.getSeparatedLecturesList(), tempLecture);
                    if (isAllowed) {
                        // If Allowed
                        boolean assigned = scheduleCellList.get(i * 5 + j).assignLecture(tempLecture);
                        if (assigned) {
                            System.out.println("Assigned " + lectureList.get(k).getLectureName() + " " + tempLecturer.getTimeFromInt(i) + " " + tempLecturer.getDayFromInt(j));
                            lectureList.remove(tempLecture);
                        }
                    }
                }
            }
        }
    }

    private Lecture findLectureWithName(String lectureName) {
        boolean found = false;
        int i = 0;

        while(!found && i < this.lectureList.size()) {
            if(this.lectureList.get(i).getLectureName().equals(lectureName)) {
                found = true;
            } else {
                i++;
            }
        }

        if(found) {
            return this.lectureList.get(i);
        } else {
            return null;
        }
    }
}
