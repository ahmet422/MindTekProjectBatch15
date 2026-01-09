package arrays;

public class MaxSumTriple {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,7,1};
        // print the max sum of every triple
        int sum = 0;
        for(int i = 0; i < arr.length-2; i++){
            sum = Integer.max(sum, arr[i] + arr[i+1] + arr[i+2]);
        }
        System.out.println("Max sum: " + sum);
    }
}
