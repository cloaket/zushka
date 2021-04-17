// Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
// Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
// Вывести в консоль значение каждого из полей, используя get методы.

package day5;

class Motorbike {
    private String color;
    private String model;
    private int year;

    public Motorbike(String color, String moto, int yearMoto) {
        System.out.println("Конструктор 1-го байка");
        this.color = color;
        this.model = moto;
        this.year = yearMoto;
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
