import java.util.*;
import java.util.stream.Collectors;

public class Task16 {
    static class Student {
        String name; int age; double grade;
        Student(String n, int a, double g){name=n; age=a; grade=g;}
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, 90),
                new Student("Bob", 22, 75),
                new Student("Charlie", 20, 85)
        );

        Map<Integer, List<Student>> groupedByAge = students.stream()
                .collect(Collectors.groupingBy(s -> s.age));

        groupedByAge.forEach((age, group) -> {
            System.out.println("Возраст: " + age);
            group.forEach(s -> System.out.println(" - " + s.name));
        });
    }
}
