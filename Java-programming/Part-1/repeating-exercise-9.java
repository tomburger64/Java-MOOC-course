/* Write a program that asks the user for input until the user inputs 0. After this, the program prints the average of the positive numbers (numbers that are greater than zero).

If no positive number is inputted, the program prints "Cannot calculate the average"

Below a few examples of the programs output

3
5
1
-3
0
3.0

0
Cannot calculate the average

-3
1
0
1.0

1
1
0
1.0 */


import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSum = 0;
        int numOfNum = 0;
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                double numPosAvg = 1.00 * numSum / numOfNum;
                System.out.println(numPosAvg);
                break;
            } else if (num > 0) {
                numOfNum = numOfNum + 1;
                numSum = numSum + num;
            } else if (numOfNum <= 0) {
                System.out.println("Cannot calculate the average");
            }
        }
    }
}
