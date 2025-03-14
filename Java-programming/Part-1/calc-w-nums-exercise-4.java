/* Create a program that can be used to add two integers together. In the beginning, the user is asked to give two integers that are to be summed. The program then prints the formula that describes the addition of the numbers.

Example output:
Give the first number:
5
Give the second number:
4
5 + 4 = 9

Give the first number:
73457
Give the second number:
12888
73457 + 12888 = 86345 */


import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
    }
}
