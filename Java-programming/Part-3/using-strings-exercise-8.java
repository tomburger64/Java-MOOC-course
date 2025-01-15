/* Write a program that reads names and ages from the user until an empty line is entered. The name and age are separated by a comma.

After reading all user input, the program prints the age of the oldest person. You can assume that the user enters at least one person, and that one of the users is older than the others.

sebastian,2
lucas,2
lily,1
hanna,5
gabriel,10
Age of the oldest: 10 */


// what I did yesterday (doesn't work, idk why)
/* import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            int oldest = 0;
            if (input.equals("")) {
                break;
            } else {
                String[] inputs = input.split(",");
            
                for (int i = 0; i < inputs.length; i++) {
                    if (Integer.valueOf(inputs[i]) > oldest) {
                        oldest = Integer.valueOf(inputs[i]);
                    }
                }
                System.out.println("Age of the oldest: " + oldest);
            }
        }
    }
} */


// I'm so mad it worked first try after I struggled for like 40 mins on this yesterday
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            } else {
                String[] people = input.split(",");
                
                if (oldest < Integer.valueOf(people[1])) {
                    oldest = Integer.valueOf(people[1]);
                }
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
