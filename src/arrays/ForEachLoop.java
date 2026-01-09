package arrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,7,1};
        System.out.println(Arrays.toString(arr));

        // traditional for loop
        for(int i = arr.length-1; i >= 0; i--) {
            arr[i] = arr[i] + 5;
        }

        System.out.println(Arrays.toString(arr));

        // : from. No indexes, start from the most left el, and visit all elements one by one
//        for(int el : arr) {
//            System.out.println(el);
//        }

    }
}
