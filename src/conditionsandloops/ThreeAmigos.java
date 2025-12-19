package conditionsandloops;

import java.util.Scanner;

public class ThreeAmigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any word: ");
        String text = input.next();
        boolean amigosFound = false;
        int i = 2;
        while(i < text.length()){
            if(text.charAt(i) == text.charAt(i-1) && text.charAt(i) == text.charAt(i-2)) {
                amigosFound = true;
                break;
            }
            i++;
        }

        if(amigosFound) System.out.println("3 amigos found!");
        else System.out.println("3 amigos not found!");
    }
}
