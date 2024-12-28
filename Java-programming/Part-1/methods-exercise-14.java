/* NB! By submitting a solution to a part of an exercise which has multiple parts, you can get part of the exercise points. You can submit a part by using the 'submit' button on NetBeans. More on the programming exercise submission instructions: Exercise submission instructions.
Part 1: Printing stars

Define a method called printStars that prints the given number of stars and a line break.

Write the method in the following template:

public static void printStars(int number) {
    // you can print one star with the command
    // System.out.print("*");
    // call the print command n times
    // in the end print a line break with the comand
    // System.out.println("");
}

public static void main(String[] args) {
    printStars(5);
    printStars(3);
    printStars(9);
}

The output of the program:


*****
***
*********

N.B multipart exercises can be uploaded to the server (click the button to the right of the testing button) even if some parts are unfinished. In this case the server will complain about the tests for the parts that haven't been completed, but it will mark down the finished parts.

Part 2: Printing a square

Define a method called printSquare(int size) that prints a suitable square with the help of the printStars method. So the method call printSquare(4) results in the following output:


****
****
****
****

N.B.: producing the correct output is not enough; the rows of the square must be produced by calling the printStars method inside the printSquaremethod.

When creating the program, you can use the code in the main to test that the methods behave as required.

Part 3: Printing a rectangle

Write a method called printRectangle(int width, int height) that prints the correct rectangle by using the printStars method. So the method call printRectangle(17, 3) should produce the following output:

*****************
*****************
***************** */


public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        System.out.println("stars");
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        System.out.println("square");
        printSquare(4);
        printSquare(6);
        printSquare(1); // works lol
        System.out.println("\n---");
        System.out.println("rectangle");
        printRectangle(5, 6);
        printRectangle(2, 4);
        printRectangle(3, 3);
        System.out.println("\n---");
        System.out.println("triangle");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        String stars = "";
        for (int n = 0; n < number; n++) {
            stars += "*";
        }
        System.out.println(stars);
    }

    public static void printSquare(int size) {
        // second part of the exercise
        for (int n = 0; n < size; n++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for (int n = 0; n < width; n++) {
            printStars(height);
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
    }
}
