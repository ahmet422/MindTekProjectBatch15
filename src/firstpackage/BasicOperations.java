package firstpackage;

public class BasicOperations {
    public static void main(String[] args) {
        int num = 10;
        num += 5;   // num = num +5;
        System.out.println(num);
        num -= 7; // num = num - 7 ;
        System.out.println(num);

        // unary:
        System.out.println("--------------");
        int amount = 70;
        amount++; // amount += 1; // amount = amount + 1;
        amount--;
        System.out.println(amount);

        System.out.println("*****************");
        int a = 55;
        int b = a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("%%%%%%%%%%%%%%%%%");

        // modulus operator: a%b=remainder
        int dig1 = 13;
        int dig2 = 10;
        int rem = dig1 % dig2;
        System.out.println("rem: " + rem);
        System.out.println(6%2);
    }
}
