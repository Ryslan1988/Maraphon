package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Nick", "102");
        Teacher teacher = new Teacher("Ekaterina", "History");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

        System.out.println(student.getNam());
        System.out.println(teacher.getNam());

    }
}
