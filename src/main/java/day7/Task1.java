package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane a1 = new Airplane("boing", 2001, 200, 55000);
        Airplane a2 = new Airplane("airbus", 2010, 220, 75000);

        Airplane.compareAirplanes(a1, a2);

    }
}