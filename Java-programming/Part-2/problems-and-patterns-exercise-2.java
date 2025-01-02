/* Write a program that reads two integers from the user and prints the square root of the sum of these integers. The program does not need to work with negative values.

You can calculate the square root of an integer with the command Math.sqrt like this:

int number = 42;
double squareRoot = Math.sqrt(number);
System.out.println(squareRoot);

Here are a few examples:

1
0
1

5
4
3

1
35
6 */


import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value1 = Integer.valueOf(scanner.nextLine());
        int value2 = Integer.valueOf(scanner.nextLine());
        
        double sqRt = Math.sqrt(value1 + value2);
        System.out.println(sqRt);
    }
}
