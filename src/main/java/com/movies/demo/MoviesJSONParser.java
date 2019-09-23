package com.movies.demo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Set;

@Component("moviesJSONParser")
public class MoviesJSONParser {
    private final String moviesPath = "src/main/resources/movies.json";
    private static final Type MOVIE_TYPE = new TypeToken<Set<Movie>>() {
    }.getType();

    public Set<Movie> parseMovies() {
        Gson gson = new Gson();

        try {
            JsonReader reader = new JsonReader(new FileReader(moviesPath));

            System.out.println(reader.toString());

            Set<Movie> data = gson.fromJson(reader, MOVIE_TYPE);

            return data;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
