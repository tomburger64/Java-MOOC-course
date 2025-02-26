/* Implement the class Items described here. NB! Don't modify the class Item.

Write a program that reads names of items from the user. If the name is empty, the program stops reading. Otherwise, the given name is used to create a new item, which you will then add to the items list.

Having read all the names, print all the items by using the toString method of the Item class. The implementation of the Item class keeps track of the time of creation, in addition to the name of the item.

An example of the working program is given below:

Sample output
Name: Hammer
Name: Collar
Name:

Hammer (created at: 06.07.2018 12:34:56)
Collar (created at: 06.07.2018 12:34:57) */


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    private String name;
    private LocalDateTime createdAt;

    public Item(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        return this.name + " (created at: " + formatter.format(this.createdAt) + ")";
    }
}
