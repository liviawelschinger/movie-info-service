package de.livia.movieinfoservice.restcontroller;

import de.livia.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoRestController {

    //http://localhost:8484/movies/foo
    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId ) {
        return new Movie(movieId, "Test name");
    }
}
