package StringMethods;

public class SubstringMethods {
    public static void main(String[] args) {
        //                 0123456789
        String fullname = "Selbi Mamedova";
        int emptySpaceIndex = fullname.indexOf(' ');
        String lastName = fullname.substring(emptySpaceIndex+1);
        System.out.println(lastName);
        String fname = fullname.substring(0,emptySpaceIndex);
        System.out.println(fname);
        String text = fullname.substring(45);
        System.out.println(text);


    }
}
