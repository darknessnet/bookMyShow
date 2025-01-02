package com.yash.bookMyShow.controller;

import com.yash.bookMyShow.dao.MovieDao;
import com.yash.bookMyShow.model.Movies;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MovieController {

    private final MovieDao movieDao;

    public MovieController() {
        this.movieDao = new MovieDao();
    }

    @ResponseBody
    @RequestMapping(value = "/movies")
    public ModelAndView getAllMovies(HttpServletResponse response) {
    	System.out.println("movieDao");
    	List<Movies> movies = movieDao.getAllMovies();
    	System.out.println(movies);
        return new ModelAndView("movie/listMovie");
    }
}