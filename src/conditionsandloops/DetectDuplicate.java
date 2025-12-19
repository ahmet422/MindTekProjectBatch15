package conditionsandloops;

import java.util.Scanner;

public class DetectDuplicate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type a word: ");
        String text = input.next();
        // print if the word contains duplicate letters
        // water, radio, pen, table -> no duplicates,
        // mom,chicago, book  -> contains duplicates
        //

        boolean dupFound = false;

        for(int i = 0; i < text.length(); i++){
          char letter = text.charAt(i);
          if(text.indexOf(letter) != text.lastIndexOf(letter)){
              dupFound = true;
              break;
          }
        }

        if(dupFound) System.out.println("contains duplicates");
        else System.out.println("no duplicates");

    }
}
