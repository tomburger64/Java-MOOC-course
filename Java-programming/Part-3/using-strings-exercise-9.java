/* Write a program that reads names and ages from the user until an empty line is entered. The name and age are separed by a comma.

After reading all user input, the program prints the name of the oldest person. You can assume that the user enters at least one person, and the that one of the users is older than the others.

sebastian,2
lucas,2
lily,1
hanna,5
gabriel,10

Name of the oldest: gabriel */


import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestName = "";
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            } else {
                String[] people = input.split(",");
                
                if (oldest < Integer.valueOf(people[1])) {
                    oldest = Integer.valueOf(people[1]);
                    oldestName = people[0];
                }
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
