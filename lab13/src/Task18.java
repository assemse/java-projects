import java.util.*;

public class Task18 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,2,3,3,4,5);
        numbers.stream()
                .distinct()        // удалить дубликаты
                .limit(3)          // взять первые 3 элемента
                .forEach(n -> System.out.print(n + " "));
    }
}