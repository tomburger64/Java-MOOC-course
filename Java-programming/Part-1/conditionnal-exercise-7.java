/* Write a program that prompts the user for two integers and prints the larger of the two. If the numbers are the same, then the program informs us about this as well.

Sample outputs:

Give the first number:
5
Give the second number:
3
Greater number is: 5

Give the first number:
5
Give the second number:
8
Greater number is: 8

Give the first number:
5
Give the second number:
5
The numbers are equal! */


import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // notocie how they don't say "write your code here" anymore from this exercise
        // also scanner seems to always be called scan and no longer scanner since a few exercises
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scan.nextLine());
        
        if (firstNum > secondNum) {
            System.out.println("Greater number is:" + firstNum);
        } else if (firstNum < secondNum) {
            System.out.println("Greater number is:" + secondNum);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
