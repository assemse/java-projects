import java.util.*;
import java.util.stream.Collectors;

public class Task20 {
    public static void main(String[] args) {
        List<Integer> orders = Arrays.asList(500, 1200, 1500, 800, 3000);

        orders.stream()
                .filter(o -> o > 1000)  // фильтр: заказы > 1000
                .sorted()                // сортировка по возрастанию
                .forEach(o -> System.out.print(o + " "));
    }
}
