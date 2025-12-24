package arrays;

import java.util.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {12,56,23,0,0,89,33};
        System.out.println(Arrays.toString(arr));
        // print the total sum of all elements
        int sum = 0;
        for(int i = 0; i < arr.length; i++) sum += arr[i];
        System.out.println("sum: " + sum);

        // print the total amount of positive numbers
        int count = 0;
        for(int i = 0; i < arr.length; i++) if(arr[i]>0) count++;
        System.out.println("Total count of pos numbers: " + count);
    }
}
