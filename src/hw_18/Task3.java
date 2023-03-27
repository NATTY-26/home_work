package hw_18;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        System.out.print("Число в обратном порядке с двузначными цифрами:");
        printNumberBackwards(number);
    }

    public static void printNumberBackwards(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        System.out.print(lastDigit + "" + lastDigit + " ");
        printNumberBackwards(number / 10);
    }
}