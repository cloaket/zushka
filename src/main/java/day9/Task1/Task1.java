package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Richard", "Math");
        Student student = new Student("Bob", "MathGroup");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
