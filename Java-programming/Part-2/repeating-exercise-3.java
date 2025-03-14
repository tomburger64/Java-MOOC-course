/* Write a program that asks the user for numbers. If the number is negative (smaller than zero), the program prints for user "Unsuitable number" and asks the user for a new number. If the number is zero, the program exits the loop. If the number is positive, the program prints the number to the power of two.

Give a number:
5
25
Give a number:
4
16
Give a number:
-3
Unsuitable number
Give a number:
1
1
Give a number:
0 */


import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (num == 0) {
                break;
            } else if (num > 0) {
                System.out.println(num * num);
            }
        }
    }
}
