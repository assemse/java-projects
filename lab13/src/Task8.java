import java.util.*;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange");
        List<String> longStrings = strings.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println("Длина > 5: " + longStrings);
    }
}