import java.util.Scanner;

public class Task9Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите операцию:");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        int choice = sc.nextInt();
        System.out.println("Вы выбрали операцию номер: " + choice);
        sc.close();
    }
}
