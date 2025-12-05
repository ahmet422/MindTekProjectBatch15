package StringMethods;

public class IndexOfMethod {
    public static void main(String[] args) {
        //             012345678
        String text = "sunsnhine";
        int index = text.indexOf('n');
        // if returned value is negative that means no such element in that string
        System.out.println(index);
        System.out.println(text.lastIndexOf('n'));

    }
}
