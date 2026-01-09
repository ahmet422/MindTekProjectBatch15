package arrays;

import java.util.Arrays;

public class CountSizes {
    public static void main(String[] args) {
        String[] items = {"letters","vowels","mb","book","author"};
        //create a new array that holds size of each word in items array
        int[] sizes = new int[items.length];
        for(int i = 0; i < items.length; i++) {
            String el = items[i];
            sizes[i] = el.length();
        }
        System.out.println(Arrays.toString(sizes));
    }
}
