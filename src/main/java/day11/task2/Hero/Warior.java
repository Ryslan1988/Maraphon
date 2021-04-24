package day11.task2.Hero;

public class Warior extends Hero{

    public Warior() {
        phyDef=0.8;
        physAttack=30;
    }

    @Override
    public String toString() {
        return "Warior{" +
                "health=" + health +
                '}';
    }
}
