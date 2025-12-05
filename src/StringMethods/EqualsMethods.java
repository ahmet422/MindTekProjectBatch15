package StringMethods;

public class EqualsMethods {
    public static void main(String[] args) {
        String text1 = "aAa";
        String text2 = "aaa";

        // check if values of 2 string vars are the same
        System.out.println(text1.equals(text2));
        System.out.println(text1.equalsIgnoreCase(text2));

        // to compare int or char use ==     : num1 == num2
        // to compare String vars use .equals(text) method
        String text3 = "    hello all dear students   ";
        System.out.println(text3);
        System.out.println(text3.trim());
        text3 = text3.trim();
        System.out.println(text3);

        // replace()
        String text4 = "amazing!!!!";
        System.out.println(text4);
        System.out.println(text4.replace('!', '#'));
        System.out.println(text4.replace("a","A"));
        System.out.println(text4.startsWith("amaz"));
        System.out.println(text4.endsWith("!"));

    }
}
