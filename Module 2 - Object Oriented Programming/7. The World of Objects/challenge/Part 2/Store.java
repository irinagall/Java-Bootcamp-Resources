public class Store {

    private Movie[] movies;

    public Store() {
        // The `Store` constructor must grant `this.movies` the capacity to store 10 elements.
        this.movies = new Movie[10];
    }

    public Movie getMovie(int index) {
        //The getter must return a **`new`** copy of the `Movie` object being requested.
        return new Movie(this.movies[index]);
    }

    public void setMovie(int index, Movie movie) {
        // The setter must update the array with a **`new`** copy of the `Movie` object.
        this.movies[index] = new Movie(movie);
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
