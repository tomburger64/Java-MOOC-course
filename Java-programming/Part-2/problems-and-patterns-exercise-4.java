/* Write a program that reads two integers from the user. If the first number is greater than the second, the program prints "(first) is greater than (second)." If the first number is less than the second, the program prints "(first) is smaller than (second)." Otherwise, the program prints "(first) is equal to (second)." The (first) and (second) should always be replaced with the actual numbers that were provided by the user.

A few examples of the expected behaviour:

8
4
8 is greater than 4.

-3
5
-3 is smaller than 5.

1
1
1 is equal to 1. */


import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value1 = Integer.valueOf(scanner.nextLine());
        int value2 = Integer.valueOf(scanner.nextLine());
        
        if (value1 > value2) {
            System.out.println(value1 + " is greater than " + value2 + ".");
        } else if (value1 < value2) {
            System.out.println(value1 + " is smaller than " + value2 + ".");
        } else {
            System.out.println(value1 + " is equal to " + value2 + ".");
        }
    }
}
