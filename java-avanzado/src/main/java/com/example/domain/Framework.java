package com.example.domain;

public class Framework {

    private String name;

    public Framework(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Framework{" +
                "name='" + name + '\'' +
                '}';
    }
}
