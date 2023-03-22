package hw_16;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();

        String word = "";
        while (!word.equals("STOP")) {
            System.out.println("Введите слово: ");
            word = input.next();

            if (!word.equals("STOP")) {
                sentence.append(word).append(" ");
            }
        }

        System.out.println("Результат: " + sentence.toString().trim());
    }
}