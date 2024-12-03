/* Similar to the previous exercise, create a program that multiplies the values stored in two integer variables.

For instance, if the entered numbers are 2 and 8, the program should print the following:
Give the first number:
2
Give the second number:
8
2 * 8 = 16

Likewise, if the entered numbers are 277 and 111, the print should be the following:
Give the first number:
277
Give the second number:
111
277 * 111 = 30747 */


import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
    }
}
