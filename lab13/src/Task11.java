import java.util.function.Consumer;

public class Task11 {
    public static void main(String[] args) {
        Consumer<String> printConsumer = System.out::println;
        printConsumer.accept("Hello Consumer");
    }
}
