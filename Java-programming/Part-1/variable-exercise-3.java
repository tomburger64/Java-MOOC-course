/* Write a program that asks the user for a floating-point number using the variable type Double. The program then prints the user's input value.

Example prints for the program can be seen below:
Give a number:
3.14
You gave the number 3.14

Give a number:
2.718
You gave the number 2.718 */


import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        double doubNum = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + doubNum);
    }
}
