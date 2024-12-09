/* Write a program that reads an integer from the user. If the number is less than 0, the program prints the given integer multiplied by -1. In all other cases, the program prints the number itself. A few examples of how the program's expected to function are shown below:

-3
3

2
2

-5
5   */


import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = Integer.valueOf(scanner.nextLine());
        
        if (value < 0) {
            System.out.println(value * -1);
        } else {
            System.out.println(value);
        }
    }
}
