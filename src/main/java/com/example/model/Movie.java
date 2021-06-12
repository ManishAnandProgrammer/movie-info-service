package com.example.model;

public class Movie {
    private String id;
    private String name;
    private String description;

    public Movie() {}

    public Movie(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
