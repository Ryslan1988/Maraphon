
// 1. Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы.
// Вывести в консоль значение каждого из полей, используя get методы.
//Созданный вами класс должен отвечать принципам инкапсуляции.

package day5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Введите год выпуска , цвет и модель автомобиля : ");
        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car();
        int o = scanner.nextInt();

        String b = scanner.nextLine();
        String c = scanner.nextLine();

        car1.setYear(o);
        car1.setCollor(b);
        car1.setModels(c);
        System.out.println(car1.getYear() + " " + car1.getModels() + " " + car1.getCollor());

    }
}

class Car {

    private int year;
    private String collor;
    private String models;

    public void setYear(int year1) {
        this.year = year1;
    }

    public int getYear() {
        return year;
    }

    public void setCollor(String collor1) {
        this.collor = collor1;
    }

    public String getCollor() {
        return collor;
    }

    public void setModels(String models1) {
        models = models1;
    }

    public String getModels() {
        return models;
    }
}

