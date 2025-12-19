package conditionsandloops;

public class ForLoopPractice1 {
    public static void main(String[] args) {
        // print all nums from 100 to 50
//        for(int i = 100; i >= 50; i--){
//            System.out.println(i);
//        }


        // print the total sum of all nums from 100 to 50
//        int sum = 0;
//        for(int i = 100; i >= 50; i--){
//            sum = sum + i ;
//        }
//        System.out.println("total sum: " + sum);

        // print the total sum of all nums from 100 to 50 that divisible by 5 and 3
        int sum = 0;
        for(int i = 100; i >= 50; i--)
            if(i%15==0) sum = sum + i ;

        System.out.println("total sum: " + sum);
    }
}