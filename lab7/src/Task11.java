public class Task11 {
    public static void main(String[] args) {

        int[] A = new int[25];

        for(int i=0;i<25;i++){
            A[i]=(int)(Math.random()*50);
            System.out.print(A[i]+" ");
        }

        int min=A[0], max=A[0], minIndex=0, maxIndex=0;

        for(int i=1;i<25;i++){
            if(A[i]<min){min=A[i];minIndex=i;}
            if(A[i]>max){max=A[i];maxIndex=i;}
        }

        int temp=A[minIndex];
        A[minIndex]=A[maxIndex];
        A[maxIndex]=temp;

        System.out.println("\nПосле обмена:");

        for(int i=0;i<25;i++)
            System.out.print(A[i]+" ");
    }
}
