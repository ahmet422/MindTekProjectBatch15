package conditionsandloops;

import java.util.Scanner;

public class PrintEvenNums {
    public static void main(String[] args) {
        // ask a user to enter starting num and then finishing number.
        // print all even number in between starting and finishing numbers
        // 4 9 -> 4 6 8
        Scanner input = new Scanner(System.in);
        System.out.println("Give me starting num:");
        int num = input.nextInt();
        System.out.println("Give me where to finish:");
        int lastNum = input.nextInt();

        while(num <= lastNum){
            if(num%2 == 0) System.out.println(num);
            num = num + 1; // num++;
        }
    }
}
