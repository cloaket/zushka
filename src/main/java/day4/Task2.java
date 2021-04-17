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

        int max = 0;
        for (int y:array) {
            if (y > max)
                max = y;
        }

        System.out.println(max);

        int min = 10000;
        for (int y:array) {
            if (y < min)
                min = y;
        }

        System.out.println(min);

        int number3 = 0;
        int number4 = 0;
        for (int y:array) {
            if (y % 10 == 0) {
                number3++;
                number4 = number4 + y;
            }
        }

        System.out.println(number3);

        System.out.println(number4);

    }
}
