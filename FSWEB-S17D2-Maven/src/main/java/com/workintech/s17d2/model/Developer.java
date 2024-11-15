package com.workintech.s17d2.model;

public class Developer {
    private int id;
    private String name;
    private Double salary;
    private Experience experience;

    public Developer(int id, Experience experience, Double salary, String name) {
        this.id = id;
        this.experience = experience;
        this.salary = salary;
        this.name = name;
    }

    public Developer(int expectedId, String expectedName, double expectedSalary, Experience expectedExperience) {
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}
