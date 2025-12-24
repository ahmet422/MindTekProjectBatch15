package homework;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        int num = input.nextInt();
        int sum = 0;

        while(num>0){
            int dig = num%10;
            sum = sum +dig;
            num = num/10;
        }

        System.out.println("sum: " + sum);

    }
}
