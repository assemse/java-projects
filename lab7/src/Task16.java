public class Task16 {

    public static int maxX() {
        int[] array = new int[10];

        for(int i=0;i<10;i++){
            array[i]=(int)(Math.random()*50);
            System.out.print(array[i]+" ");
        }

        int max=array[0];

        for(int i=1;i<10;i++)
            if(array[i]>max)
                max=array[i];

        return max;
    }

    public static void main(String[] args) {
        System.out.println("\nМаксимальный элемент: "+maxX());
    }
}