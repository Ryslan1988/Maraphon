package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Конев Алексей Юрьевич", "Термодинамика");
        Student student = new Student("Анохин Ярослав Семенович");

        teacher.evaluate(student);

    }
}
