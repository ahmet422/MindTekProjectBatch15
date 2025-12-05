package operators;

import java.util.Scanner;

public class IsFive {
    public static void main(String[] args) {
        // ask a user to enter 5
        // if entered number is 5 then print you entered 5
        // else print this is not 5
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 :");
        int num = input.nextInt();
//        if(num==5) System.out.println("You entered 5");
//        else System.out.println("This is not 5");
//        if(num != 5) System.out.println("This is not 5");
//        else System.out.println("You entered 5");
        boolean itIsFive = num == 5;
//        if(itIsFive) System.out.println("You entered 5");
//        else System.out.println("This is not 5");
        if(!itIsFive) System.out.println("This is not 5");
        else System.out.println("You entered 5");
    }
}
