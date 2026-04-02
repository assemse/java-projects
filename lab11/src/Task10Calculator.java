import java.util.ArrayList;

public class Task10Calculator {
    public static void main(String[] args) {
        ArrayList<String> history = new ArrayList<>();
        history.add("2 + 2 = 4");
        history.add("5 * 3 = 15");

        System.out.println("История вычислений:");
        for (String s : history) System.out.println(s);
    }
}
