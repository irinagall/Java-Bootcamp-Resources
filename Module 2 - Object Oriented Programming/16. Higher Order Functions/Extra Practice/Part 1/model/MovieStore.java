package model;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {

    private List<Movie> movies;
    public MovieStore(){
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movieToAdd){
        movies.add(movieToAdd);
    }

    public List<Movie> filterByGenre(String genre){
        return movies.stream().filter(category -> category.genre.equals(genre)).toList();
    }

    public List<Movie> sortByReleaseYear(){
      return movies.stream().sorted((movie1 , movie2nd) -> Integer.compare(movie1.getReleaseYear(), movie2nd.getReleaseYear())).toList();
    }

   public List<Movie> getTopRatedMovies(int maxOutputMovies){
        return movies.stream().sorted((movie1, movie2nd) ->Double.compare(movie2nd.getRating(), movie1.getRating())).limit(maxOutputMovies).toList();
   }

}
