package conditionsandloops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        // keep asking a user to enter a number until number is 0
        // print the min and max number from all given numbers
        // 12, 11, 45, -9, 89, 0 -> Min: -9   Max: 89
        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(max);
        while(true){
            System.out.println("Give me any number, 0 to exit");
            int givenNum = input.nextInt();
            if(givenNum == 0) break;
            if(min > givenNum) min = givenNum;
            if(max < givenNum) max = givenNum;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
