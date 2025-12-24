package arrays;

import java.util.Arrays;

public class ModifyArray {
    public static void main(String[] args) {
        int[] arr = {12,56,23,0,0,89,33};
        System.out.println(Arrays.toString(arr));
        // if el is even then add 10
        // if el is odd then subtract 10
        // if el is 0 then add 100
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) arr[i] = 100;
            else if(arr[i]%2 == 0) arr[i] = arr[i] + 10;
            else arr[i] = arr[i] - 10;
        }

        System.out.println(Arrays.toString(arr));
    }
}
