package ru.kata.spring.boot_security.demo.model;

public enum Sex {
    MALE("man"),
    FEMALE("woman");

    private final String description;

    Sex(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
