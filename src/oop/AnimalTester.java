package oop;

public class AnimalTester {
    public static void main(String[] args) {
        Fish f1 = new Fish("Nemo", 4,"orange");
        System.out.println(f1.getName());
        f1.moves();
        f1.says();

        Bird b1 = new Bird("Birdy", 3);
        b1.moves();
        b1.says();


    }
}
