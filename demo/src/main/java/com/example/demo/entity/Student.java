package com.example.demo.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 5465872778586910807L;
    private long id;
    private String name;
    private int age;


    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}
