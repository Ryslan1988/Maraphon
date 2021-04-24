package day11.task2.Hero;

import day11.task2.Interface.Healer;

public class Paladin extends Hero implements Healer {

    static final int MAX_HEALTH = 100;
    static final int HEAL_AMOUNT = 25;
    static final int HEAL_TEAM_AMOUNT = 20;

    public Paladin() {
        phyDef = 0.5;
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
        }}
        @Override
        public String toString() {
            return "Paladin{" +
                    "health=" + health +
                    '}';
        }


    }

