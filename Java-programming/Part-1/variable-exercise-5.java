/* Write a program that asks the user for a string, an integer, a floating-point number, and a boolean. The program should then print the values given by the user.

Example prints for the program can be seen below.

Give a string:
bye-bye
Give an integer:
11
Give a double:
4.2
Give a boolean:
true
You gave the string bye-bye
You gave the integer 11
You gave the double 4.2
You gave the boolean true */


import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String stringVar = scan.nextLine();
        
        System.out.println("Give an integer:");
        int intVar = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double doubleVar = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean boolVar = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + stringVar);
        System.out.println("You gave the integer " + intVar);
        System.out.println("You gave the double " + doubleVar);
        System.out.println("You gave the boolean " + boolVar);
    }
}
