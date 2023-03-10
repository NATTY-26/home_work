package hw_14;

public class Task1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        a = a + b - (b = a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}