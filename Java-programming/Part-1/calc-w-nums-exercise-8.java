/* Write a program that asks the user for two numbers and prints their sum, difference, product, and quotient. Two examples of the execution of the program are given below.
Give the first number:
8
Give the second number:
2
8 + 2 = 10
8 - 2 = 6
8 * 2 = 16
8 / 2 = 4.0

Give the first number:
9
Give the second number:
2
9 + 2 = 11
9 - 2 = 7
9 * 2 = 18
9 / 2 = 4.5 */


import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        
        // appart var to have double value result
        double divideResult = 1.0 * firstNum / secondNum;
        
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " + divideResult);
    }
}
