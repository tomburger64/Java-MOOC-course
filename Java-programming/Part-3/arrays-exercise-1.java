/* The exercise template already contains a program, that creates an array and prints the values of the array twice. Modify the program to do following: After the first printing, the program should ask for two indices from the user. The values in these two indices should be swapped, and in the end the values of the array should be printed once again.

1
3
5
7
9

Give two indices to swap:
2
4

1
3
9
7
5



1
3
5
7
9

Give two indices to swap:
0
1

3
1
5
7
9

You can assume that the array contains the given indices. Tip! You'll need an additional variable to store one of the values for a little while. */


import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them

        System.out.println("Give two indices to swap:");
        int input1 = Integer.valueOf(scanner.nextLine());
        int input2 = Integer.valueOf(scanner.nextLine());
        
        int swapHolder = array[input1];
        array[input1] = array[input2];
        array[input2] = swapHolder; // (= input1)

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
