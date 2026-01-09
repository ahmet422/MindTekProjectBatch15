package arrays;

import java.util.Arrays;

public class FindMinAndMax3 {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,0};
        Arrays.sort(arr);
        System.out.println("Min: " + arr[0] + "\nMax: " + arr[arr.length-1]);

    }
}
