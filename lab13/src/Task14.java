import java.util.*;
import java.util.stream.Collectors;

public class Task14 {
    static class Student {
        String name; int age; double grade;
        Student(String n, int a, double g){name=n; age=a; grade=g;}
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, 90),
                new Student("Bob", 22, 75),
                new Student("Charlie", 21, 85)
        );

        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(s -> System.out.println(s.name));
    }
}
