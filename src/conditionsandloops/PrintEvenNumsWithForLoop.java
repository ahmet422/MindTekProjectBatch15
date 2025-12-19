package conditionsandloops;

public class PrintEvenNumsWithForLoop {
    public static void main(String[] args) {
        // print all even nums from 1 to 100
//        int x = 55;
//        for(int i = x; i <= 100; i = i + 1) {
//            if (i % 2 == 0) System.out.println(i);
//        }

        // print the sum of all even nums from 1 to 100
        int totalSum = 0;
        for(int i = 1; i <= 10; i = i + 1) {
            if (i % 2 == 0) totalSum = totalSum + i;
        }

        System.out.println("The sum: " + totalSum);
    }
}
