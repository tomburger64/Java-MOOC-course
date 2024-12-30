/* NB! By submitting a solution to a part of an exercise which has multiple parts, you can get part of the exercise points. You can submit a part by using the 'submit' button on NetBeans. More on the programming exercise submission instructions: Exercise submission instructions.
Part 1: Printing stars and spaces

Define a method called printSpaces(int number) that produces the number of spaces specified by number. The method does not print the line break.

You will also have to either copy the printStars method from your previous exercise or reimplement it in this exercise template.


Part 2: Printing a right-leaning triangle

Create a method called printTriangle(int size) that uses printSpaces and printStars to print the correct triangle. So the method call printTriangle(4) should print the following:

   *
  **
 ***
**** */


public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        String stars = "";
        for (int n = 0; n < number; n++) {
            stars += "*";
        }
        System.out.println(stars);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        String spaces = "";
        for (int i =0; i < number; i++) {
            spaces += " ";
        }
        System.out.println(spaces);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printStars(5);
        System.out.println("spaces right here:");
        printSpaces(3);
    }
}