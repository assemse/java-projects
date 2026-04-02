import java.util.Scanner;

public class Task6Calculator {

    // Методы
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль");
            return 0;
        }
        return a / b;
    }
    public static double power(double a, double b) { return Math.pow(a, b); }
    public static double sqrt(double a) {
        if (a < 0) {
            System.out.println("Ошибка: нельзя извлечь корень из отрицательного числа");
            return 0;
        }
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat = "yes";

        do {
            System.out.println("Выберите операцию:");
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Умножение");
            System.out.println("4 - Деление");
            System.out.println("5 - Степень (x^y)");
            System.out.println("6 - Квадратный корень (√x)");

            int choice = scanner.nextInt();
            double num1, num2, result = 0;

            switch (choice) {
                case 1:
                    System.out.print("Введите первое число: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Введите второе число: ");
                    num2 = scanner.nextDouble();
                    result = add(num1, num2);
                    break;
                case 2:
                    System.out.print("Введите первое число: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Введите второе число: ");
                    num2 = scanner.nextDouble();
                    result = subtract(num1, num2);
                    break;
                case 3:
                    System.out.print("Введите первое число: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Введите второе число: ");
                    num2 = scanner.nextDouble();
                    result = multiply(num1, num2);
                    break;
                case 4:
                    System.out.print("Введите первое число: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Введите второе число: ");
                    num2 = scanner.nextDouble();
                    result = divide(num1, num2);
                    break;
                case 5:
                    System.out.print("Введите основание: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Введите показатель степени: ");
                    num2 = scanner.nextDouble();
                    result = power(num1, num2);
                    break;
                case 6:
                    System.out.print("Введите число: ");
                    num1 = scanner.nextDouble();
                    result = sqrt(num1);
                    break;
                default:
                    System.out.println("Неверная операция");
                    continue;
            }

            System.out.println("Результат: " + result);
            System.out.print("Продолжить? (yes/no): ");
            repeat = scanner.next();

        } while (repeat.equalsIgnoreCase("yes"));

        scanner.close();
    }
}