package hw_16;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = input.nextLine().toLowerCase();

        int count = 0;
        int i = 0;
        while (i < string.length()) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'а') {
                count++;
            }
            i++;
        }

        System.out.println("Количество символов 'a' в строке: " + count);
    }
}