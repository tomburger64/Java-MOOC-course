/* NB! By submitting a solution to a part of an exercise which has multiple parts, you can get part of the exercise points. You can submit a part by using the 'submit' button on NetBeans. More on the programming exercise submission instructions: Exercise submission instructions.

This exercise is the first two-part exercise. When you complete both parts, you will get two exercise points. You can also submit the exercise after completing only the first part.

Part 1: Where to

Write a program which prints the integers from 1 to a number given by the user.

Where to? 3
1
2
3

Where to? 5
1
2
3
4
5

hint the number read from the user is now the upper limit of the condition. Remember that in Java a <= b means a is smaller or equal to b. */


import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // part 1 & 2
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        
        
        for (int start = Integer.valueOf(scanner.nextLine()); start <= end; start++) {
            System.out.println(start);
        }
    }
}
