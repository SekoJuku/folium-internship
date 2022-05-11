package com.company.model;

public class MyBean {
    private String name;

    public MyBean() {

    }

    public MyBean(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
