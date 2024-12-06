/* A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.

Write a program that reads a year from the user, and checks whether or not it is a leap year.

Give a year: 2011
The year is not a leap year.

Give a year: 2012
The year is a leap year.

Give a year: 1800
The year is not a leap year.

Give a year: 2000
The year is a leap year.

Hint 1: The divisibility by a particular number can be checked using the modulo operator, aka %, in the following way.

Hint 2: Think of the problem as a chain of if, else if, else if, ... comparisons, and start building the program from a situation in which you can be certain that the year is not a leap year. */


import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // had to cheat, I'm not accustomed to '%' yet but I think I got what happens below, no idea if I could redo it as I've never had to use modulo once before (outside of exercises like these
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year is a leap year.");
                } else {
                    System.out.println("The year is not a leap year.");
                }
            } else {
                System.out.println("The year is a leap year.");
            }
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
