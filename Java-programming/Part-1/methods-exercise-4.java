/* Create the following method in the exercise template: public static void printFromNumberToOne(int number). It should print the numbers from the number passed as a parameter down to one. Two examples of the method's usage are given below.

public static void main(String[] args) {
    printFromNumberToOne(5);
}

5
4
3
2
1


public static void main(String[] args) {
    printFromNumberToOne(2);
}


2
1 */



    public class FromParameterToOne {

        // can't seem to pass the exercise as I get an "indentation error", yet can't find one and the error message doesn't mean anything ("line 3 expected 0 but was 4" and more)

        public static void main(String[] args) {
            printFromNumberToOne(3);
        }
        
        public static void printFromNumberToOne(int number) {
            number += 1;
            for (int i = 1; number != i; number--) {
                System.out.println(number - 1);
            }
        }

    }
