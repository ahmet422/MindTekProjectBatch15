package oop;
public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super.setName("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printName() {
        System.out.println(this.getName());
    }

    @Override
    public void printAngles() {
        System.out.println("0 angles in circle");
    }
}
