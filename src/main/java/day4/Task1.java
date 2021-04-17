package day4;

import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner loup = new Scanner(System.in);
        int x = loup.nextInt();
        int more = 0;
        int equal = 0;
        int even = 0;
        int noEven = 0;
        int sum = 0;
        int[] numbers = new int[x];
        System.out.println("Числа массива");
        for (int q:numbers) {
            numbers[q] = random.nextInt(10);
            System.out.print(numbers[q] + " ");
            sum = sum + numbers[q];
            if (numbers[q] > 8) {
                more++;
            }
            if (numbers[q] == 1) {
                equal++;
            }
            if (numbers[q] % 2 == 0) {
                even++;
            }
            else if (numbers[q] % 2 != 0) {
                noEven++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Информация о массиве");
        System.out.println("Длина массива : " + x);
        System.out.println("Количестве чисел > 8 : " + more);
        System.out.println("Количестве чисел равных 1 : " + equal);
        System.out.println("Количестве четных чисел : " + even);
        System.out.println("Количестве нечетных чисел : " + noEven );
        System.out.println("Сумме всех элементов массива : " + sum);
    }
}
