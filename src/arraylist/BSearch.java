package arraylist;

import java.util.Arrays;

public class BSearch {
    public static void main(String[] args) {
        // binary search:

        int[] arr = {1,2,3,4,5,6,7,8,9,12,23,34,45,56,67,78,89,99,123,234,345,456,567,678,789,4000};
        int index = Arrays.binarySearch(arr,4000);
        System.out.println(index);

        int anotherIndex = findIndex(arr,789);
        System.out.println(anotherIndex);
    }

    // linear algo: check every element one by one
    private static int findIndex(int[] array, int el){
        for(int i = 0; i < array.length; i++){
            if(array[i] == el) return i;
        }
        return -1;
    }
}
