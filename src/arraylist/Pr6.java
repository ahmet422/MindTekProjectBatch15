package arraylist;

import java.util.Arrays;

public class Pr6 {
    public static void main(String[] args) {
        int[][] nums = new int[3][5];
        // fill all arrays in nums with value 77

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = 77;
            }
        }

        for(int[] arr : nums) System.out.println(Arrays.toString(arr));
    }
}
