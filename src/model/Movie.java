
package model;

public class Movie implements Comparable<Movie> {
    private int id; // 1
    private String movie_title; // 2
    private int duration; // 3
    private String color; // 4
    private String language; // 5
    private String country; // 6
    private String content_rating; // 7
    private long budget; // 8
    private int year; // 9
    private double imdb_score; // 10
    private double aspect_ratio; // 11
    private String movie_imdb_link; // 12

    public Movie() {

    }

    public Movie(String titulo) {
        this.movie_title = titulo;
    }

    public Movie(int id, String movie_title, int duration, String color, String language, String country,
            String content_rating, long budget, int year, double imdb_score, double aspect_ratio,
            String movie_imdb_link) {
        this.id = id;
        this.movie_title = movie_title;
        this.duration = duration;
        this.color = color;
        this.language = language;
        this.country = country;
        this.content_rating = content_rating;
        this.budget = budget;
        this.year = year;
        this.imdb_score = imdb_score;
        this.aspect_ratio = aspect_ratio;
        this.movie_imdb_link = movie_imdb_link;
    }

    
    /** 
     * getter de la id
     * @return int
     */
    public int getId() {
        return id;
    }

    
    /** 
     * setter de la id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    
    /** 
     * getter del título de la película
     * @return String
     */
    public String getMovie_title() {
        return movie_title;
    }

    
    /** 
     * setter del título de la película
     * @param movie_title
     */
    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    
    /** 
     * getter de la duración de la película
     * @return int
     */
    public int getDuration() {
        return duration;
    }

    
    /** 
     * setter de la duración de la película
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    
    /** 
     * getter de la propiedad color
     * @return String
     */
    public String getColor() {
        return color;
    }

    
    /** 
     * setter de la propiedad color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    
    /** 
     * getter del idioma de la película
     * @return String
     */
    public String getLanguage() {
        return language;
    }

    
    /** 
     * setter del idioma de la película
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    
    /** 
     * getter del país de origen de la película
     * @return String
     */
    public String getCountry() {
        return country;
    }

    
    /** 
     * setter del país de origen de la película
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    /** 
     * getter del rating 
     * @return String
     */
    public String getContent_rating() {
        return content_rating;
    }

    
    /** 
     * setter del rating
     * @param content_rating
     */
    public void setContent_rating(String content_rating) {
        this.content_rating = content_rating;
    }

    
    /** 
     * getter del presupuesto
     * @return long
     */
    public long getBudget() {
        return budget;
    }

    
    /** 
     * setter del presupuesto
     * @param budget
     */
    public void setBudget(long budget) {
        this.budget = budget;
    }

    
    /** 
     * getter del año
     * @return int
     */
    public int getYear() {
        return year;
    }

    
    /** 
     * setter del año
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    
    /** 
     * getter del imdb score
     * @return double
     */
    public double getImdb_score() {
        return imdb_score;
    }

    
    /** 
     * setter del imdb score
     * @param imdb_score
     */
    public void setImdb_score(double imdb_score) {
        this.imdb_score = imdb_score;
    }

    
    /** 
     * getter del aspect ratio
     * @return double
     */
    public double getAspect_ratio() {
        return aspect_ratio;
    }

    
    /** 
     * setter del aspect ratio
     * @param aspect_ratio
     */
    public void setAspect_ratio(double aspect_ratio) {
        this.aspect_ratio = aspect_ratio;
    }

    
    /** 
     * getter del link del imdb
     * @return String
     */
    public String getMovie_imdb_link() {
        return movie_imdb_link;
    }

    
    /** 
     * setter del link del imdb
     * @param movie_imdb_link
     */
    public void setMovie_imdb_link(String movie_imdb_link) {
        this.movie_imdb_link = movie_imdb_link;
    }

    
    /** 
     * funcion para comparar películas
     * @param au
     * @return int
     */
    @Override
    public int compareTo(Movie au) {
        int last = this.movie_title.compareTo(au.movie_title);
        return last;
    }

    
    
    /** 
     * método para comparar películas por medio del año
     * @param au
     * @return int
     */
    //Sobrecargamos el metodo compareTo cuando se necesite comparacion numerica y comparar los anios de las peliculas
    public int compareTo(int au) {
        if(au < this.year){
            return 1;
        }else if( au > this.year){
            return -1;
        }else{
            return 0;
        }
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return " (" + this.year + ") " + movie_title + " (id = "+ this.id+ ")";
    }

}