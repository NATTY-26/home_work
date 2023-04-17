package hw_19;

public class Task2 {
    public static void main(String[] args) {
        Tree tree1 = new Tree("Бук", 260);
        System.out.println("Информация по объекту tree1:");
        System.out.println("Тип: " + tree1.getType());
        System.out.println("Высота: " + tree1.getHeight());
        System.out.println("Количество веток: " + tree1.getCountOfSticks());
        System.out.println("Цвет: " + tree1.getColour());

        Tree tree2 = new Tree(130, 15, "Серебристо-синий");
        System.out.println("Информация по объекту tree2:");
        System.out.println("Тип: " + tree2.getType());
        System.out.println("Высота: " + tree2.getHeight());
        System.out.println("Количество веток: " + tree2.getCountOfSticks());
        System.out.println("Цвет: " + tree2.getColour());

        Tree tree3 = new Tree();
        System.out.println("Информация по объекту tree3:");
        System.out.println("Тип: " + tree3.getType());
        System.out.println("Высота: " + tree3.getHeight());
        System.out.println("Количество веток: " + tree3.getCountOfSticks());
        System.out.println("Цвет: " + tree3.getColour());

        Tree tree4 = new Tree("Американский клен");
        System.out.println("Информация по объекту tree4:");
        System.out.println("Тип: " + tree4.getType());
        System.out.println("Высота: " + tree4.getHeight());
        System.out.println("Количество веток: " + tree4.getCountOfSticks());
        System.out.println("Цвет: " + tree4.getColour());
    }
}
class Tree {
    private String type;
    private int height;
    private int countOfSticks;
    private String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;
        this.colour = "Зеленый";
    }

    public Tree (int height, int countOfSticks, String colour) {
        this.type = "Пихта";
        this.height = height;
        this.countOfSticks = countOfSticks;
        this.colour = colour;
    }

    public Tree() {
        this.height = 350;
        this.countOfSticks = 29;
        this.colour = "Желтый";
    }

    public Tree(String type) {
        this();
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public int getCountOfSticks() {
        return countOfSticks;
    }

    public String getColour() {
        return colour;
    }
}
