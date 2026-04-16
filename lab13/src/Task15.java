import java.util.*;

public class Task15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(n -> n > 2)      // фильтр: оставить числа > 2
                .map(n -> n * n)         // преобразовать в квадрат
                .sorted()                // сортировка
                .forEach(n -> System.out.print(n + " ")); // вывод
    }
}
