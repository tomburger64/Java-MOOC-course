/* Write a program that prompts the user for their age and tells them whether or not they are an adult (18 years old or older).

How old are you?
12
You are not an adult

How old are you?
32
You are an adult */


import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
