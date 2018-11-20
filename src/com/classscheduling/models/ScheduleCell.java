package com.classscheduling.models;

public class ScheduleCell {
    private Classroom classroom;
    private Lecture lecture;
    private Lecturer lecturer;

    public ScheduleCell() {
        this.classroom = null;
        this.lecture = null;
        this.lecturer = null;
    }

    public void setProperties(Classroom classroom, Lecture lecture, Lecturer lecturer) {
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
        return classroom.getClassroomName() + "\n" + lecture.getLectureName() + "\n" + lecturer.getLecturerName();
    }
}
