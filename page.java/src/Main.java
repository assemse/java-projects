class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

class Student extends Person {
    String group;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}

public class Main {

    static int classVariable = 100;

    static void scopeDemo() {
        int localVariable = 50;
        System.out.println(classVariable);
        System.out.println(localVariable);
    }

    public static void main(String[] args) {

        int age = 19;
        double height = 160.5;
        boolean isStudent = true;
        final double PI = 3.14159;

        System.out.println(age);
        System.out.println(height);
        System.out.println(isStudent);
        System.out.println(PI);

        int number = 10;
        String text = "Java";

        System.out.println(number);
        System.out.println(text);

        scopeDemo();

        Person person = new Student();
        person.name = "Иван";
        person.age = 20;
        ((Student) person).group = "ИС-2204";

        person.displayInfo();
    }
}