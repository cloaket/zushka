package day7;

// 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
// В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов
// принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том,
// какой из самолетов длиннее.



public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing",1994, 100, 40);
        Airplane airplane2 = new Airplane("CY-250",1994, 140, 40);
        Airplane.compareAirplanes(airplane, airplane2);
    }
}