import java.util.*;
import java.util.stream.Collectors;

public class Task13 {
    static class Person { String name; int age; Person(String n, int a){name=n; age=a;} }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", 25), new Person("Bob", 22));
        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparing(p -> p.age))
                .collect(Collectors.toList());
        sortedByAge.forEach(p -> System.out.println(p.name + " " + p.age));
    }
}
