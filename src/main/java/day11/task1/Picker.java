package day11.task1;

public class Picker  implements Wolker{

    private int salary;
    private static final int TADK_MONE=80;
    private Sklad w;
    private boolean isPay;

    public Picker(Sklad w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary+=TADK_MONE;
        w.incrementPicked();

    }

    @Override
    public void bonus() {
        if (w.getCountPickedtheDoor()<10000){
            System.out.println("Бонус пока не доступен ");
            return;
        }

        if (isPay){
            System.out.println("Бонус уже выплачен ");
            return;
        }

        salary+=70000;
        isPay=true;

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", w=" + w +
                ", isPay=" + isPay +
                '}';
    }
}
