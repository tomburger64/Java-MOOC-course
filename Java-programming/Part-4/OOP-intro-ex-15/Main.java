/* Part 1: Count
Create a class Statistics that has the following functionality (the file for the class is provided in the exercise template):

a method addNumber adds a new number to the statistics
a method getCount tells the number of added numbers
The class does not need to store the added numbers anywhere, it is enough for it to remember their count. At this stage, the addNumber method can even neglect the numbers being added to the statistics, since the only thing being stored is the count of numbers added.

The method's body is the following:

public class Statistics {
    private int count;

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        // write code here
    }

    public int getCount() {
        // write code here
    }
}
The following program introduces the class' use:

public class MainProgram {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
    }
}
The program prints the following:

Count: 4 */

/* Part 2: Sum and average
Expand the class with the following functionality:

the sum method tells the sum of the numbers added (the sum of an empty number statistics object is 0)
the average method tells the average of the numbers added (the average of an empty number statistics object is 0
The class' template is the following:

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variables count and sum here
    }

    public void addNumber(int number) {
        // write code here
    }

    public int getCount() {
        // write code here
    }

    public int sum() {
        // write code here
    }

    public double average() {
        // write code here
    }
}
The following program demonstrates the class' use:

public class Main {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}
The program prints the following:

Count: 4
Sum: 11
Average: 2.75 */

/* Part 3: Sum of user input
Write a program that asks the user for numbers until the user enters -1. The program will then provide the sum of the numbers.

The program should use a Statistics object to calculate the sum.

NOTE: Do not modify the Statistics class in this part. Instead, implement the program for calculating the sum by making use of it.

Enter numbers:
4
2
5
4
-1
Sum: 15 */

/* Part 4: Multiple sums
Change the previous program so that it also calculates the sum of even and odd numbers.

NOTE: Define three Statistics objects in the program. Use the first to calculate the sum of all numbers, the second to calculate the sum of even numbers, and the third to calculate the sum of odd numbers.

For the test to work, the objects must be created in the main program in the order they were mentioned above (i.e., first the object that sums all the numbers, then the one that sums the even ones, and then finally the one that sums the odd numbers)!

NOTE: Do not change the Statistics class in any way!

The program should work as follows:

Enter numbers:
4
2
5
2
-1
Sum: 13
Sum of even numbers: 8
Sum of odd numbers: 5 */


// I CAN'T VALIDATE THE EXERCISE
// I'm going insane I keep getting the error "when calling for the average at the beginning it says NaN even though it should be 0, are you sure you're not dividing by 0"
// EVERYTHING works, and turns out when you call for the average before you input numbers other than -1, it won't be created because there's no nums to make it with
// like I just don't know I'll consider it done but it says 95% sdgyvfzsjhyefhnzyf
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        
        System.out.println("Enter numbers:");
        while (true) {
            // sum
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Sum: " + statistics.sum());
                
                System.out.println("Sum of even numbers: " + statisticsEven.sum());
                
                System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
                break;
            } else {
                statistics.addNumber(input);
                
                if (input % 2 == 0) {
                    statisticsEven.addNumber(input);
                } else {
                    statisticsOdd.addNumber(input);
                }
            }
        }
    }
}
