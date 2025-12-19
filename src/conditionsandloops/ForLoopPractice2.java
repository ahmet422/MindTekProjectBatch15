package conditionsandloops;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        String text = "programming";
        // print each letter in a new line
//        for(int i = 0; i < text.length(); i++){
//            System.out.println(text.charAt(i));
//        }

        // print total number of vowels in text
//        int count = 0;
//        for(int i = 0; i < text.length(); i++){
//            char letter = text.charAt(i);
//            boolean isVowel = letter == 'a' || letter == 'o' ||
//                    letter == 'u'|| letter == 'e' || letter == 'i';
//            if(isVowel) count++;
//        }
//        System.out.println("Sum of vowels: " + count);

        // create and print a new string from given tex but add # after each letter
        // p#r#o#g#r#a#m#m#i#n#g#
//        String word = "";
//        for(int i = 0; i < text.length(); i++){
//            word = word + text.charAt(i) + "#";
//        }
//        System.out.println(word);

        // print reverse of given word
        String rev = "";
        for(int i = text.length()-1; i >= 0; i--){
            rev = rev + text.charAt(i);
        }

        System.out.println(rev);

    }
}
