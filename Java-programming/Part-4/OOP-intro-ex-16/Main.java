/* At the University of Helsinki student canteen, i.e. Unicafe, students pay for their lunch using a payment card. The final PaymentCard will look like the following as a class diagram:
Payment card
- - - - - - -
- balance double
- - - - - - - - - -
+paymentCard(double)
+eatAffordably():void
+eatHartily():void
+addMoney(double):void
+toString():String

In this exercise series, a class called PaymentCard is created which aims to mimic Unicafe's payment process

Part 1: The class template
The project will include two code files:

The exercise template comes with a code file called Main, which contains the main method.

Add a new class to the project called PaymentCard. Here's how to add a new class: On the left side of the screen is the list of projects. Right-click on the project name. Select New and Java Class from the drop-down menu. Name the class as "PaymentCard".

First, create the PaymentCard object's constructor, which is passed the opening balance of the card, and which then stores that balance in the object's internal variable. Then, write the toString method, which will return the card's balance in the form "The card has a balance of X euros".

The following is the template of the PaymentCard class:

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
    }

    public String toString() {
        // write code here
    }
}
The following main program tests the class:

public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);
    }
}
The program should print the following:

The card has a balance of 50.0 euros */


public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

    }
}
