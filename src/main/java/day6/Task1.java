package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setColor("red");
        car.setModel("Porshe 911");
        car.setYear(1994);
        System.out.println(car.yearDifference(2021));
        Motorbike motorbike = new Motorbike("black", "yamaha", 1994);
        motorbike.info();
        System.out.println(motorbike.yearDifference(2021));
    }
}
