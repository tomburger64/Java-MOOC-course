/* The exercise template defines an Agent class, having a first name and last name. A print method is defined for the class that creates the following string representation.

Agent bond = new Agent("James", "Bond");
bond.print();



My name is Bond, James Bond

Remove the class' print method, and create a public String toString() method for it, which returns the string representation shown above.

The class should function as follows.

Agent bond = new Agent("James", "Bond");

bond.toString(); // prints nothing
System.out.println(bond);

Agent ionic = new Agent("Ionic", "Bond");
System.out.println(ionic);



My name is Bond, James Bond
My name is Bond, Ionic Bond */



public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }
    
    public void print() {
    System.out.println("My name is " + this.lastName + ", " + this.firstName + " " + this.lastName);
    }
    
}
