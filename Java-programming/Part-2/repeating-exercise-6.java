/* Write a program that reads numbers from the user until the user inputs a number 0. After this the program outputs the sum of the numbers. The number zero does not need to be added to the sum, even if it does not change the results.

Example output of the program

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
Sum of the numbers: 34 */


import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                System.out.println("Sum of the numbers: " + numSum);
                break;
            } else {
                numSum = numSum + num;
                continue;
            }
        }
    }
}
