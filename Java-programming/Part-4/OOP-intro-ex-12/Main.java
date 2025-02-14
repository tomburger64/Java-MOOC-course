/* Create the class Gauge. The gauge has the instance variable private int value, a constructor without parameters (sets the initial value of the meter variable to 0), and also the following four methods:

    Method public void increase() grows the value instance variable's value by one. It does not grow the value beyond five.
    Method public void decrease() decreases the value instance variable's value by one. It does not decrease the value to negative numbers.
    Method public int value() returns the value variable's value.
    Method public boolean full() returns true if the instance variable value has the value five. Otherwise, it returns false.

An example of the class in use.

Gauge g = new Gauge();

while(!g.full()) {
    System.out.println("Not full! Value: " + g.value());
    g.increase();
}

System.out.println("Full! Value: " + g.value());
g.decrease();
System.out.println("Not full! Value: " + g.value());

Sample output

Not full! Value: 0
Not full! Value: 1
Not full! Value: 2
Not full! Value: 3
Not full! Value: 4
Full! Value: 5
Not full! Value: 4 */

public class Main {

    public static void main(String[] args) {
        // Test your Gauge class here

        Gauge g = new Gauge();

        while(!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
    }
}
