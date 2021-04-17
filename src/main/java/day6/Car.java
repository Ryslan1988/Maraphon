
////В классах Автомобиль и Мотоцикл реализуйте два метода:
////void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
////int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год) и возвращает разницу
//// между переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).
////
////В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.

package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void info(){
        System.out.println("Это автомобиль ");
    }

    public int yearDiffirance (int inputYear){
        return Math.abs(inputYear-year);
    }
}

