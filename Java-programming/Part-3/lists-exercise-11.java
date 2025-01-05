/* Write a program that reads numbers from the user. When number 9999 is entered, the reading process stops. After this the program will print the smallest number in the list, and also the indices where that number is found. Notice: the smallest number can appear multiple times in the list.

72
2
8
8
11
9999

Smallest number: 2
Found at index: 1



72
44
8
8
11
9999

Smallest number: 8
Found at index: 2
Found at index: 3

Hint: combine the programs you wrote for the exercises "Greatest number in the list" and "Index of the requested number". First find the smallest number, and then find the index of that number. */


import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        int smallest = 999999;
        int foundIndex = 0;
        
        ArrayList<Integer> inputs = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            inputs.add(input);
            
            if (input == 9999) {
                
                // find the smallest value of the list
                for (int i = 0; i < inputs.size(); i++) {
                    if (smallest > inputs.get(i)) {
                        smallest = inputs.get(i);
                        foundIndex = i;
                    } else if (smallest == inputs.get(i)) {
                        System.out.println("(else if)");
                        System.out.println("Found at index: " + i);
                    }
                }
                
                // final output and break
                System.out.println("Smallest number: " + smallest);
                System.out.println("Found at index: " + foundIndex);
                break;
            }
        }
    }
}
