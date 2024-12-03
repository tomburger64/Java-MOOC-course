/* In the exercise template, implement a program that asks the user for the number of days. After that, the program prints the number of seconds in the given number of days.

Earlier we learned to read an integer in the following manner:

Scanner scanner = new Scanner(System.in);

System.out.println("Give a number:");
int number = Integer.valueOf(scanner.nextLine());
System.out.println("You gave " + number);

Examples of expected output:
How many days would you like to convert to seconds?
1
86400

How many days would you like to convert to seconds?
3
259200

How many days would you like to convert to seconds?
7
604800 */


import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        // in parentheses the amout of hours * amount of miinutes * amount of seconds in a day, all multiplied by the amount of days entered
        System.out.println(days * (24 * 60 * 60));
    }
}
