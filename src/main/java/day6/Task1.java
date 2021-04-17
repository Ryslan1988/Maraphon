//В классах Автомобиль и Мотоцикл реализуйте два метода:
//void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и возвращает разницу
// между переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).
//
//В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.

package day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("blue");
        car.setModel("BMW");
        car.setYear(2017);

        Motorbike motorbike = new Motorbike("yamaxa","bleack", 2019);

        car.info();
        motorbike.info();

        System.out.println(car.yearDiffirance(2020));
        System.out.println(motorbike.yearDiffirance(2020));



    }
}
