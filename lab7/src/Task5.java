public class Task5 {
    public static void main(String[] args) {
        double[] D = new double[17];
        double sum = 0;

        for (int i = 0; i < 17; i++) {
            D[i] = Math.random()*20;
            sum += D[i];
            System.out.print(D[i] + " ");
        }

        System.out.println("\nСреднее: " + sum/17);
    }
}
