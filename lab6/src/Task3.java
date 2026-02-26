public class Task3 {

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        int intResult = max(10, 25);
        System.out.println("Максимум из целых чисел 10 и 25: " + intResult);

        double doubleResult = max(5.7, 3.2);
        System.out.println("Максимум из чисел 5.7 и 3.2: " + doubleResult);
    }
}
