package com.example.model;

public class Movie {
    private String id;
    private String name;

    public Movie() {}

    public Movie(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
