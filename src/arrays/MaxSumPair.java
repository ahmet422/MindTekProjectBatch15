package arrays;

public class MaxSumPair {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
        // print the max sum of every pair
        int sum = 0;
        for(int i= 0; i < arr.length-1; i++){
            int leftE = arr[i], rightE = arr[i+1];
            sum = Integer.max(sum, leftE+rightE);
        }
        System.out.println("Max sum of pairs: " + sum);
    }
}
