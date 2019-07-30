package com.example.demo.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_user")
public class User {
    @Id
    private String userId;
    private int userAge;
    private String userName;

    public User() {
    }

    public User(String userId, String userName, int userAge) {
        this.userAge = userAge;
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
