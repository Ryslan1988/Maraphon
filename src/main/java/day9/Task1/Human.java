package day9.Task1;

public class Human {
    private String nam;

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public Human(String nam) {
        this.nam = nam;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + nam);
    }
}
