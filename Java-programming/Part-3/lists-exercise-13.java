/* The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.

When reading ends, calculate the average of the numbers in it, and then print that value.

72
2
8
11
-1

Average: 23.25 */


// I can't keep myself from iterating stuff at the beginning of loops, losing too much time because of stuff like this
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        int numCount = 0;
        int sum = 0;
        double avg = 0;
            
        ArrayList<Integer> inputs = new ArrayList<>();
        
        while (true) {
            
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input != -1) {
                inputs.add(input);
                continue;
            } else if (input == -1) {
                for (int num : inputs) {
                    numCount++;
                    sum += num;
                }
                
                avg = 1.00 * sum / numCount;
                System.out.println("Average: " + avg);
                
                break;
            }
        }
    }
}
