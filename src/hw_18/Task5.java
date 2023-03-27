package hw_18;
public class Task5 {
    public static void main(String[] args) {
        Konspekt konspekt = new Konspekt();
        konspekt.setSubject("Электронные компоненты и системы");
        konspekt.setStudentName("Иванов Олег Викторович");
        konspekt.setPageCount(62);
        konspekt.setYear(2014);
        konspekt.setCoverColor("синий");
        konspekt.setInstitution("Киевский политехнический институт им. И. Сикорского");

        System.out.println("Предмет: " + konspekt.getSubject());
        System.out.println("Студент: " + konspekt.getStudentName());
        System.out.println("Количество страниц: " + konspekt.getPageCount());
        System.out.println("Год выпуска: " + konspekt.getYear());
        System.out.println("Цвет обложки: " + konspekt.getCoverColor());
        System.out.println("Учебное заведение: " + konspekt.getInstitution());
    }
}

class Konspekt {
    private String subject;
    private String studentName;
    private int pageCount;
    private int year;
    private String coverColor;
    private String institution;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}