/* Implement a program which calculates the sum of a closed interval, and prints it. Expect the user to write the smaller number first and then the larger number.

You can base your solution to this exercise to the solution of last exercise — add the functionality for the user to enter the starting point as well.

Sample output:

First number? 3
Last number? 5
The sum is 12

The above example internally calculated 3 + 4 + 5 = 12
First number? 2
Last number? 8
The sum is: 35

And now the internal calculation was 2 + 3 + 4 + 5 + 6 + 7 + 8 = 35 */


import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        // from asked value 1 to value 2, sums the interval(s) by adding 1
        // also adds value 2 to the sum (doesn't do it by itslef)
        int sum = 0;
        for (int n = num1; n != num2; n++) {
            sum = sum + n;
        }
        sum = sum + num2;
        
        System.out.println("The sum is: " + sum);
    }
}
