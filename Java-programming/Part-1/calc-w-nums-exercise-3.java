/* Write a program that asks the user for three numbers. After this the program prints the sum of the numbers given by the user.

The program should work like this:
Give the first number:
8
Give the second number:
3
Give the third number:
3
The sum of the numbers is 14

Give the first number:
3
Give the second number:
-1
Give the third number:
2
The sum of the numbers is 4 */


import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        int thirdNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The sum of the numbers is " + (firstNum + secondNum + thirdNum));
    }
}
