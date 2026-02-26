import java.util.Scanner;
public class Task5 {

    public static long power(int base, int exponent) {

        if (exponent < 0) {
            System.out.println("Отрицательная степень не поддерживается.");
            return -1;
        }

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание: ");
        int base = scanner.nextInt();

        System.out.print("Введите степень (целое неотрицательное число): ");
        int exponent = scanner.nextInt();

        long result = power(base, exponent);

        if (result != -1) {
            System.out.println(base + " в степени " + exponent + " равно: " + result);
        }

        scanner.close();
    }
}
