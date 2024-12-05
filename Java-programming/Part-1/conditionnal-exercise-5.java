/* Write a program that prompts the user for an integer and informs the user whether or not it is positive (greater than zero).

Give a number:
5
The number is positive.

Give a number:
-2
The number is not positive. */


import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());

        // i would've put >= here but I guess 0 is "neutral" technically, not positive nor negative (true 0, not 0.00...01)
        if (num > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
