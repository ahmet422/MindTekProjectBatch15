package arrays;

import java.util.Arrays;

public class CreateArrayAndPrint {
    public static void main(String[] args) {
        // create int array holding 4 elements.
        // one by one add elements: 10,20,30,40
        // print whole array
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
//        arr[12] = 80;
        System.out.println(Arrays.toString(arr));

    }
}
