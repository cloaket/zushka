package day9.Task2;

public class Triangle extends Figure {

    private double lengthOne;
    private double lengthTwo;
    private double lengthTree;

    public Triangle(double lengthOne, double lengthTwo, double lengthTree, String color) {
        super(color);
        this.lengthOne = lengthOne;
        this.lengthTwo = lengthTwo;
        this.lengthTree = lengthTree;
    }

    @Override
    public double area() {

        double p = (lengthOne + lengthTwo + lengthTree) / 2;
        return Math.sqrt(p * (p - lengthOne) * (p - lengthTwo) * (p - lengthTree));
    }

    @Override
    public double perimeter() {
        return lengthOne + lengthTwo + lengthTree;
    }
}
