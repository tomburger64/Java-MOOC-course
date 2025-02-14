/* Create a film class with the instance variables name (String) and ageRating (int). Write the constructor public Film(String filmName, int filmAgeRating) for the class, and also the methods public String name() and public int ageRating(). The first of these returns the film title and the second returns its rating.

Below is an example use case of the class.

Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

Scanner reader = new Scanner(System.in);

System.out.println("How old are you?");
int age = Integer.valueOf(reader.nextLine());

System.out.println();
if (age >= chipmunks.ageRating()) {
    System.out.println("You may watch the film " + chipmunks.name());
} else {
    System.out.println("You may not watch the film " + chipmunks.name());
}

Sample output

How old are you?
7

You may watch the film Alvin and the Chipmunks: The Squeakquel */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Test your Film class here

        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you");
        int age = Integer.valueOf(reader.nextLine());

        System.out.println();
        if (age >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }
    }
}
