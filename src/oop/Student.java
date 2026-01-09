package oop;

public class Student {
    // fields:
    String name;
    String gender;
    int age;

    // constructor
    public Student(String name,String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // methods
    public static void printClassInfo(){
        System.out.println("This is a Student class");
        System.out.println("Fields: name,gender,age");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
