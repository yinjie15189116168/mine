package com.yinjie.mine.set;

import org.springframework.stereotype.Component;

/**
 * @Author: yinjie
 * @Date: 2021/3/30 14:35
 * @description
 */
public class User {

    private String name;

    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
