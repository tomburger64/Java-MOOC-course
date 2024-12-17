/* NB! By submitting a solution to a part of an exercise which has multiple parts, you can get part of the exercise points. You can submit a part by using the 'submit' button on NetBeans. More on the programming exercise submission instructions: Exercise submission instructions.

Next, we'll implement a program one piece at a time. This is always strongly recommended when coding.

The series of exercises form a larger program whose functionality is implemented in small pieces. If you do not finish the whole series, you can still submit the parts you've completed to be checked. This can be done by clicking the "submit" button (the arrow pointing up) to the right of the "test" button. Although the submission system complains about the tests of unfinished parts, you get points for the parts you have finished.

NB: Remember that each sub-part of the series is equivalent to one individual exercise. As such, the series is equivalent to five individual exercises.

Note: the tests might fail a correct solution. This is a known bug that will be fixed in the future. In the meantime, you can avoid the error by printing "Give numbers:" without any spaces after ':'

Part 1: Reading

Implement a program that asks the user for numbers (the program first prints "Write numbers: ") until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.

Give numbers:
5
2
4
-1
Thx! Bye! */


import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
        }
    }
}
