package conditionsandloops;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me starting num:");
        int num = input.nextInt();
        System.out.println("Give me where to finish:");
        int lastNum = input.nextInt();
        // 1 .... 5 => 1+2+3+4+5 -> 15 print total sum
        int sum = 0;
        while(num <= lastNum){
            sum = sum + num;
            System.out.println("Current sum: " + sum);
            num++;
            System.out.println("Current num: " + num);
        }
        System.out.println("------------------");
        System.out.println(sum);
    }
}
