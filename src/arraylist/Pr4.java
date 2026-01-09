package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Pr4 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12,11,12,11,12,34,56,32,54,54,65,65,11));
        // create a new arraylist having all numbers from nums max 1 time
        ArrayList<Integer> list = new ArrayList<>();
        for(int el : nums){
            if(!list.contains(el)) list.add(el);
        }

        System.out.println(list);
    }
}
