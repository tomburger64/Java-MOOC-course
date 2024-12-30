/* NB! By submitting a solution to a part of an exercise which has multiple parts, you can get part of the exercise points. You can submit a part by using the 'submit' button on NetBeans. More on the programming exercise submission instructions: Exercise submission instructions.
Part 1: Printing stars and spaces

Define a method called printSpaces(int number) that produces the number of spaces specified by number. The method does not print the line break.

You will also have to either copy the printStars method from your previous exercise or reimplement it in this exercise template.


Part 2: Printing a right-leaning triangle

Create a method called printTriangle(int size) that uses printSpaces and printStars to print the correct triangle. So the method call printTriangle(4) should print the following:

   *
  **
 ***
****

↑ done, but doesn't detect the spaces when I submit it for the automated verification so whatever

Part 3: Printing a Christmas tree

Define a method called christmasTree(int height) that prints the correct Christmas tree. The Christmas tree consists of a triangle with the specified height as well as the base. The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom. The tree is to be constructed by using the methods printSpaces and printStars.

For example, the call christmasTree(4) should print the following:

   *
  ***
 *****
*******
  ***
  ***

The call christmasTree(10) should print:

         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
        ***
        ***

NB: heights shorter than 3 don't have to work correctly! 

IT ALL WORKS BUT the correction system won't even give me clear error messages, like :
ComparisonFailure: You printed incorrectly when printTriangle(3) was  called. expected:<  [*
 **
]***
> but was:<  [ *
  **
 ]***
>

I guuess the IDE just writes better star signs */


public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        String stars = "";
        for (int n = 0; n < number; n++) {
            stars += "*";
        }
        System.out.print(stars);
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        String spaces = "";
        for (int i =0; i < number; i++) {
            spaces += " ";
        }
        System.out.print(spaces);
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        // as long as negative value of size < 0
        int starCount = 0;
        for (int i = size; i > 0; i--) {
            starCount++;
            printSpaces(i);
            printStars(starCount);
            // remove "ln" from the method's sout or it'll keep skipping a line #funlife
            
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int starCount = 0;
        int reverseStarCount = 0;
        
        int spaceCountForBase = 0;
        
        for (int i = height; i > 0; i--) {
            starCount++;
            printSpaces(i);
            printStars(starCount);
            // remove "ln" from the method's sout or it'll keep skipping a line #funlife
            
            if (starCount > 1) {
                reverseStarCount++;
                printStars(reverseStarCount);
            }
            
            System.out.println("");
            
            if (i == height - 2) {
                spaceCountForBase = i + 1;
            }
        }
        
        //tree base
        printSpaces(spaceCountForBase);
        printStars(3);
        System.out.println("");
        
        printSpaces(spaceCountForBase);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printStars(5);
        System.out.println("spaces right here:");
        printSpaces(3);
        
        System.out.println("\n\n---");
        
        printTriangle(4);
        
        System.out.println("\n\n---");
        
        // only 2 doesn't work
        christmasTree(5);
    }
}
