public class Movie {
    
    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)  {
        // throw an IllegalArgumentException if the name is null or blank
       if(name == null || name.isBlank()){
           throw new IllegalArgumentException("Name should not be null or blank");
       }
       this.name = name;
    }
    
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        // throw an IllegalArgumentException if the format is null or blank
        if(format == null || format.isBlank()){
            throw new IllegalArgumentException("The format cannot be null or blank");
        }
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        // throw an IllegalArgumentException if the rating is less than 0 or greater than 10.
        if(rating < 0 || 10 < rating){
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        }
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }    

}