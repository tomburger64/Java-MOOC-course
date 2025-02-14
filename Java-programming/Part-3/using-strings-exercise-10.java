/* Write a program that reads names and birth years from the user until an empty line is entered. The name and birth year are separated by a comma.

After that the program prints the longest name and the average of the birth years. If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.



sebastian,2017
lucas,2017
lily,2017
hanna,2014
gabriel,2009

Longest name: sebastian
Average of the birth years: 2014.8



sauli,1948
tarja,1943
martti,1936
mauno,1923
urho,1900

Longest name: martti
Average of the birth years: 1930.0 */


import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sum = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            } else {
                String[] people = input.split(",");
                
                if (longestName.length() < people[0].length()) {
                    longestName = people[0];
                }
                sum += Integer.valueOf(people[1]);
                count ++;
            }
        }
        
        double avg = 1.00 * sum / count;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);
    }
}
