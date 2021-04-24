package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Sklad sklad=new Sklad();
        Picker picker=new Picker(sklad);
        Curier curier=new Curier(sklad);

        buisnesprocess(picker);

        System.out.println(picker);
        System.out.println(sklad);

        buisnesprocess(curier);

        System.out.println(curier);
        System.out.println(sklad);


    }
    public static void buisnesprocess(Wolker wolker){
        for(int i=1; i<=10000;i++){
            wolker.doWork();
        }
        wolker.bonus();
    }
}
