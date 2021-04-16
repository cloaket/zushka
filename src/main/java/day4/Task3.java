package day4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Random random = new Random();
        int[][] array = new int [x][y];

        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(50);
            }
        }

        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }

            if (sum >= maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(index);
    }
}
