package operators;

import java.util.Scanner;

public class ClubValidityScanner {
    public static void main(String[] args) {
        System.out.println("Male Basketball Team Application " +
                "\nYour Gender: " +
                "\n1 Male " +
                "\n2 Female " +
                "\nPlease type your corresponding gender: ");
//        System.out.println("\"Hello\"");
//        System.out.println(" \\ ");

        // save gender, ask for age.
        // If gender is Male and age is between 12-16 inclusive print "You are eligible to apply"
        // otherwise print Sorry you are not eligible to apply
        Scanner input = new Scanner(System.in);
        int gender = input.nextInt();
        System.out.println("Type your age:");
        int age = input.nextInt();

        boolean isMale = gender == 1;
        boolean isValidAge = age >= 12 && age <=16;
        if(isMale && isValidAge){
            System.out.println("You are eligible apply!");
        }
        else{
            System.out.println("Sorry you are not eligible to apply");
            System.out.println("The reason: ");
            if(!isMale) System.out.println("Your gender is not male");  // !isMale is the same as isMale == false
            if(!isValidAge) System.out.println("Your age is not in between 12 and 16");
        }
    }
}
