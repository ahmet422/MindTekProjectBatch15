package conditionsandloops;

public class LoopInsideOfLoop {
    public static void main(String[] args) {
        // print 10 times nums from 1 to 100
        // x

        for(int a = 0; a < 5; a++){
            for(int i = 1; i <= 100; i++){
                System.out.println(i);
            }
            System.out.println("---------");
        }


    }
}
