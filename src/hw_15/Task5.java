package hw_15;

import java.util.Scanner;
import java.util.Date;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите спецификатор формата (для даты - '%1$td.%1$tm.%1$ty', для времени - '%1$tH:%1$tM:%1$tS'): ");
        Date date = new Date();
        String formatSpecificator = input.nextLine();
        String formattedDate = String.format(formatSpecificator, date);
        System.out.println(formattedDate);
    }
}