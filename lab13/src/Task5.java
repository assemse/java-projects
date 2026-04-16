import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int max = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println("Максимальный элемент: " + max);
    }
}