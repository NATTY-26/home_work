package hw_17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        do {
            System.out.println("Введите чётное число - размер массива: ");
            size = input.nextInt();
        } while (size % 2 != 0);
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(101);
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        int mid = size / 2;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, size);
        for (int i = mid, j = size - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}