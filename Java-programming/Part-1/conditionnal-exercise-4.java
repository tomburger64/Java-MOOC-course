/* Write a program that prompts the user for a year. If the user inputs a number that is smaller than 2015, then the program prints the string "Ancient history!".

Give a year:
2017

Give a year:
2013
Ancient history! */


import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
