package hw_14;

public class Task4 {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String string1 = string.substring(0, 7);
        int length1 = string1.length();
        System.out.println("Cлово1 = (" + string1 + "), Длина этого слова = (" + length1 + ")");

        String string2 = string.substring(9, 11);
        int length2 = string2.length();
        System.out.println("Cлово2 = (" + string2 + "), Длина этого слова = (" + length2 + ")");

        String string3 = string.substring(12, 14);
        int length3 = string3.length();
        System.out.println("Cлово3 = (" + string3 + "), Длина этого слова = (" + length3 + ")");

        String string4 = string.substring(15, 24);
        int length4 = string4.length();
        System.out.println("Cлово4 = (" + string4 + "), Длина этого слова = (" + length4 + ")");

        String string5 = string.substring(25, 28);
        int length5 = string5.length();
        System.out.println("Cлово5 = (" + string5 + "), Длина этого слова = (" + length5 + ")");

        boolean firstword;
        if (length1 > length2 && length1 > length3 && length1 > length4 && length1 > length5) {
            firstword = true;
        } else {
            firstword = false;
        }
        System.out.println("Первое слово длиннее остальных - " + firstword);
    }
}
