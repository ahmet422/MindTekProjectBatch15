package StringMethods;

import java.util.Scanner;

public class CheckIfContains {
    public static void main(String[] args) {
//        String text = "programming language";
//        System.out.println(text.contains("i"));
        // ask a user to type any word
        // check if in given word there is a vowel letter
        // print "Vowel exist" if found, otherwise "Vowel not found"
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a word:");
        String text = input.next().toLowerCase();
        System.out.println("Given text: " + text);
        boolean hasVowel = text.contains("a") || text.contains("o") ||
                text.contains("e") || text.contains("u") || text.contains("i");
        if(hasVowel) System.out.println("Vowel found!");
        else System.out.println("Vowel not found!");
    }
}
