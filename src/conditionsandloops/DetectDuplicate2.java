package conditionsandloops;

import java.util.Scanner;

public class DetectDuplicate2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a word: ");
        String text = input.next();
        boolean dupFound = false;

        for(int i = 0; i < text.length(); i++){
            char currLetter = text.charAt(i);
            System.out.println("i: " + i);
            for(int j = i+1; j < text.length(); j++){
                char anotherLetter = text.charAt(j);
                if(currLetter == anotherLetter){
                    dupFound = true;
                    break;
                }
            }
            if(dupFound) break;
        }

        if(dupFound) System.out.println("contains duplicates");
        else System.out.println("no duplicates");
    }
}
