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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomla
 */
public class Whistle {
    private String sound;
    
    public Whistle(String whistleSound) {
        this.sound = whistleSound;
        System.out.println(whistleSound);
    }
    
    public void sound() {
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
