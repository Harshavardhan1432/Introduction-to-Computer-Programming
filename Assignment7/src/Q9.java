import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = hv.nextInt();
        double [] arr = new double[n];
        for (int i = 0; i < n; i++)
            arr[i] = hv.nextDouble();
        System.out.println("Mean : " + mean(arr));
        System.out.println("Deviation : " + deviation(arr));
        hv.close();
    }
    public static double mean(double [] x) {
        double sum = 0;
        for (double v : x)
            sum += v;
        return sum/x.length;
    }
    public static double deviation(double [] x)
    {
        double deviation = 0;
        for (double v : x) {
            deviation += Math.sqrt(Math.pow((v - mean(x)), 2) / (x.length - 1));
        }
        return deviation;
    }
}