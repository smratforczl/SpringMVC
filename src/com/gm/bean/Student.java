package com.gm.bean;

import java.util.List;

public class Student {

    private Integer id;
    private String stuName;
    private String age;
    private List<String> sbs;
    private Integer sex;

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public List<String> getSbs() {
        return sbs;
    }

    public void setSbs(List<String> sbs) {
        this.sbs = sbs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(Integer id, String stuName, String age) {
        this.id = id;
        this.stuName = stuName;
        this.age = age;
    }

    public Student() {
    }
}
