package com.lingyu.bean;

import java.util.List;

public class Clazz {

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "students=" + students +
                '}';
    }
}