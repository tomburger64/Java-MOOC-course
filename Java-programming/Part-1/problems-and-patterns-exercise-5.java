/* Write a program by using the loop example that asks "Shall we carry on?" until the user inputs the string "no".

Shall we carry on?
yes
Shall we carry on?
ye
Shall we carry on?
y
Shall we carry on?
no */


import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initially made the mistake of having an if statement determine if the msg was = to "no" and "break;", and then (without an 'else') print the "shall we carry" thing
        while (true) {
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            
            if (input.equals("no")) {
                break;
            }
        }
    }
}
