package arrays;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String[] words = {"java","abc","a","computer"};
        // reverse every word in words array and print the array
        // [avaj, cba, a, retupmoc]
        System.out.println(Arrays.toString(words));

        for(int index = 0; index < words.length; index++){
            String el = words[index];
            String rev = "";
            for(int i = el.length()-1; i >=0; i--){
                rev = rev + el.charAt(i);
            }
            words[index] = rev;
        }
        System.out.println(Arrays.toString(words));
    }
}
