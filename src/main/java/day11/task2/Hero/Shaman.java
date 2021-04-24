package day11.task2.Hero;

import day11.task2.Interface.Healer;
import day11.task2.Interface.MagicAtack;

public class Shaman extends Hero implements MagicAtack, Healer {

    static final int MAX_HEALTH = 100;
    static final int HEAL_AMOUNT = 50;
    static final int HEAL_TEAM_AMOUNT = 30;

    int magickAttack = 15;

    public Shaman() {
        phyDef = 0.2;
        magDef = 0.2;
        physAttack = 15;
    }


    @Override
    public void healHimself() {
        if (health + HEAL_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_AMOUNT;
        }

    }

    @Override
    public void healTeammate(Hero h) {
        if (h.health + HEAL_TEAM_AMOUNT > MAX_HEALTH) {
            h.health = MAX_HEALTH;
        } else {
            h.health += HEAL_TEAM_AMOUNT;
        }

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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
