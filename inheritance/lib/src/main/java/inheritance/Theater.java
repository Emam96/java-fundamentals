package inheritance;

import java.util.ArrayList;

public class Theater {

    String name;
    double sumOfStars;
    String price;
    ArrayList<Review> reviewList = new ArrayList<>();
    ArrayList<String> movieList = new ArrayList<>();

    public Theater(String name, double sumOfStars, String price, ArrayList movies) {
        this.name = name;
        this.sumOfStars = sumOfStars;
        this.price = price;
        this.movieList = movies;
    }


    public String toString(){
        String rating = "Theater: " + this.name + " \n" + " rating : " + this.sumOfStars +  " Number of reviews = " + reviewList.size() + " \n" + " price category: " + this.price+ "$" + " \n" + "Showing Know:  " + this.movieList;
        return rating;
    }

    public void addMovie(String x){

        movieList.add(x);

    }

    public void removeMovie(String x){

        movieList.remove(x);

    }

    public double addReview(String body,String author,int numOfStars) {
        Review review = new Review(body,author,numOfStars);
        reviewList.add(review);
        double sum = this.sumOfStars+review.numOfStars;
        this.sumOfStars =(sum/reviewList.size());
        return this.sumOfStars;

    }


    public double addReview(String body,String author,int numOfStars, String Movie) {
        Review review = new Review(body,author,numOfStars, Movie);
        reviewList.add(review);
        double sum = this.sumOfStars+review.numOfStars;
        this.sumOfStars =(sum/reviewList.size());
        return this.sumOfStars;

    }


}
