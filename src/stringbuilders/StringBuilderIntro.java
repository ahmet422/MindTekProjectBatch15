package stringbuilders;

public class StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("java");
        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.indexOf("j"));
        System.out.println(text.charAt(1));
//        System.out.println(text.reverse());
        System.out.println(text.append(" is fun"));
        System.out.println(text);

        String word = "mindtek";
        word = "bootcamp";
        word = "programming";
    }
}
