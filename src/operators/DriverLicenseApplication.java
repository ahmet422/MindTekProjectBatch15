package operators;

import java.util.Scanner;

public class DriverLicenseApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to DMV!");
        System.out.println("Type your age: ");

        // if given age is greater or equal to 16 then print You can apply
        // if given age is not greater or equal to 16 then print Sorry, You can not apply. The min age is 16.
        Scanner input = new Scanner(System.in);
        int givenAge = input.nextInt();

        // if(){} else{}
        if( input.nextInt() >= 16) System.out.println("You can apply!");
        else System.out.println("Sorry, You can not apply. The min age is 16.");



        System.out.println("Thanks! Good bye!");



    }
}
