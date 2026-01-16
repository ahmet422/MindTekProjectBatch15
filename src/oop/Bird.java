package oop;
public class Bird extends Animal{

    public Bird(String name, int age) {
        super(name, age);
    }


    @Override
    public void moves() {
        System.out.println("Bird Flies");
    }


}
