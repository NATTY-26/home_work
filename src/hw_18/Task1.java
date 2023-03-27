package hw_18;

public class Task1 {
    public static void main(String[] args) {
        // вывод суммы на консоль с помощью метода, принимающего в качестве параметров два числа
        printSum(2, 3);

        // вывод суммы на консоль с помощью метода, возвращающего сумму двух чисел, которые он принимает в параметре метода
        int sum = getSum(4, 5);
        System.out.println(sum);
    }

    // метод, который выводит сумму на консоль
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    // метод, который возвращает сумму чисел
    public static int getSum(int a, int b) {
        return a + b;
    }
}