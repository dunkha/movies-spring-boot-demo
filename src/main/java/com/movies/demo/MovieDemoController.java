package com.movies.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MovieDemoController {

    @Autowired
    private MoviesJSONParser jsonParser;

    @RequestMapping(value = "/movies", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody Set<Movie> getMovies() {
        return jsonParser.parseMovies();
    }
}
