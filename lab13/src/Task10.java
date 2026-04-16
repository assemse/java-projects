import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 4, 2);
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println("Минимальное число: " + min.orElse(0));
    }
}
