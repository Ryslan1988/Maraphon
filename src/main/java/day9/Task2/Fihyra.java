package day9.Task2;

public abstract class Fihyra {
    private String color;

    public Fihyra(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimetr();
}
