package conditionsandloops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any word: ");
        String text = input.next();
        String reverse = "";
        int i = text.length()-1;
        while(i >= 0){
            reverse = reverse + text.charAt(i);
            i--;
        }

        if(text.equals(reverse)) System.out.println("Pal");
        else System.out.println("Not Pal");
    }
}
