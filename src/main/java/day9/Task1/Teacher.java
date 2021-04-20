package day9.Task1;

public class Teacher extends Human {
    private String subjectName;

    public Teacher(String nam, String subjectName) {
        super(nam);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getNam());
    }
}
