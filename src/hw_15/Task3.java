package hw_15;

import java.util.Calendar;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите год своего рождения: ");
        int BirthdayYear = Integer.parseInt(input.nextLine());
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - BirthdayYear;
        System.out.println("Ваш возраст: " + age + " года (лет)");
    }
}