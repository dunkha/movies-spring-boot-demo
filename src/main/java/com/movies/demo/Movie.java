package com.movies.demo;

import java.util.HashSet;
import java.util.Set;

public class Movie {
    private String name;
    private int year;
    private Set<String> genres;
    private int ageLimit;
    private int rating;
    private Set<Person> actors;
    private Person director;
    private String synopsis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Set<Person> getActors() {
        return new HashSet<>(actors);
    }

    public void setActors(Set<Person> actors) {
        this.actors = new HashSet<>(actors);
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
