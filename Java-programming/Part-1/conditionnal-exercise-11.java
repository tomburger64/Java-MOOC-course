/* Write a program that prompts the user for two strings. If the strings are the same, then the program prints "Same". Otherwise, it prints "Different".

Enter the first string:
hello
Enter the second string:
hello
Same

Enter the first string:
hello
Enter the second string:
world
Different */


import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String firstMsg = scan.nextLine();
        
        System.out.println("Enter the second string:");
        String secondMsg = scan.nextLine();
        
        if (firstMsg.equals(secondMsg)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
