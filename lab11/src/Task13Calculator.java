import java.util.Scanner;

public class Task13Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите угол в градусах: ");
        double angle = sc.nextDouble();
        System.out.println("sin: " + Math.sin(Math.toRadians(angle)));
        System.out.println("cos: " + Math.cos(Math.toRadians(angle)));
        System.out.println("tan: " + Math.tan(Math.toRadians(angle)));
        sc.close();
    }
}
