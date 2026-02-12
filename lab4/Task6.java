import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Доступ разрешён");
        } else {
            System.out.println("Доступ запрещён");
        }
    }
}
