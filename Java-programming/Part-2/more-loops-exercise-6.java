/* Implement a program which calculates the factorial of a number given by the user.

Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. Additionally, it has been specified that the factorial of 0 is 1, so 0! = 1.

Sample output:

Give a number: 3
Factorial: 6

The internal calculation here was 1 * 2 * 3 = 6

Give a number: 10
Factorial: 3628800

And now the internal calculation was 1 * 2 * 3 * ... * 8 * 9 * 10 = 3628800 */


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        
        // gives the factorial of the asked number
        // also adding the asked number to the sum (loop doesn't do it by itself)
        
        // no default value should be at 0 (no (a * 0) + (b * 0) + ...)
        int sum = 1;
        for (int n = 1; n != num; n++) {
            sum = sum * n;
        }
        sum = sum * num;
        
        System.out.println("Factorial: " + sum);
    }
}
