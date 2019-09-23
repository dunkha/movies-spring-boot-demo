package com.movies.demo;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MoviesJSONParserTest {
    private MoviesJSONParser parser = new MoviesJSONParser();

    @Test
    public void parseMovies() {
        Set<Movie> movies = parser.parseMovies();

        assertEquals(20, movies.size());
    }
}
