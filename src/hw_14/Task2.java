package hw_14;

public class Task2 {
    public static void main(String[] args) {
        double chislitel = 7.0;
        double znamenatel = 5.0;

        int chislitelInt = (int) chislitel;
        int znamenatelInt = (int) znamenatel;
        int delenie = chislitelInt / znamenatelInt;
        int celayaСhast = delenie;
        int ostatok = chislitelInt % znamenatelInt;

        System.out.println("Целая часть равна " + celayaСhast);
        System.out.println("Остаток от деления равен " + ostatok);
        System.out.println("Знаменатель равен " + znamenatelInt);
        System.out.println("Результат приведения " + chislitel + "/" + znamenatel + " равен " + celayaСhast + " " + ostatok + "/" + znamenatelInt);
    }
}
