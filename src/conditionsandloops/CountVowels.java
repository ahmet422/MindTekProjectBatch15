package conditionsandloops;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type any word: ");
        String text = input.next().toLowerCase();
        int i = 0, count = 0;
        while(i<text.length()){
            char letter = text.charAt(i);
            if(letter == 'a'  || letter == 'o'  ||letter == 'e'
                    || letter == 'i'  ||letter == 'u') count = count + 1;
            i++;
        }

        System.out.println("Total number of vowels: " + count);
        System.out.println("Total number of non-vowel chars: " + (text.length() - count));
    }
}
