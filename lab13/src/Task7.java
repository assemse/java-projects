import java.util.function.Function;

public class Task7 {
    public static void main(String[] args) {
        Function<String, String> capitalize = s -> s.substring(0,1).toUpperCase() + s.substring(1);
        System.out.println(capitalize.apply("hello")); // Hello
    }
}
