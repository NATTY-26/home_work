package hw_17;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите высоту ромба: ");
        int height = input.nextInt() - 3;

        int spaces = height - 1;

        // Верхняя часть ромба
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int j = 1; j < 2 * i - 2; j++) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print("#");
            }
            System.out.println();
            spaces--;
        }

        // Нижняя часть ромба
        spaces = 1;
        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int j = 1; j < 2 * i - 2; j++) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print("#");
            }
            System.out.println();
            spaces++;
        }
    }
}