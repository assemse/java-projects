import java.util.function.BiFunction;

public class Task1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Сумма 5 + 7 = " + sum.apply(5, 7));
    }
}
