import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        double [] arr = new double[10];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < 10; i++)
            arr[i] = hv.nextDouble();
        System.out.println("Smallest : " +min(arr));
    }
    public static double min(double[] array)
    {
        double smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }
}
