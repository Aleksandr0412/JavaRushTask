package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public University(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudentWithAverageGrade(double d) {
        for (Student st : this.getStudents()) {
            if (d == st.getAverageGrade()) return st;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        double max = -1;
        Student stMax = null;
        for (Student st : this.getStudents()) {
            if (st.getAverageGrade() > max) {
                max = st.getAverageGrade();
                stMax = st;
            }
        }
        return stMax;
    }

    public Student getStudentWithMinAverageGrade() {
        double min = 10000;
        Student stMin = null;
        for (Student st : this.getStudents()) {
            if (st.getAverageGrade() < min) {
                min = st.getAverageGrade();
                stMin = st;
            }
        }
        return stMin;
    }

    public void expel(Student student) {
        this.students.remove(student);

    }


}