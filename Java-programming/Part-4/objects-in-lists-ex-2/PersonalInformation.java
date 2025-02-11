/* The program described here should be implemented in the class PersonalInformationCollection. NB! Do not modify the class PersonalInformation.

After the user has entered the last set of details (they enter an empty first name), exit the repeat statement.

Then print the collected personal information so that each entered object is printed in the following format: first and last names separated by a space (you don't print the identification number). An example of the working program is given below:

First name: Jean
Last name: Bartik
Identification number: 271224
First name: Betty
Last name: Holberton
Identification number: 070317
First name:

Jean Bartik
Betty Holberton */


public class PersonalInformation {

    private String firstName;
    private String lastName;
    private String identificationNumber;

    public PersonalInformation(String firstName, String lastName, String identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName + " (" + this.identificationNumber + ")";
    }
}
