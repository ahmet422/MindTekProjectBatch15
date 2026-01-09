package stringbuilders;

public class StringBuilderMethods {
    public static void main(String[] args) {
        String word = "keyboard";
        StringBuilder stb = new StringBuilder(word);
        System.out.println(stb);
        stb.insert(3, "A");
        System.out.println(stb);
        stb.deleteCharAt(0);
        System.out.println(stb);
        stb.delete(0,3);
        System.out.println(stb);
    }
}
