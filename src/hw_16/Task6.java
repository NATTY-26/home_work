package hw_16;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите максимальный вес, который может хранить склад: ");
        int maxWeight = input.nextInt();

        while (maxWeight > 0) {
            System.out.print("Введите вес, который вы хотите сдать на склад: ");
            int weight = input.nextInt();

            if (weight < 5) {
                System.out.println("Невозможно принять металл весом менее 5 кг");
            } else if (weight > maxWeight) {
                System.out.println("Невозможно принять металл. Превышен остаток на складе.");
            } else if (maxWeight - weight == 0) {
                System.out.println("Склад заполнен. Программа завершена.");
                break;
            } else if (maxWeight - weight < 5) {
                System.out.println("Невозможно принять металл. Недопустимый остаток на складе.");
            } else {
                maxWeight -= weight;
                System.out.println("Принят металл весом: " + weight);
                System.out.println("Осталось места на складе: " + (maxWeight));
            }
        }
    }
}