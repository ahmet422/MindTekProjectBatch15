package conditionsandloops;

import java.util.Scanner;

public class PrintLetters {
    public static void main(String[] args) {
        // print each letter in separate line
        Scanner input = new Scanner(System.in);
        System.out.println("Type any word: ");
        String text = input.next();
        int i = 0;
        while(i < text.length()){
            System.out.println("at index " + i + " -> " + text.charAt(i));
            i = i +1;
        }
    }
}
