import java.util.Arrays;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner hv =  new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = hv.nextInt();
        double [] arr = new double[n];
        for (int i = 0; i < n; i++)
            arr [i] = hv.nextDouble();
        System.out.println("Second largest : " + sec(arr));
    }
    public static double sec(double [] array){
        Arrays.sort(array);
        return array.length - 1;
    }
}
