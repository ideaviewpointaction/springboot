package com.example.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class FastJsonTest {
    private Integer id;
    private String str;
    /**
     * 在这里可以直接设置格式化方式
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    /**
     * 转换json时不包含此属性
     */
    @JSONField(serialize = false)
    private String ignore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIgnore() {
        return ignore;
    }

    public void setIgnore(String ignore) {
        this.ignore = ignore;
    }
}
