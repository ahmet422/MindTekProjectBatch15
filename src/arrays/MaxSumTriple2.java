package arrays;

public class MaxSumTriple2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,7,1};
        int sum = arr[0] + arr[1] + arr[2];
        for(int i = 3; i < arr.length; i++){
            sum = Integer.max(sum, sum + arr[i] - arr[i-3]);
        }
        System.out.println("Max Sum: " + sum);
    }
}
