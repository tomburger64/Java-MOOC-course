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

// started struggling because of stuff like iterating the list in the while loop, iterating variables in the wrong places and also had to cheat to figure out a way to output all the indexes for the same smallest value if there are several of them (was only outputing the last known

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
        
        // list for saving inputs
        ArrayList<Integer> inputs = new ArrayList<>();
        // list for saving the inputs' indices
        ArrayList<Integer> indices = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            inputs.add(input);
            
            if (input == 9999) {
                
                // find the smallest value of the list
                for (int i = 0; i < inputs.size(); i++) {
                    if (smallest > inputs.get(i)) {
                        smallest = inputs.get(i);
                        indices.add(i);
                    } else if (smallest == inputs.get(i)) {
                        // if smallest value is there several times, add the index to the index list
                        indices.add(i);
                    }
                }
                
                // final output and break
                System.out.println("Smallest number: " + smallest);
                // looping through indices list to print all the values
                for (int i = 0; i < indices.size(); i++){
                    System.out.println("Found at index: " + indices.get(i));
                }
                break;
            }
        }
    }
}
