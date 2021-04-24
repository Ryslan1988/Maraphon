package day11.task2;

import day11.task2.Hero.Mag;
import day11.task2.Hero.Paladin;
import day11.task2.Hero.Shaman;
import day11.task2.Hero.Warior;

public class Task2 {
    public static void main(String[] args) {

        Warior warior = new Warior();
        Paladin paladin = new Paladin();
        Mag mag = new Mag();
        Shaman shaman = new Shaman();

        warior.physAttack(paladin);
        System.out.println(paladin);

        paladin.physAttack(mag);
        System.out.println(mag);

        shaman.healTeammate(mag);
        System.out.println(mag);

        mag.magicAttack(paladin);
        System.out.println(paladin);

        shaman.physAttack(warior);
        System.out.println(warior);

        paladin.healHimself();
        System.out.println(paladin);

        System.out.println();

        for (int i = 0; i < 5; i++) {
            warior.physAttack(mag);
            System.out.println(mag);

        }


    }
}
