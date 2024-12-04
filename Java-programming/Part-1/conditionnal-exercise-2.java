/* The exercise template contains a program demonstrating the use of conditional statements. It is, however, incorrectly indented.

Try to run the tests before doing anything. TMC shows the indentation errors differently compared to errors in program logic.

When you notice how indentation errors are shown, correct them. Now would be a good time to give the automatic code formatting a try. */


// leaving original template so you don't have to go through the commit history, with indentation errors :
/* import java.util.Scanner;

public class CheckYourIndentation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
System.out.println("Give a number: ");
int first = Integer.valueOf(scan.nextLine());
System.out.println("Give another number: ");
int second = Integer.valueOf(scan.nextLine());
if (first == second) { System.out.println("Same!"); }
else if (first > second) { System.out.println("The first was larger than the second!"); }
else {
System.out.println("The second was larger than the first!");
}
        

    }
} */


// my solution
import java.util.Scanner;

public class CheckYourIndentation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Give another number: ");
        int second = Integer.valueOf(scan.nextLine());
        if (first == second) {
            System.out.println("Same!");
        } else if (first > second) {
            System.out.println("The first was larger than the second!");
        } else {
            System.out.println("The second was larger than the first!");
        }
        // if I hadn't seen the example of "fusing" the if statements ending with the following "else if" / "else"a few times online, I couldn't have known that without cheating
        // that wasn't in the documentation / given examples at all

    }
}

