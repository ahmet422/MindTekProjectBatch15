package conditionsandloops;

import java.util.Scanner;

public class PrintNums {
    public static void main(String[] args) {
        // print num in range of n to n+10
        Scanner input = new Scanner(System.in);
        System.out.println("Give me starting num:");
        int num = input.nextInt();
        System.out.println("Give me where to finish:");
        int lastNum = input.nextInt();

        // while loop: while(statement){ code to be executed }
        // while num is <= lastNum keep running this code: {}
        while(num <= lastNum){
            System.out.println(num);
            num = num + 1; // num++;
        }

    }
}
