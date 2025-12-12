package conditionsandloops;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type age: ");
        int age = input.nextInt();

//        // chain:
        if(age < 12){
            System.out.println("child");
        }else if(age < 20){
            System.out.println("teenager");
        }else if(age < 66){
            System.out.println("adult");
        }else{
            System.out.println("senior");
        }


//        if(age < 12){
//            System.out.println("child");
//        }
//
//        if(age < 20){
//            System.out.println("teenager");
//        }
//
//        if(age < 66){
//            System.out.println("adult");
//        }
//
//        if(age > 65){
//            System.out.println("senior");
//        }

    }
}
