package hw_15;

public class Task4_1 {
    public static void main(String[] args) {
        String message = "Чтобы написать код нам нужны 1)Язык программирования 2)Среда разработки 3)Воодушевление";
        String formattedMessage = message.replace(" 1)", "%n1)").replace(" 2)", "%n2)").replace(" 3)", "%n3)");
        System.out.printf(formattedMessage);
    }
}