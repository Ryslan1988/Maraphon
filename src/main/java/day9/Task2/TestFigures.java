package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Fihyra[] fihyras = {
                new Triangle(10, 10, 10, "Blue"),
                new Triangle(10, 20, 30, "Bleack"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 15, "Red"),
                new Rectangle(40, 10, "Green"),
                new Circle(4, "Red"),
                new Circle(15, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedar(fihyras));
        System.out.println(calculateRedPer(fihyras));

    }

    public static double calculateRedPer(Fihyra[] fihyras) {
        double sum = 0;

        for (Fihyra fihyra : fihyras) {
            if (fihyra.getColor().equals("Red"))
                sum += fihyra.perimetr();
        }
        return sum;
    }

    public static double calculateRedar(Fihyra[] fihyras) {
        double sum = 0;

        for (Fihyra fihyra : fihyras) {
            if (fihyra.getColor().equals("Red"))
                sum += fihyra.area();
        }
        return sum;

    }
}
