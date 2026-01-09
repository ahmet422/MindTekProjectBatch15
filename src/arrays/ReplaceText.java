package arrays;

import java.util.Arrays;

public class ReplaceText {
    public static void main(String[] args) {
        String[] items = {"letters","vowels","mb","book","author"};
        // replace every element with word: java
        System.out.println(Arrays.toString(items));
        for(int i = items.length-1; i >= 0; i--){
            items[i] = "java";
        }
        System.out.println(Arrays.toString(items));
    }
}
