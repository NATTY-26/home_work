package hw_17;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите высоту ромба: ");
        int height = input.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int j = 2; j <= 2 * i - 1; j++) {
                System.out.print(" ");
                if (j == 2 * i - 1) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }

        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int j = 2; j <= 2 * i - 1; j++) {
                System.out.print(" ");
                if (j == 2 * i - 1) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}