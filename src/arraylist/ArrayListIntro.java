package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        //array:
        int[] arr = new int[3];
        arr[1] = 99;
        System.out.println(Arrays.toString(arr));

        //arraylist:
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(112);
        list.add(200);
        list.add(0,45);
        System.out.println(list);
        list.add(2,700);
        System.out.println(list);
        list.remove((Integer)700);
        System.out.println(list);
        // read el located at index i
        int num = list.get(1);
        System.out.println(num);
        System.out.println(list.get(0));
        System.out.println("size: " + list.size());
        list.set(3,300);
        System.out.println(list);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12,56,89,32,45,23,67,45));
        System.out.println(nums);


    }
}
