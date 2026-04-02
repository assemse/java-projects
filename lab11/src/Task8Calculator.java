import java.util.Scanner;
import java.util.InputMismatchException;

public class Task8Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            double num = sc.nextDouble();
            System.out.println("Вы ввели: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число!");
        }
        sc.close();
    }
}
