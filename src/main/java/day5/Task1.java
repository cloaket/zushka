// Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
// Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
// Задать значение для каждого поля, используя set методы.
// Вывести в консоль значение каждого  из полей, используя get методы.
// Созданный вами класс должен отвечать принципам инкапсуляции.

package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red");
        car.setModel("Porshe 911");
        car.setYear(1994);
        System.out.println("Цвет : " + car.getColor());
        System.out.println("Модель : " + car.getModel());
        System.out.println("Год выпуска : " + car.getYear());
    }
}

