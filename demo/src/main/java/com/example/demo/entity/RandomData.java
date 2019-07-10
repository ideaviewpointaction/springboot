package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName RandomData
 * @Description
 * @Author gehui
 * @Date 2019/7/11 6:36
 * @Version
 **/
@Component
@ConfigurationProperties(prefix="test")
public class RandomData {

    private int randomInt;
    private int randomIntMax;
    private int randomIntMiddle;
    private long randomLong;
    private String randomValue;
    private String randomUUID;

    public int getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(int randomInt) {
        this.randomInt = randomInt;
    }

    public int getRandomIntMax() {
        return randomIntMax;
    }

    public void setRandomIntMax(int randomIntMax) {
        this.randomIntMax = randomIntMax;
    }

    public int getRandomIntMiddle() {
        return randomIntMiddle;
    }

    public void setRandomIntMiddle(int randomIntMiddle) {
        this.randomIntMiddle = randomIntMiddle;
    }

    public long getRandomLong() {
        return randomLong;
    }

    public void setRandomLong(long randomLong) {
        this.randomLong = randomLong;
    }

    public String getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(String randomValue) {
        this.randomValue = randomValue;
    }

    public String getRandomUUID() {
        return randomUUID;
    }

    public void setRandomUUID(String randomUUID) {
        this.randomUUID = randomUUID;
    }
}
