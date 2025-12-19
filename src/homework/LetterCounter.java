package homework;

import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("word: ");
        String text = input.next();
        System.out.println("letter: ");
        String letter = input.next();
        int counter = 0;
        int i = 0;

        while(i < text.length()){
            System.out.println("val of i: " + i);
            String currLetter = text.charAt(i) + "";
            if(currLetter.equals(letter)) counter++;
            System.out.println("current letter: " + currLetter + ", current counter val:" + counter);
            i++;
        }

        System.out.println("Number of " +  letter + " characters in " + text + " is " + counter);
    }
}
