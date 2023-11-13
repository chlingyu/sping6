package com.lingyu.bean;

import java.util.Arrays;
import java.util.Map;

public class Student {

    private String[] hobbies;

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }


    private Map<String, Teacher> teacherMap;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hobbies=" + Arrays.toString(hobbies) +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
