/* Write a program that reads user input until an empty line is entered. For each non-empty line the program splits the string by spaces  and prints the first part of the string.
Sample output

one two three four
one
this is a very important message
this */


import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] inputs = input.split(" ");
                System.out.println(inputs[0]);
            }
        }
    }
}
