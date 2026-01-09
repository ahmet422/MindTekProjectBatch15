package arrays;

import java.util.Arrays;

public class IsIncreasing {
    public static void main(String[] args) {
        int[] arr = {12,34,45,7};
        System.out.println(Arrays.toString(arr));
        // print if arr has increasing order
        boolean isIncOrder = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i+1] < arr[i]) {
                isIncOrder = false;
                break;
            }
        }

        if(isIncOrder) System.out.println("Is in increasing order");
        else System.out.println("Is not in increasing order");
    }
}
