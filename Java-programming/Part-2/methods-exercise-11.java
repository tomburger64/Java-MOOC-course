/* Define a two-parameter method smallest that returns the smaller of the two numbers passed to it as parameters.

public static int smallest(int number1, int number2) {
    // write your code here
    // do not print anything inside the method

    // there must be a return command at the end
}

public static void main(String[] args) {
    int answer =  smallest(2, 7);
    System.out.println("Smallest: " + answer);
}

The output of the program:

Smallest: 2 */


public class Smallest {

    public static int smallest(int number1, int number2) {
        // Write some code here
        // don't print anything inside this method
        // there must be a return in the end of the method
        
        // if they're ==, returning any number works I guess
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
