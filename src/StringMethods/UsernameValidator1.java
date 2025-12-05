package StringMethods;

import java.util.Scanner;

public class UsernameValidator1 {
    public static void main(String[] args) {
        // ask a user to create a new username
        // all usernames must have minimum 5 chars
        // check if given username is valid or not.
        // If not valid print: This username is not valid. It must have at least 5 characters.
        // otherwise print: username is accepted.

        // Type your new username:
        Scanner input = new Scanner(System.in);
        System.out.println("Type a new username:");
        String uname = input.next();
        if(uname.length() >= 5) System.out.println("username is accepted");
        else System.out.println("This username is not valid. It must have at least 5 characters.");

//        String movie = "Titanic";
//        // find out if k does not exist in movie
//        System.out.println(movie.indexOf('x'));
    }
}
