package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Nero", "Math");
        Student student = new Student("Leonard");
        teacher.evaluate(student);
    }
}
