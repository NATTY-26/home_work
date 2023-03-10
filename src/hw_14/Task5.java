package hw_14;

public class Task5 {
    public static void main(String[] args) {
        String string = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
        String[] text = string.toLowerCase().split("a");
        System.out.println(text.length - 1);

    }
}