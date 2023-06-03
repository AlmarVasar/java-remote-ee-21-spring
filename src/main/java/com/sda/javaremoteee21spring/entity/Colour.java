package com.sda.javaremoteee21spring.entity;

public enum Colour {
    SOUL_RED("Nice red"),
    RED("Normal red"),
    BlUE("Just blue"),
    PINK("Pinky"),
    GRAY("Just gray");

    private String description;

    public String getDescription() {
        return description;
    }

    Colour(String description) {
        this.description = description;
    }
}
