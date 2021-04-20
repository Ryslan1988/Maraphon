package day9.Task2;

public class Circle extends Fihyra {
    private double r;


    public Circle(double r, String color) {
        super(color);
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * Math.PI;
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * r;
    }
}
