package conditionsandloops;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any word: ");
        String text = input.next();
        int li = 0, ri = text.length()-1;
        boolean isPal = true;
        while(li<ri){
            if(text.charAt(li) != text.charAt(ri)){
                isPal = false;
                break;
            }
            li++;
            ri--;
        }

        if(isPal) System.out.println("It is a pal");
        else System.out.println("not a pal");
    }
}
