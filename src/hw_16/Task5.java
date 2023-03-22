package hw_16;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        String stringNumber = input.nextLine();

        String reversedStringNumber = new StringBuilder(stringNumber).reverse().toString();

        if (stringNumber.equals(reversedStringNumber)) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }
    }
}