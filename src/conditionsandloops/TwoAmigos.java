package conditionsandloops;

import java.util.Scanner;

public class TwoAmigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any word: ");
        String text = input.next();
        boolean amigosFound = false;
        int i = 0;
        while(i < text.length()-1){
            if(text.charAt(i) == text.charAt(i+1)) {
                amigosFound = true;
                break;
            }
            i++;
        }

        if(amigosFound) System.out.println("2 amigos found!");
        else System.out.println("2 amigos not found!");
    }
}
