package day4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[x];

        for (int y = 0; y < array.length; y++)
            array[y] = random.nextInt(10000);

        System.out.print(Arrays.toString(array));
        System.out.println();

        int number = 0;
        for (int y:array) {
            if (y > number)
                number = y;
        }

        System.out.println(number);

        int number2 = 10000;
        for (int y:array) {
            if (y < number2)
                number2 = y;
        }

        System.out.println(number2);

        int number3 = 0;
        for (int y:array) {
            if (y % 10 == 0) {
                number3++;
            }
        }

        System.out.println(number3);

        int number4 = 0;
        for (int y:array) {
            if (y % 10 == 0) {
                number4 = number4 + y;
            }
        }

        System.out.println(number4);

    }
}
