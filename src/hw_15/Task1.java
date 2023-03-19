package hw_15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку:");

        String string1 = input.next();
        String string2 = input.next();
        String string3 = input.next() + "\b";
        String string4 = input.next();
        string4 = string4 + " " + input.next();
        string4 = string4 + " " + input.next();

        System.out.println(string1 + "\n" + string2 + "\n" + string3 + "\n" + string4);
    }
}