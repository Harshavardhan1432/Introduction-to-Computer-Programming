import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = hv.nextDouble();
        }
        System.out.println("The minimum number is " + min(arr));
    }
        public static double min(double[]array) {
            double min =array [0];
            for(int i =1 ;i <array.length;i++){
                if(array[i]<min)
                    min=array[i];
            }
    return min;
    }
}
