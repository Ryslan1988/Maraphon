package day11.task2.Hero;

import day11.task2.Interface.PhizAtack;

public class Hero implements PhizAtack {

    final int MIN_HEALYH = 0;

    int health;
    int physAttack;
    double phyDef;
    double magDef;

    public Hero(int health) {
        this.health = 100;
    }

    public Hero() {
    }

    @Override
    public void physAttack(Hero h) {
        double attackScore = physAttack * (1 - h.phyDef);
        if (h.health - attackScore < MIN_HEALYH) {
            h.health = MIN_HEALYH;
        } else {
            h.health -= attackScore;
        }
    }
}
