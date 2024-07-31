package com.company;

import java.io.Serializable;

public class Employee1 implements Serializable {
    private int id;
    private String name;
    private int age;
    private String companyName;
    private String gender;
//        public Employee1(int id, String name, int age, String companyName, String gender)
        public Employee1() {
        this.id = id;
        this.name = name;
        this.age = age;
        this.companyName = companyName;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

}

