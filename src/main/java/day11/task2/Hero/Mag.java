package day11.task2.Hero;

import day11.task2.Interface.MagicAtack;

public class Mag extends Hero implements MagicAtack {

    int magickAttack = 20;

    public Mag() {
        phyDef = 0;
        magDef = 0.8;
        physAttack = 5;
    }




    @Override
    public void magicAttack(Hero h) {
        double attackScore = magickAttack * (1 - h.magDef);
        if (h.health - attackScore < MIN_HEALYH) {
            h.health = MIN_HEALYH;
        } else {
            h.health -= attackScore;
        }
    }
        @Override
        public String toString() {
            return "Mag{" +
                    "health=" + health +
                    '}';
        }
    }

