package arrays;

public class FindMinAndMax2 {
    public static void main(String[] args) {
        int[] arr = {1000,12,34,45,7,-666, 45000};
        // print the min element and the max element
        int min = arr[0], max = arr[0];
        for(int i = 0; i < arr.length; i++){
//            min = Integer.min(min,arr[i]);
//            max = Integer.max(max,arr[i]);
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);

        }
        System.out.println("Min: " + min + "\nMax: " + max);
    }
}
