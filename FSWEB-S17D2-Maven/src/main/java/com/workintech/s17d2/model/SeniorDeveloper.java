package com.workintech.s17d2.model;

public class SeniorDeveloper extends Developer{
    public SeniorDeveloper(int id, Double salary, String name) {
        super(id, Experience.SENIOR, salary, name);
    }
}
