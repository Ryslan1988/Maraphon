package day11.task1;

public class Curier implements Wolker {
    private int salary;
    private static final int TADK_MONE = 100;
    private Sklad w;
    private boolean isPay;

    public Curier(Sklad w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += TADK_MONE;
        w.getCountDeliver();

    }


    @Override
    public void bonus() {
        if (w.getCountDeliver() < 10000) {
            System.out.println("Бонус пока не доступен ");
            return;
        }

        if (isPay) {
            System.out.println("Бонус уже выплачен ");
            return;
        }

        salary += 50000;
        isPay = true;

    }

    @Override
    public String toString() {
        return "Curier{" +
                "salary=" + salary +
                ", isPay=" + isPay +
                '}';
    }
}
