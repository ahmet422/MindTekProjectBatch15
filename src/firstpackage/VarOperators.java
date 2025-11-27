package firstpackage;

public class VarOperators {
    public static void main(String[] args) {
        // never do this: putting bigger type into smaller type
        int number = 1000;
        byte num = (byte) number; // casting
        System.out.println(num);

        byte digit = 7;
        int number2= digit;
        System.out.println(number2);

        int num1 = 45;
        num1 = num1 + num1;


        System.out.println(num1);


        int num2 = num1;
        long num3 = 5632423234l;




    }
}
