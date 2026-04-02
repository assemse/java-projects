import java.util.Scanner;

public class Task12Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = sc.nextDouble();
        System.out.print("Введите число b: ");
        double b = sc.nextDouble();
        double result = a * b / 100;
        System.out.println(a + "% от " + b + " = " + result);
        sc.close();
    }
}
