package com.javarush.task.task29.task2909.human;

import java.util.Date;

public class Student extends UniversityPerson {
    private double averageGrade;
    private Date beginningOfSession;
    private Date endOfSession;
    private int course;

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int value) {
        this.course = value;
    }

    public void live() {
        learn();
    }

    public void learn() {
    }

    @Override
    public String getPosition() {
        return "Студент";
    }

    public void incAverageGrade(double delta) {
        this.setAverageGrade(getAverageGrade() + delta);
    }


    public void setBeginningOfSession(Date date) {
        beginningOfSession = date;
    }

    public void setEndOfSession(Date date) {
        endOfSession = date;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double value) {
        this.averageGrade = value;
    }
}