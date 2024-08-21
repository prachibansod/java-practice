package JavaPractice;

import java.util.ArrayList;
//Create an ArrayList to store the names of 5 of your favorite movies.
//Add 2 more movies to the list.
//Remove the third movie from the list.
//Replace the first movie in the list with a new movie.
//Print all the movies using an enhanced for loop.
//Print the total number of movies in the list.

public class FavoriteMovies {
    public static void main(String[] args) {
        ArrayList<String> movies =new ArrayList<>();
        movies.add("Checkmate");
        movies.add("Juna Furniture");
        movies.add("Natsamrat");
        movies.add("Ved");
        movies.add("Mulshi Pattern");

        movies.add("Duniyadari");
        movies.add("Zombivli");

        movies.remove(2);
        //String one=movies.get(0);
        movies.set(0, "Kakan");

        System.out.println("Movies in the list:");
        for (String movie : movies) {
            System.out.println(movie);
        }
        int size= movies.size();
        System.out.println("\nTotal number of movies: " +size);
        // System.out.println("\nTotal number of movies: " + movies.size());

    }
}
