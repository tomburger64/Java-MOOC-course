/* The exercise template contains a base that reads numbers from the user and adds them to a list. Reading is stopped once the user enters the number -1.

Continue developing the program so that it finds the greatest number in the list and prints its value after reading all the numbers. The programming should work in the following manner.

72
2
8
93
11
-1

The greatest number: 93

You can use the source code below as an example. It is used to find the smallest number.

// assume we have a list that contains integers

int smallest = list.get(0);

for(int i = 0; i < list.size(); i++) {
    int number = list.get(i);
    if (smallest > number) {
        smallest = number;
    }
}

System.out.println("The smallest number: " + smallest); */


import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        int greatest = list.get(0);
        
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (greatest < num) {
                greatest = num;
            }
        }
        
        System.out.println("The greatest number: " + greatest);

        // implement finding the greatest number in the list here
    }
}
