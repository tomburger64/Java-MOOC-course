/* Write a program, which reads an integer from the user. Then the program prints numbers from that number to 100. You can assume that the user always gives a number less than 100. Below are some examples of the expected functionality.

99
99
100

-4
-4
-3
-2
-1
0
1
2
... (many numbers in between) ...
98
99
100 */


import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int num = Integer.valueOf(scanner.nextLine()); num <= 100; num++) {
            System.out.println(num);
        }
    }
}
