package StringMethods;

import java.util.Scanner;

public class IsUnique {
    public static void main(String[] args) {
        // ask a user to type any word
        // ask a user to type one single letter
        // print if the given letter unique or not
        // apple    a  -> unique, p -> not unique, e -> unique

        Scanner input = new Scanner(System.in);
        System.out.println("Type a word: ");
        String text = input.next().toLowerCase();
        System.out.println("Type a letter:");
        String letter = input.next().toLowerCase();
        // check if given letter is in given text
        if(text.contains(letter)){
            if(text.indexOf(letter) == text.lastIndexOf(letter)) System.out.println("Unique");
            else System.out.println("Not unique");
        }
        else System.out.println("No such letter found!");


    }
}
