/* Write a program that reads values from the user until they input a 0. After this, the program prints the total number of inputted values that are negative. The zero that's used to exit the loop should not be included in the total number count.

Example output of the program:

Give a number:
5
Give a number:
22
Give a number:
9
Give a number:
-2
Give a number:
0
Number of negative numbers: 1 */


import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                System.out.println("Number of negative numbers: " + howManyNeg);
                break;
            } else if (num < 0) {
                howManyNeg = howManyNeg + 1;
            }
        }
    }
}
