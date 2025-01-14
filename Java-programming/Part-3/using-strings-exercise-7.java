/* Write a program that reads user input until an empty line is entered. For each non-empty line the program splits the string by spaces  and prints the last part of the string.

one two three four
four
this is a very important message
message

Tip! You can find out the length of the array like this:

String[] parts = {"one", "two", "three"};
System.out.println("Number of parts: " + parts.length);

Number of parts: 3 */


import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");
            
            if (input.equals("")) {
                break;
            } else {
                System.out.println(inputs[inputs.length - 1]);
            }
        }
    }
}
