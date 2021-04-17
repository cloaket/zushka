package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String theme;

    public Teacher(String name, String theme) {
        this.name = name;
        this.theme = theme;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomInt = random.nextInt(4) + 2;

        String value = "";
        switch (randomInt) {
            case 2:
                value = "Неудовлетварительно";
                break;
            case 3:
                value = "Удовлетворительно";
                break;
            case 4:
                value = "Хорошо";
                break;
            case 5:
                value = "Отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету " + this.theme + " на оценку " + value);
    }
}