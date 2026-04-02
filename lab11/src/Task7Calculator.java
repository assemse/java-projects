import java.util.Scanner;

public class Task7Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число (может быть отрицательным): ");
        double num = sc.nextDouble();
        System.out.println("Вы ввели: " + num);
        sc.close();
    }
}
