/* The exercise template contains a program that prints the following:

Chicken:
3
Bacon (kg):
5.5
Tractor:
None!

And finally, a summary:
3
5.5
None!

Modify the program in the given places so that it outputs the following:
Chicken:
9000
Bacon (kg):
0.1
Tractor:
Zetor

And finally, a summary:
9000
0.1
Zetor */


public class VariousVariables {

    public static void main(String[] args) {
        // MODIFY THESE:

        int numberOfChicken = 3;
        double baconWeight = 5.5;
        String tractor = "None!";

        // DON'T MODIFY THESE:
        System.out.println("Chicken:");
        System.out.println(numberOfChicken);
        System.out.println("Bacon (kg):");
        System.out.println(baconWeight);
        System.out.println("Tractor:");
        System.out.println(tractor);
        System.out.println("");
        System.out.println("And finally, a summary:");
        System.out.println(numberOfChicken);
        System.out.println(baconWeight);
        System.out.println(tractor);
    }
}
