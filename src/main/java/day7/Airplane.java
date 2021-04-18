//Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
//В классе Самолет реализовать статический метод compareAirplanes,
// который в качестве аргументов принимает два объекта класса Airplane (два самолета)
// и выводит сообщение в консоль о том, какой из самолетов длиннее.

package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public static void compareAirplanes(Airplane a1, Airplane a2) {

        if (a1.length > a2.length) {
            System.out.println("Первый самолет длиннее");
        } else if (a2.length > a1.length) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }
}
