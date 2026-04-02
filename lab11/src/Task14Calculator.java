import java.util.Scanner;
import java.util.regex.*;

public class Task14Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите выражение (пример: 2+3*4): ");
        String expr = sc.nextLine();
        expr = expr.replaceAll("\\s+", "");
        Pattern p = Pattern.compile("(\\d+\\.?\\d*)([+\\-*/])(\\d+\\.?\\d*)");
        Matcher m = p.matcher(expr);
        if (m.matches()) {
            double a = Double.parseDouble(m.group(1));
            double b = Double.parseDouble(m.group(3));
            double res = 0;
            switch(m.group(2)) {
                case "+": res = a + b; break;
                case "-": res = a - b; break;
                case "*": res = a * b; break;
                case "/": res = a / b; break;
            }
            System.out.println("Результат: " + res);
        } else {
            System.out.println("Неверное выражение!");
        }
        sc.close();
    }
}
