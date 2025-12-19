package conditionsandloops;

import java.util.Scanner;

public class DetectDuplicate3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word: ");
        String text = input.next();
        boolean dupFound = false;
        for(int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);
            String word = text.substring(i+1);
            if(word.contains(letter + "")){
                dupFound = true;
                break;
            }
        }

        if(dupFound) System.out.println("contains duplicates");
        else System.out.println("no duplicates");
    }
}
