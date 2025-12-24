package arrays;

import java.util.Arrays;

public class PrintElementsOfArray {
    public static void main(String[] args) {
        int[] arr = {11,12,13,14};
        // print each element in a new line with its index: index 0 -> 11
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++)
            System.out.println("index " + i + " -> " + arr[i]);

        // add 5 to each element, then print the whole array
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 5;
        }
        System.out.println(Arrays.toString(arr));
    }
}
