package day7;

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;

    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane airplane, Airplane airplane2) {
        if (airplane.getLength() < airplane2.getLength()) {
            System.out.println("Длина " + airplane.getProducer() + " больше чем длина " + airplane2.getProducer());
        }
        else if (airplane.getLength() > airplane2.getLength()) {
            System.out.println("Длинна " + airplane2.getProducer() + " больше чем длина " + airplane.getProducer());
        }
        else {
            System.out.println(" Длина обоих равна");
        }
    }

    public void fillUp(int n){
        fuel += n;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
