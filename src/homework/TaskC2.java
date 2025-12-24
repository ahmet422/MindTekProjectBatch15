package homework;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        String num = input.next();
        int sum = 0;

        for(int i = 0; i < num.length(); i++){
            sum = sum + Integer.parseInt(num.charAt(i) + "");
        }

        System.out.println("sum: " + sum);

    }
}
