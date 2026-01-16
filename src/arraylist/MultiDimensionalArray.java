package arraylist;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
//        int[] nums = new int[5];
//        System.out.println(Arrays.toString(nums));

        int[][] coordinates = new int[3][3];
        for(int[] array : coordinates)
            System.out.println(Arrays.toString(array));

        System.out.println("============");
        coordinates[0][0] = 99;
        coordinates[1][1] = 88;
        coordinates[2][2] = 77;

        for(int[] array : coordinates)
            System.out.println(Arrays.toString(array));
    }
}
