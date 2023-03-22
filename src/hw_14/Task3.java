package hw_14;

public class Task3 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        String string2 = string1.substring(0, 35);
        String string3 = string2.replace(" i ", " don't ") + " it is perfect";
        int length1 = string1.length();
        int length2 = string2.length();
        int length3 = string3.length();

        System.out.println(string1);
        System.out.println(length1);
        System.out.println(string2);
        System.out.println(length2);
        System.out.println(string3);
        System.out.println(length3);
    }
}