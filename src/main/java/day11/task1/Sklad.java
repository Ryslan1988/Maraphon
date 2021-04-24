package day11.task1;

public class Sklad {

    private int countPickedtheDoor;
    private int countDeliver;

    public int getCountPickedtheDoor() {
        return countPickedtheDoor;
    }

    public int getCountDeliver() {
        return countDeliver;
    }

    public void incrementPicked() {
        countPickedtheDoor++;
    }


    public void incrementDeliv() {
        countDeliver++;
    }

    @Override
    public String toString() {
        return "Sklad{" +
                "countPickedtheDoor=" + countPickedtheDoor +
                ", countDeliver=" + countDeliver +
                '}';
    }
}
