/* The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.

Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.

72
2
8
11
-1

Sum: 93 */


// I'm just glad I got to know how  the map() function worked in javascript beforhand (this exercise is an introduction to for each loops)
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                int sum = 0;
                for (int num : list) {
                    sum += num;
                }
                System.out.println(sum);
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
    }
}
