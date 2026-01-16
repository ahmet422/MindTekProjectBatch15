package oop;

public abstract class Shape implements NamePrinter, AnglePrinter {
    private String name;

    public abstract double calcArea();
    public abstract double calcPerimeter();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
