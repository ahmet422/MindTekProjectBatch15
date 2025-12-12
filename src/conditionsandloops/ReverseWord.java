package conditionsandloops;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any word: ");
        String text = input.next();
        String res = "";
        int i = text.length()-1;
        while(i >= 0){
            res = res + text.charAt(i);
            i--;
        }
        System.out.println(res);

    }
}
