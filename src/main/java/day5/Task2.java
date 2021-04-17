// Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
// Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Вывести в консоль значение каждого из полей, используя get методы.

package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Yamaha", "Super Soco TC", 1994);
        motorbike.getColor();
        motorbike.getModel();
        motorbike.getYear();

    }
}

class  Motorbike {
    private String color;
    private String model;
    private int year;

    public Motorbike(String yamaha, String super_soco_tc, int i) {
        System.out.println("Конструктор");
        this.color = "black";
        this.model = "Super Soco TC";
        this.year = 1994;

    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


}