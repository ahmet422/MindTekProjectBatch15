package operators;

import java.util.Scanner;

public class DriverLicenseApplication2 {
    public static void main(String[] args) {
        System.out.println("Welcome to DMV!");
        System.out.println("Type your age: ");

        // if given age is greater or equal to 16 then print You can apply
        // if given age is not greater or equal to 16 then print Sorry, You can not apply. The min age is 16.
        Scanner input = new Scanner(System.in);
        int givenAge = input.nextInt();
        boolean ageIsNotValid = givenAge < 0 || givenAge > 120;
        // if(){} else{}
        if(ageIsNotValid) {
            System.out.println("Age can not be negative or can not be more than 120");
        }else{
            if( givenAge >= 16) System.out.println("You can apply!");
            else System.out.println("Sorry, You can not apply. The min age is 16.");
            System.out.println("Thanks! Good bye!");
        }

    }
}
