/* The exercise template comes with two files, names.txt and other-names.txt. Write a program that first asks the user for the name of the file to be read, after which the user is prompted for the string that they're looking for. The program then reads the file and searches for the desired string.

If the string is found, the program should print "Found!". If not, the program should print "Not found.". If reading the file fails (the reading ends in an error) the program should print the message "Reading the file " + file + " failed.".

Name of the file:
names.txt
Search for:
Antti
Not found.

Name of the file:
names.txt
Search for:
ada
Found!

Name of the file:
nonexistent.txt
Search for:
test
Reading the file nonexistent.txt failed. */


import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

    }
}
