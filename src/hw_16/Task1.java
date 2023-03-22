package hw_16;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Выберите программу для скачивания (IntelliJ IDEA, Git, Java) или нажмите \"ВЫХОД\" для выхода: ");
        String program = input.nextLine().toLowerCase().trim();

        switch (program) {
            case "intellij idea" -> {
                System.out.println("Выберите операционную систему (Linux, macOS, Windows) или нажмите \"ВЫХОД\" для выхода: ");
                String osForIntelliJIDEA = input.nextLine().toLowerCase().trim();
                switch (osForIntelliJIDEA) {
                    case "linux" -> System.out.println("https://www.jetbrains.com/idea/download/#section=linux");
                    case "macos" -> System.out.println("https://www.jetbrains.com/idea/download/#section=mac");
                    case "windows" -> System.out.println("https://www.jetbrains.com/idea/download/#section=windows");
                    case "выход" -> System.exit(0);
                    default -> System.out.println("Такой операционной системы не существует.");
                }
            }
            case "git" -> {
                System.out.println("Выберите операционную систему (Linux, macOS, Windows) или нажмите \"ВЫХОД\" для выхода: ");
                String osForGit = input.nextLine().toLowerCase().trim();
                switch (osForGit) {
                    case "linux" -> System.out.println("https://git-scm.com/download/linux");
                    case "macos" -> System.out.println("https://git-scm.com/download/mac");
                    case "windows" -> System.out.println("https://git-scm.com/download/win");
                    case "выход" -> System.exit(0);
                    default -> System.out.println("Такой операционной системы не существует.");
                }
            }
            case "java" -> {
                System.out.println("Выберите операционную систему (Linux, macOS, Windows) или нажмите \"ВЫХОД\" для выхода: ");
                String osForJava = input.nextLine().toLowerCase().trim();
                switch (osForJava) {
                    case "linux" ->
                            System.out.println("https://adoptopenjdk.net/installation.html?variant=openjdk17&jvmVariant=hotspot");
                    case "macos" ->
                            System.out.println("https://adoptopenjdk.net/installation.html?variant=openjdk17&jvmVariant=hotspot");
                    case "windows" ->
                            System.out.println("https://adoptopenjdk.net/installation.html?variant=openjdk17&jvmVariant=hotspot#x64_win-jdk");
                    case "выход" -> System.exit(0);
                    default -> System.out.println("Такой операционной системы не существует.");
                }
            }
            case "выход" -> System.exit(0);
            default -> System.out.println("Такой программы не существует.");
        }
    }
}