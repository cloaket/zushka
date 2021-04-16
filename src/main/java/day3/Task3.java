package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wow = 0;
        while (wow < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            wow++;
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
        }
    }
}
