package arrays;

public class FindMinAndMax {
    public static void main(String[] args) {
        int[] arr = {1000,12,34,45,7,-666, 45000};
        // print the min element and the max element
        int min = arr[0], max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        }
        System.out.println("Min: " + min + "\nMax: " + max);
    }
}
