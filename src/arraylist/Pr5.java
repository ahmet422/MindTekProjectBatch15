package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pr5 {
    public static void main(String[] args) {
        Integer[] nums = {12,22,21,34,56,77};
        // convert into ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums));
        System.out.println(list);

        int[] numbers = {7,98,66,12};
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int el : numbers) list2.add(el);
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);

        //sort:
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        Collections.addAll(list, 199, 789,9000);
        System.out.println(list);

        list.removeAll(Arrays.asList(56,7,12));
        System.out.println(list);

    }
}
