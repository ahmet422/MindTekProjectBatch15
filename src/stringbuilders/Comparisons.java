package stringbuilders;

public class Comparisons {
    public static void main(String[] args) {
        String word1 = new String("java");
        String word2 = new String("java");
        System.out.println(word1.equals(word2));
        System.out.println(word1 == word2);

        StringBuilder s1 = new StringBuilder("pro");
        StringBuilder s2 = new StringBuilder("pro");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        // never compare stringBuilder objects
        // if you still want to compare, then compare only after converting to the string
        System.out.println(s1.toString().equals(s2.toString()));
    }
}
