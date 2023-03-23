package hw_17;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};

        Scanner input = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, три числа от 0 до 6 через пробел:");
        int index1 = input.nextInt();
        int index2 = input.nextInt();
        int index3 = input.nextInt();

        String name = names[index1];
        int time = times[index2];
        String place = places[index3];

        System.out.printf("%1$s будет идти в %2$s в %3$d:00", name, place, time);
    }
}
