/* Complete the method public static void printArrayInStars(int[] array) in the class named 'Printer' to make it print a row of stars for each number in the array. The amount of stars on each row is defined by the corresponding number in the array.

You can try out the printing with this example:

int[] array = {5, 1, 3, 4, 2};
printArrayInStars(array);

*****
*
***
****
**

The 0th element of the array is 5, so the first line has 5 stars. The next one has 1 etc. */


public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here

        for (int i = 0; i < array.length; i++) {
            int starCount = 0;

            // note to self: if doesn't alw<ays suit any condition, while is also a thing
            while (starCount < array[i]) {
                System.out.print("*");
                starCount++;
            }
            System.out.println("");
        }
    }

}
