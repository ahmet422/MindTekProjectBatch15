package StringMethods;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word having 5 letters:");
        String text = input.next();

        // check if text size is 5,
        // if size is 5, print "good word", otherwise print "not 5 letters"
        if(text.length() == 5){
            String rev = "" + text.charAt(4) + text.charAt(3) + text.charAt(2) + text.charAt(1) +text.charAt(0);
            System.out.println(rev);
        }else System.out.println("Not 5 letters");
    }
}
