/* In this exercise, we'll be working with files stored in CSV-format that contain names and ages separated by commas. The file format may look like this:

Sample data
lily,3
anton,5
levi,4
amy,1

Your task is to write a program that first prompts the user for the name of the file they want to read. The program then prints the content of the file in the following way (we're assuming below that the output is from the above-mentioned file):

Sample output
Name of the file:
data.txt
lily, age: 3 years
anton, age: 5 years
levi, age: 4 years
amy, age: 1 year

NB! The word "year" should be formatted based on the age. */


import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()){
                String currentLine = fileReader.nextLine();
                String[] splitting = currentLine.split(",");
                
                // print the right stuff
                // determine if you write "10 years" or "10 year" depending on the num
                String name = splitting[0];
                int age = Integer.valueOf(splitting[1]);
                String yearOrS;
                if (age > 1) {
                    yearOrS = " years";
                } else {
                    yearOrS = " year";
                }
                System.out.println(name + ", age: " + age + yearOrS);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
