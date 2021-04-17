//2. Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”,
// “Модель”. Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
// Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Вывести в консоль значение каждого из полей, используя get методы.

package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike year1 = new Motorbike(2017, "Bleack", "Honda CBR 1000 RR");

        System.out.println();
    }
}

class Motorbike {

    private int year;
    private String collors;
    private String models;

    Motorbike(int year, String collors, String models) {
        this.year = year;
        this.collors = collors;
        this.models = models;
        System.out.println(getYear() + "," + getCollors() + "," + getModels());
    }

    public int getYear() {
        return year;
    }
    public String getCollors() {
        return collors;
    }
    public String getModels() {
        return models;
    }

}





