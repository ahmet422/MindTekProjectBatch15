package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Pr3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("office","books","shelves","laptops","cables"));
        System.out.println(words);
        // count the total number of vowels in words
        int count = 0;
//        for(String el : words){
//            for(int i = 0; i < el.length(); i++){
//                char letter = el.charAt(i);
//                boolean isVowel = letter == 'a' || letter== 'e' || letter == 'o'
//                        || letter == 'i' || letter == 'u';
//                if(isVowel) count++;
//            }
//        }

        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','o','i','u'));
        ArrayList<Character> myVowels = new ArrayList<>();
        for(String el : words){
            for(char letter : el.toCharArray()){
                if(vowels.contains(letter)) {
                    count++;
                    myVowels.add(letter);
                }
            }
        }
        System.out.println(count);
        System.out.println(myVowels);
    }
}
