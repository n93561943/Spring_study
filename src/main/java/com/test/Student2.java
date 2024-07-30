package com.test;

import org.springframework.stereotype.Component;

@Component
public class Student2 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
