package conditionsandloops;

import java.util.Scanner;

public class MinAndMax2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(true){
            System.out.println("Give me any number, or type stop to exit");
            String text = input.next();
            if(text.equals("stop")) break;
            int givenNum = Integer.parseInt(text);
            min = Integer.min(min,givenNum);
            max = Integer.max(max, givenNum);
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
