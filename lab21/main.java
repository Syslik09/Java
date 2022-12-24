package lab21;

public class main {
    public static void main(String[] msi) {
        Student student = new Student("Вася", "Пупкин", "БАП1901", 4.3);
        Aspirant aspirant = new Aspirant("Валера", "Максимов", "БУТ1901", 5, "Климат-контроль");
        Student un = new Aspirant("Евгений", "Посиделкин", "БАП1901", 4.7, "Робот");
        Student[] students = { student, aspirant, un };

        for (Student s : students)
            System.out.println(s.getScholarship());
    }
}