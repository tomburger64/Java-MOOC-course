/* Create a class named Whistle. Add the variable private String sound to the class. After that, create the constructor public Whistle(String whistleSound), which is used to create a new whistle that's given a sound.

Then create the method public void sound() that prints the whistle's sound.

Whistle duckWhistle = new Whistle("Kvaak");
Whistle roosterWhistle = new Whistle("Peef");

duckWhistle.sound();
roosterWhistle.sound();
duckWhistle.sound();



Kvaak
Peef
Kvaak */


//  will probably start making folders for exercises now since they're starting to use a few files
// a few new concepts to me, will take notes for myself

//main

public class Main {

    public static void main(String[] args) {
        // This is just an empty main method you can use to test
        // the Whistle class. Try for example:

        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}


// class
/**
 *
 * @author tom64
 */
public class Whistle {
    // making private string var
    private String sound;
    
    public Whistle(String whistleSound) {
    // making the creator, taking in argument a string (will be given when called from main)
        this.sound = whistleSound;
        // makes the private var = to the value of the given value
    }
    
    public void sound() {
    // simply prints the private var which just took the value of the given value through the constructor
        System.out.println(this.sound);
    }
}

