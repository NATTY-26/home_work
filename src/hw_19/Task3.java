package hw_19;

public class Task3 {
    public static void main(String[] args) {
        Converter PrimitiveDataTypeConverter = new Converter("PrimitiveDataTypeConverter");

        int intValue = PrimitiveDataTypeConverter.convertToInt(82);
        double doubleValue = PrimitiveDataTypeConverter.convertToDouble(5.92f);
        String stringValue = PrimitiveDataTypeConverter.convertToString(true);

        System.out.println(intValue); // 82
        System.out.println(doubleValue); // 5.92
        System.out.println(stringValue); // "true"
        System.out.println(PrimitiveDataTypeConverter.getName()); // Название нашего конвертера
    }
}

class Converter {
    private String name;

    public Converter(String name) {
        this.name = name;
    }

    // Методы конвертации для int
    public int convertToInt(byte value) {
        return value;
    }

    public int convertToInt(short value) {
        return value;
    }

    public int convertToInt(int value) {
        return value;
    }

    public int convertToInt(long value) {
        return (int) value;
    }

    public int convertToInt(char value) {
        return value;
    }

    public int convertToInt(float value) {
        return (int) value;
    }

    public int convertToInt(double value) {
        return (int) value;
    }

    public int convertToInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Формат строки неправильный.");
            return 0;
        }
    }

    public int convertToInt(boolean value) {
        System.out.println("Введен тип boolean.");
        return 0;
    }

    // Методы конвертации для double
    public double convertToDouble(byte value) {
        return value;
    }

    public double convertToDouble(short value) {
        return value;
    }

    public double convertToDouble(int value) {
        return value;
    }

    public double convertToDouble(long value) {
        return (double) value;
    }

    public double convertToDouble(char value) {
        return value;
    }

    public double convertToDouble(float value) {
        return value;
    }

    public double convertToDouble(double value) {
        return value;
    }

    public double convertToDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println("Формат строки неправильный.");
            return 0;
        }
    }

    public double convertToDouble(boolean value) {
        System.out.println("Введен тип boolean.");
        return 0;
    }

    // Методы конвертации для String
    public String convertToString(byte value) {
        return String.valueOf(value);
    }

    public String convertToString(short value) {
        return String.valueOf(value);
    }

    public String convertToString(int value) {
        return String.valueOf(value);
    }

    public String convertToString(long value) {
        return String.valueOf(value);
    }

    public String convertToString(char value) {
        return String.valueOf(value);
    }

    public String convertToString(float value) {
        return String.valueOf(value);
    }

    public String convertToString(double value) {
        return String.valueOf(value);
    }

    public String convertToString(String value) {
        return value;
    }

    public String convertToString(boolean value) {
        return String.valueOf(value);
    }

    public String getName() {
        return name;
    }
}
