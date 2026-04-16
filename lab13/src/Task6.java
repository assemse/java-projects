import java.util.*;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange");
        List<String> sortedByLength = strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Отсортировано по длине: " + sortedByLength);
    }
}