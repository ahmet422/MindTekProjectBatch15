package firstpackage;

import java.util.Scanner;

public class FullNamePrinter {
    public static void main(String[] args) {
        // ask a user their fname and lname.
        // then print it as a fullname
        Scanner input = new Scanner(System.in);
        System.out.println("Your first name:");
        String fname = input.next();
        System.out.println("Your last name:");
        String lname = input.next();
        String fullName = fname + " " + lname;
        System.out.println("Your fulname is: " + fullName);

    }
}
