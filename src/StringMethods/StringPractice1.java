package StringMethods;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        // ask a user to enter a word
        // if size of word is odd then print the letter in the middle: water -> t, sun -> u
        // if the size is even then print 2 letters in the middle: moon -> oo, mother -> th
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word: ");
        String text = input.next();

        if(text.length() % 2 == 0){
            int leftMindex = (text.length()-1)/2;
            System.out.println("" + text.charAt(leftMindex) + text.charAt(leftMindex+1));
        }else{
            int middIndex = (text.length()-1)/2;
            char midLetter = text.charAt(middIndex);
            System.out.println(midLetter);
        }
    }
}
