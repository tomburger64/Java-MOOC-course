/* Write a method public static void divisibleByThreeInRange(int beginning, int end) that prints all the numbers divisible by three in the given range. The numbers are to be printed in order from the smallest to the greatest.

public static void main(String[] args) {
    divisibleByThreeInRange(3, 6);
}

Sample output

3
6


public static void main(String[] args) {
    divisibleByThreeInRange(2, 10);
}

Sample output

3
6
9 */


import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(3,6);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        while (true) {
            if (beginning <= end && beginning % 3 == 0) {
                System.out.println(beginning);
                beginning += 3;
                continue;
            } else if (beginning <= end && beginning % 3 != 0) {
                beginning += 1;
                continue;
            } else {
                break;
            }
        }
    }
}
