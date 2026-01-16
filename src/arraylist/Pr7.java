package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Pr7 {
    public static void main(String[] args) {
        int[][] nums = {{12,34,56}, {3,5,7},{77,43,11}};
        // task: find the total sum of all elements in nums
        int sum = 0;
//        for(int i = 0; i < nums.length; i++){
//            for(int j = 0; j < nums[i].length; j++){
//                sum = sum + nums[i][j];
//            }
//        }

        for(int[] arr : nums){
            for(int el : arr){
                sum = sum + el;
            }
        }

        System.out.println("Sum: " + sum);

        ArrayList<ArrayList<Integer>> list = new ArrayList();
        list.add(new ArrayList<>(Arrays.asList(1,2,5)));
        list.add(new ArrayList<>(Arrays.asList(5,7,5)));

        System.out.println(list);
    }
}
