
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("First name: ");
            String firstName = scanner.nextLine();
            
            if (firstName.equals("")) {
                break;
            }
            
            System.out.println("Last name: ");
            String lastName = scanner.nextLine();
            
            System.out.println("Identification number: ");
            String idNum = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, idNum));
        }
        
        for (PersonalInformation Info : infoCollection) {
            System.out.println(Info.getFirstName() + " " + Info.getLastName());
        }

    }
}

// starting to get a hang of it, it's really similar to the stuff I did in my JS repo with the temporary variables (that really helped)
