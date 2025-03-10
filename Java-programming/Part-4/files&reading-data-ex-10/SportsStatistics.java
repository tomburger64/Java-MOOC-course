/* In this exercise, we'll be working with files stored in CSV format. Each line of the file contains the home team, visiting team, home team points, and visiting team points, all separated by commas.

You can see an example below of the file's contents. The file shown below is also included in the exercise template with the name "data.csv".

Sample data
ENCE,Vitality,9,16
ENCE,Vitality,16,12
ENCE,Vitality,9,16
ENCE,Heroic,10,16
SJ,ENCE,0,16
SJ,ENCE,3,16
FURIA,NRG,7,16
FURIA,Prospects,16,1

Write a program that prompts the user for a filename, after which it reads the match statistics from the file. The program then prompts the user for the name of a team, and prints the data specified in the following parts for that team.

Part 1: Games Played
Implement the ability to output the number of games played by any given team. We're using the above-mentioned data.csv file.

Sample output
File:
data.csv
Team:
FURIA
Games: 2

Sample output
File:
data.csv
Team:
ENCE
Games: 6

Part 2: Wins and Losses
Extend the program so that it has the ability to print the number of wins and losses of a given team. The winner of a game is the team that has gained more points from it.

You may assume that the games cannot be tied. Below, we're using the above-mentioned data.csv file.

Sample output
File:
data.csv
Team:
FURIA
Games: 2
Wins: 1
Losses: 1

Sample output
File:
data.csv
Name:
ENCE
Games: 6
Wins: 3
Losses: 3 */


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String file = scanner.nextLine();
        
        System.out.println("Team:");
        String team = scanner.nextLine();
        
        int gameCount = 0;
        int wins = 0;
        int losses = 0;
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] splits = line.split(",");
                
                if (team.equals(splits[0])) {
                    gameCount++;
                    
                    // if the team won or nah
                    if (Integer.valueOf(splits[2]) > Integer.valueOf(splits[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (team.equals(splits[1])) {
                    gameCount++;
                    
                    // if the team won or nah
                    if (Integer.valueOf(splits[3]) > Integer.valueOf(splits[2])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
