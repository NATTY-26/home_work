package hw_15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первую сторону треугольника: ");
        int a = input.nextInt();

        System.out.println("Введите вторую сторону треугольника: ");
        int b = input.nextInt();

        System.out.println("Введите третью сторону треугольника: ");
        int c = input.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Треугольник можно построить из этих сторон.");
        } else {
            System.out.println("Треугольник нельзя построить из этих сторон.");
        }
    }
}

