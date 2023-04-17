package hw_19;

public class Task1 {
    public static void main(String[] args) {
        Computer myPC = new Computer("Vinga Odin A5313", 57977, 32, 12);
        System.out.println(myPC.getInfo());
    }
}

class Computer {
    private String brand;
    private int price;
    private int ram;
    private int gpu;

    public Computer(String brand, int price, int ram, int gpu) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.gpu = gpu;
        System.out.println("Создан PC.\nИмя = " + brand + "\nЦена = " + price + "\nВидеокарта = " + gpu + "\nОЗУ = " + ram);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getGpu() {
        return gpu;
    }

    public void setGpu(int gpu) {
        this.gpu = gpu;
    }

    public String getInfo() {
        return "Имя = " + getBrand() + "\nЦена = " + getPrice() + "\nВидеокарта = " + getGpu() + "\nОЗУ = " + getRam();
    }
}