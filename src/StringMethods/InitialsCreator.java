package StringMethods;

import java.util.Scanner;

public class InitialsCreator {
    public static void main(String[] args) {
        // ask a user fName and lName, then print initials
        // Type firstname: Jess
        // Type lastname: Smith
        // Your initials: J.S.
        Scanner input = new Scanner(System.in);
        System.out.println("Firstname: ");
        String fname = input.next();
        System.out.println("LastName:");
        String lname = input.next();
        System.out.println("Your initials: " + fname.charAt(0) + "." + lname.charAt(0) + ".");
    }
}
