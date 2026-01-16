package oop;

public class Animal extends Object{
    // fields
    protected String name;
    private int age;

    // constructor

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void moves(){
        System.out.println("animal moves");
    }

    public void says(){
        System.out.println("animal says");
    }
}
