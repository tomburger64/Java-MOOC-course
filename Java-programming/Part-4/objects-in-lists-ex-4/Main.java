/* Write a program that first reads book information from the user. The details to be asked for each book include the title, the number of pages and the publication year. Entering an empty string as the name of the book ends the reading process.

After this the user is asked for what is to be printed. If the user inputs "everything", all the details are printed: the book titles, the numbers of pages and the publication years. However, if the user enters the string "name", only the book titles are printed.

It is probably worthwhile to implement a class called Book to represent a book. There are two points in total available for this exercise.



Title: To Kill a Mockingbird
Pages: 281
Publication year: 1960
Title: A Brief History of Time
Pages: 256
Publication year: 1988
Title: Beautiful Code
Pages: 593
Publication year: 2007
Title: The Name of the Wind
Pages: 662
Publication year: 2007
Title:

What information will be printed? everything
To Kill a Mockingbird, 281 pages, 1960
A Brief History of Time, 256 pages, 1988
Beautiful Code, 593 pages, 2007
The Name of the Wind, 662 pages, 2007



Title: To Kill a Mockingbird
Pages: 281
Publication year: 1960
Title: A Brief History of Time
Pages: 256
Publication year: 1988
Title: Beautiful Code
Pages: 593
Publication year: 2007
Title: The Name of the Wind
Pages: 662
Publication year: 2007
Title:

What information will be printed? name
To Kill a Mockingbird
A Brief History of Time
Beautiful Code
The Name of the Wind */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.equals("")) {
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, pubYear));
        }
        
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();
        
        if (input.equals("everything")){
            for (Book book : books) {
                System.out.println(book.returnE());
            }
        } else if (input.equals("name")) {
            for (Book book : books) {
                System.out.println(book.returnTitle());
            }
        }
    }
}
