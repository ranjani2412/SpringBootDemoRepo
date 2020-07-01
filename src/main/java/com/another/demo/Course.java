package com.another.demo;

public class Course {
    private String courseName;
            private String courseId;
            private String courseInstructor;


    public Course(String courseName, String courseId, String courseInstructor) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseInstructor = courseInstructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }
}
