# Composition and Inheritance, Part 1

 ## Library 

* library.java : the driver file and is used to run the functions from Restaurant.java. 
* Restaurant.java : the class that we Inherit from it. 
* Review.java : a class that it used to Inherit sub classed for the "addReview" function. 
* Shop.java : for shops and places that are not restaurants.
* Theater.java : for Theater.

## Testing 

1. a test to create an instance of Restaurant and ensure that its toString is working properly.
2. a test to create an instance of Review and ensure that its toString is working properly. 
3. a  tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.
4. tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)