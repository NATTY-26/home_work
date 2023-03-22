package hw_17;

import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + number + " найдено в массиве");
        } else {
            System.out.println("Число " + number + " не найдено в массиве");
        }
    }
}