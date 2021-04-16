package day2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int integer = s.nextInt();
        if (integer < 1){
            System.out.println("Ошибка ввода");
        } else if (integer <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (integer <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (integer >= 9){
            System.out.println("Многоэтажный дом");
        }
    }
}