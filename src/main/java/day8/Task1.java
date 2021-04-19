package day8;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        String get = "";

        long timeBefour = System.currentTimeMillis();

        for (int i = 0; i < 20000; i++)
            get = get + i + " ";
        long timeAfter = System.currentTimeMillis();

        System.out.println("Время с классом String: " + (timeAfter - timeBefour));
        // System.out.println(get); скрыл что бы были наглядно видны показатели

        StringBuilder a = new StringBuilder("");
        timeBefour = System.currentTimeMillis();

        for (int i = 0; i < 20000; i++)
            a.append(i).append(" ");
        timeAfter = System.currentTimeMillis();
        System.out.println("Время с классом StringBuilder: " + (timeAfter - timeBefour));
        //System.out.println(a); скрыл что бы наглядно были видны показатели
    }
}
