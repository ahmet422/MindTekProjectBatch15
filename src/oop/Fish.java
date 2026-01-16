package oop;

public class Fish extends Animal {
    private String color;

    public Fish(String name, int age, String color) {
        super(name, age); // Animal(name, age);
        System.out.println("const of Fish");
        this.color = color;
    }

    @Override
    public void moves() {
        System.out.println("fish swims");
    }

    @Override
    public void says() {
        System.out.println("fish is silent");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
