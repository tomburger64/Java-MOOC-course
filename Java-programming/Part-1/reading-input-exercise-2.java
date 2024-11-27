/* Modify the program so that it prints the contents of the variable name, and the printed text is the following in its full form:
Hi Ada Lovelace!
NB! When using the System.out.println command, do not pass in the string "Ada Lovelace" as a parameter. Instead, use the existing variable name: System.out.println("Hi " + ...)
*/

public class HiAdaLovelace {

    public static void main(String[] args) {
        String name = "Ada Lovelace";

        System.out.println("Hi " + name + "!");
    }
}
