/* Write a program that works as follows:

Greetings! How are you doing?
Good thank you!
Oh, how interesting. Tell me more!
Well, there's really nothing to tell.
Thanks for sharing!

Greetings! How are you doing?
Nice and dandy like cotton candy!
Oh, how interesting. Tell me more!
Just went shopping.
Thanks for sharing!*/

import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        //I'm not supposed to call the nextLine() directly in the sout but it works
        System.out.println("Greetings! How are you doing?");
        System.out.println(scanner.nextLine());
        System.out.println("Oh, how interesting. Tell me more!");
        System.out.println(scanner.nextLine());
        System.out.println("Thanks for sharing!");
        
        System.out.println("Greetings! How are you doing?");
        System.out.println(scanner.nextLine());
        System.out.println("Oh, how interesting. Tell me more!");
        System.out.println(scanner.nextLine());
        System.out.println("Thanks for sharing!");
    }
}
