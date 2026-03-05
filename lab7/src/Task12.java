import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {

        int[] B = new int[25];

        for(int i=0;i<25;i++){
            B[i]=(int)(Math.random()*50);
            System.out.print(B[i]+" ");
        }

        Arrays.sort(B);

        System.out.println("\nОтсортированный:");
        for(int x : B)
            System.out.print(x+" ");
    }
}
