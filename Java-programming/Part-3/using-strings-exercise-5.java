/* Write a program that reads user input until an empty line. For each non-empty string, the program splits the string by spaces  and then prints the pieces that contain av, each on a new line.

java is a programming language
java
navy blue shirt
navy



Do you have a favorite flavor
have
favorite
flavor
was it a cat?



Tip! Strings have a contains-method, which tells if a string contains another string. It works like this:

String text = "volcanologist";

if (text.contains("can")) {
    System.out.println("can was found");
}

if (!text.contains("tin")) {
    System.out.println("tin wasn't found");
}



can was found
tin wasn't found */


import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] inputs = input.split(" ");
            
                for (int i = 0; i < inputs.length; i++) {
                    if (inputs[i].contains("av")) {
                        System.out.println(inputs[i]);
                    }
                }
            }
        }
    }
}
