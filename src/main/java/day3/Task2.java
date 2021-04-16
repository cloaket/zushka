package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double div = x / y;
            if (y == 0)
                break;
            System.out.println(div);

        }
    }
}

