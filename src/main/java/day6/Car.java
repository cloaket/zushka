package day6;
// Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы.
// Вывести в консоль значение каждого  из полей, используя get методы.
// Созданный вами класс должен отвечать принципам инкапсуляции.

public class Car {

    private String color;
    private String model;
    private int year;

    public void info(){
        System.out.println("Это автомобиль");
    }

    public void setColor(String colorCar) {
        color = colorCar;
    }
    public String getColor() {
        return color;
    }

    public void setModel(String colorModel) {
        model = colorModel;
    }
    public String getModel() {
        return model;
    }

    public void setYear(int yearCar) {
        year = yearCar;
    }
    public int getYear() {
        return year;
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}