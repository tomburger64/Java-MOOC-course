
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    // haven't coded in a whlie, had to cheat to know how to do a for each loop and to to call a mathod using the for each loop
    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            } else {
                items.add(new Item(input));
            }
        }
        
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
