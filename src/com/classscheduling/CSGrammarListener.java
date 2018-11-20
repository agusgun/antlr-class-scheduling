package com.classscheduling;

import com.classscheduling.grammar.CSGrammarBaseListener;
import com.classscheduling.grammar.CSGrammarParser;
import com.classscheduling.models.*;

import java.util.ArrayList;

public class CSGrammarListener extends CSGrammarBaseListener {

    // Classroom stuff
    ArrayList<Classroom> classroomList;
    Classroom currentClassroom;
    ArrayList<Facility> classroomFacilityList;
    Facility currentClassroomFacility;

    // Lecture stuff
    ArrayList<Lecture> lectureList;
    Lecture currentLecture;
    ArrayList<Facility> lectureFacilityList;
    Facility currentLectureFacility;

    // Lecturer stuff
    ArrayList<Lecturer> lecturerList;
    Lecturer currentLecturer;
    String dayOfDay;
    String dayOfDayTime;
    String time;

    // Preference stuff
    Preference preference;
    ArrayList<String> currentPreference;

    // Constraint stuff
    Constraint constraint;
    ArrayList<String> currentConstraint;

    @Override
    public void enterMain(CSGrammarParser.MainContext ctx) {
        classroomList = new ArrayList<>();
        lectureList = new ArrayList<>();
        preference = new Preference();
        constraint = new Constraint();
        lecturerList = new ArrayList<>();
    }

    // Define Classroom

    @Override
    public void enterDefine_class_config(CSGrammarParser.Define_class_configContext ctx) {
        currentClassroom = new Classroom();
        classroomFacilityList = new ArrayList<>();
    }

    @Override
    public void exitClassroom_name(CSGrammarParser.Classroom_nameContext ctx) {
        currentClassroom.setClassroomName(ctx.getText());
    }

    @Override
    public void exitAmount_capacity_classroom(CSGrammarParser.Amount_capacity_classroomContext ctx) {
        currentClassroom.setCapacity(Integer.parseInt(ctx.getText()));
    }

    @Override
    public void enterFacilities_config_classroom(CSGrammarParser.Facilities_config_classroomContext ctx) {
        currentClassroomFacility = new Facility();
    }

    @Override
    public void exitFacility_name_classroom(CSGrammarParser.Facility_name_classroomContext ctx) {
        currentClassroomFacility.setFacilityName(ctx.getText());
    }

    @Override
    public void exitAmount_facility_classroom(CSGrammarParser.Amount_facility_classroomContext ctx) {
        currentClassroomFacility.setAmount(Integer.parseInt(ctx.getText()));
    }

    @Override
    public void exitFacilities_config_classroom(CSGrammarParser.Facilities_config_classroomContext ctx) {
        classroomFacilityList.add(currentClassroomFacility);
    }

    @Override
    public void exitDefine_class_config(CSGrammarParser.Define_class_configContext ctx) {
        boolean foundSame = false;
        currentClassroom.setFacilityList(classroomFacilityList);
        for (int i = 0; i < classroomList.size(); i++) {
            Classroom classroom = classroomList.get(i);
            if (classroom.getClassroomName().equals(currentClassroom.getClassroomName())) {
                classroomList.set(i, currentClassroom);
                foundSame = true;
            }
        }
        if (!foundSame) {
            classroomList.add(currentClassroom);
        }
    }

    // Define Lecture

    @Override
    public void enterDefine_lecture_requirement(CSGrammarParser.Define_lecture_requirementContext ctx) {
        currentLecture = new Lecture();
        lectureFacilityList = new ArrayList<>();
    }

    @Override
    public void exitLecture(CSGrammarParser.LectureContext ctx) {
        currentLecture.setLectureName(ctx.getText());
    }

    @Override
    public void exitAmount_capacity_lecture(CSGrammarParser.Amount_capacity_lectureContext ctx) {
        currentLecture.setCapacity(Integer.parseInt(ctx.getText()));
    }

    @Override
    public void exitGroup_lecture(CSGrammarParser.Group_lectureContext ctx) {
        currentLecture.setGroup(ctx.getText());
    }

    @Override
    public void enterFacility_config_lecture(CSGrammarParser.Facility_config_lectureContext ctx) {
        currentLectureFacility = new Facility();
    }

    @Override
    public void exitFacility_name_lecture(CSGrammarParser.Facility_name_lectureContext ctx) {
        currentLectureFacility.setFacilityName(ctx.getText());
    }

    @Override
    public void exitAmount_facility_lecture(CSGrammarParser.Amount_facility_lectureContext ctx) {
        currentLectureFacility.setAmount(Integer.parseInt(ctx.getText()));
    }

    @Override
    public void exitFacility_config_lecture(CSGrammarParser.Facility_config_lectureContext ctx) {
        lectureFacilityList.add(currentLectureFacility);
    }

    @Override
    public void exitDefine_lecture_requirement(CSGrammarParser.Define_lecture_requirementContext ctx) {
        currentLecture.setFacilityList(lectureFacilityList);
        lectureList.add(currentLecture);
    }

    // Define Lecturer

    @Override
    public void enterDefine_lecturer(CSGrammarParser.Define_lecturerContext ctx) {
        currentLecturer = new Lecturer();
    }

    @Override
    public void exitLecturer(CSGrammarParser.LecturerContext ctx) {
        currentLecturer.setLecturerName(ctx.getText());
    }

    @Override
    public void exitGroup_lecturer(CSGrammarParser.Group_lecturerContext ctx) {
        currentLecturer.setGroup(ctx.getText());
    }

    @Override
    public void exitDay_day(CSGrammarParser.Day_dayContext ctx) {
        dayOfDay = ctx.getText();
    }

    @Override
    public void exitAvailability_day(CSGrammarParser.Availability_dayContext ctx) {
        currentLecturer.setLecturerAvailableByDayString(dayOfDay);
    }

    @Override
    public void exitDay_day_time(CSGrammarParser.Day_day_timeContext ctx) {
        dayOfDayTime = ctx.getText();
    }

    @Override
    public void exitTime(CSGrammarParser.TimeContext ctx) {
        time = ctx.getText();
    }

    @Override
    public void exitAvailability_day_time(CSGrammarParser.Availability_day_timeContext ctx) {
        currentLecturer.setLecturerAvailableByDayTimeString(dayOfDayTime, time);
    }

    @Override
    public void exitDefine_lecturer(CSGrammarParser.Define_lecturerContext ctx) {
        lecturerList.add(currentLecturer);
    }

    // Define Preference

    @Override
    public void enterPrefer_cooccurrence(CSGrammarParser.Prefer_cooccurrenceContext ctx) {
        currentPreference = new ArrayList<>();
    }

    @Override
    public void exitLecture_preference(CSGrammarParser.Lecture_preferenceContext ctx) {
        currentPreference.add(ctx.getText());
    }

    @Override
    public void exitPrefer_cooccurrence(CSGrammarParser.Prefer_cooccurrenceContext ctx) {
        preference.addCooccurLectures(currentPreference);
    }

    // Define Constraint

    @Override
    public void enterConstraint_separation(CSGrammarParser.Constraint_separationContext ctx) {
        currentConstraint = new ArrayList<>();
    }

    @Override
    public void exitLecture_constraint(CSGrammarParser.Lecture_constraintContext ctx) {
        currentConstraint.add(ctx.getText());
    }

    @Override
    public void exitConstraint_separation(CSGrammarParser.Constraint_separationContext ctx) {
        constraint.addSeparatedLectures(currentConstraint);
    }

    @Override
    public void exitMain(CSGrammarParser.MainContext ctx) {
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
}