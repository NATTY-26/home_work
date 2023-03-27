package hw_18;

public class Task4 {
    public static void main(String[] args) {
        // Вызов методов с разными аргументами
        printMessage();
        printMessage("Приветствую тебя, о великий тестировщик!");
        printMessage(new String[]{"Java", "learning", "for", "the", "strong", "in", "spirit"});
        printMessage(new int[]{27, 01, 2022});
        printMessage(666, "The number of the beast");
    }

    public static void printMessage() {
        System.out.println("Я пустой");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessage(String[] messages) {
        StringBuilder sb = new StringBuilder();
        for (String message : messages) {
            sb.append(message).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static void printMessage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static void printMessage(int number, String message) {
        System.out.printf("Ваше сообщение - \"%s\", ваше число - %d\n", message, number);
    }
}