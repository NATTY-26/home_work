package hw_15;

import java.util.Scanner;
import java.util.Date;
public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date();
        System.out.println("Введите ваше имя: ");
        String name = input.nextLine();
        System.out.println("Введите номер задания: ");
        int taskNumber = input.nextInt();
        System.out.printf("Уважаемый %1$s, Вы выполняете задание номер %2$s, и делаете это в %3$tH часов %3$tM минут в %3$tA.",
                name, taskNumber, date);

   }
}