/* Write a program that prompts the user for a filename, as well as the upper and lower bounds for the accepted range of numbers. Then the program reads the numbers contained in the file (each number is on its own line) and only accounts for the numbers which are inside the given range. Finally, the program should print the number of numbers that were inside the given range.

You can convert a string-type integer read from a file into a proper integer using the command Integer.valueOf (just as when handling input from a user).

Sample output
File? numbers-1.txt
Lower bound? 15
Upper bound? 20
Numbers: 2

Sample output
File? numbers-1.txt
Lower bound? 0
Upper bound? 300
Numbers: 4

NB! The exercise template comes with two files, numbers-1.txt and numbers-2.txt that have the following contents. Do not change the contents of these files.

numbers-1.txt:

Sample data
300
9
20
15

numbers-2.txt:

Sample data
123
-5
12
67
-300
1902 */


import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        ArrayList<Integer> readNumList = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                
                /* This is what I did originally:
                if (Integer.valueOf(fileReader.nextLine()) >= lowerBound && Integer.valueOf(fileReader.nextLine()) <= upperBound) {
                    // once converted to integer too,
                    // what's read is added to the list
                    // and the num count adds 1 to itself
                    readNumList.add(Integer.valueOf(fileReader.nextLine()));
                    count++;
                }

                I had to cheat with ai to discover that you can't do the "fileReader.nextLine()" more than once, at least in this context
                My guess is that it's probably because it already is in a while loop and the timing is too fast to allow such a thing, hence why it was skipping some lines from being added to the list */
                
                /* once converted to integer via another variable (so it's reusable for both elements of the condition)
                if what the file reader's reading is = or between the bounds */
                int currentNum = Integer.valueOf(fileReader.nextLine());
                if (currentNum >= lowerBound && currentNum <= upperBound) {
                    // what was read is added to the list
                    // the num count adds 1 to itself
                    readNumList.add(currentNum);
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Numbers: " + count);
    }

}
