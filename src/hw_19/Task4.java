package hw_19;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}

class Calculator {
    public void start() {
        System.out.println("Калькулятор запущен.");
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Введите действие: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Калькулятор закрыт.");
                break;
            }
            String[] parts = input.split("[+\\-*/]");
            if (parts.length != 2) {
                System.out.println("Введите корректное действие.");
                continue;
            }
            double a = Double.parseDouble(parts[0]);
            double b = Double.parseDouble(parts[1]);
            if (input.contains("+")) {
                System.out.println(summ(a, b));
            } else if (input.contains("-")) {
                System.out.println(minus(a, b));
            } else if (input.contains("*")) {
                System.out.println(multiply(a, b));
            } else if (input.contains("/")) {
                System.out.println(division(a, b));
            } else {
                System.out.println("Введите корректное действие.");
            }
        }
    }

    public double summ(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }
}
