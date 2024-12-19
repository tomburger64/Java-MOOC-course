/* Create the following method in the exercise template: public static void printUntilNumber(int number). It should print the numbers from one to the number passed as a parameter. Two examples of the method's usage are given below.

public static void main(String[] args) {
    printUntilNumber(5);
}

1
2
3
4
5

public static void main(String[] args) {
    printUntilNumber(2);
}

1
2 */



public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(3);
    }
    
    public static void printUntilNumber(int number) {
        for (int i = 0; i != number; i++) {
            System.out.println(i + 1);
        }
    }

}
