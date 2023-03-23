package hw_17;

import java.util.Random;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[45];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101) - 50;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Минимальный элемент: " + arr[0]);
        System.out.println("Максимальный элемент: " + arr[arr.length - 1]);

    }
}