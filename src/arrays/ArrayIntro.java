package arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // array : how to create ?
        // -> type[] name = new type[size];
        int[] nums = new int[5];
        System.out.println(nums);
        // how to print? -> Arrays.toString(arr);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums.length);

        //override value: arr[index] = val;
        //override first element to have value: 10
        nums[0] = 10;
        System.out.println(Arrays.toString(nums));
        // override last element to have value: 7
        nums[nums.length-1] = 7;
        System.out.println(Arrays.toString(nums));

        nums[nums.length-1] = 700;
        System.out.println(Arrays.toString(nums));

        // retrieve/get specific element from array?
        System.out.println("el located at index 0 is " + nums[0]);
        int lastEl = nums[nums.length-1];
        System.out.println("el located at last index is " + lastEl);

        // what if we already know element we want our array needs to store: 100, 120, 145
        int[] arr1 = new int[3];
        arr1[0] = 100;
        arr1[1] = 120;
        arr1[2] = 145;
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{100,120,145};
        System.out.println("arr2: " + Arrays.toString(arr2));

        int[] arr3 = {100,120,145};
        System.out.println("arr3: " + Arrays.toString(arr3));

    }
}
