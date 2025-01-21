/* Create a class named Room. Add the variables private String code and private int seats to the class. Then create a constructor public Room(String classCode, int numberOfSeats) through which values are assigned to the instance variables.

Room
---
-code:String
-numberOfSeats:int
---
+Room(String,int)

This class doesn't do much either. However, in the following exercise the object instantiated from our class is already capable of printing text.*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomla
 */
public class Room {
    private String code;
    private int seats;
    
    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }
}
