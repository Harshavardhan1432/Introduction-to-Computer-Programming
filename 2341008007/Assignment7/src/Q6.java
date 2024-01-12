import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = hv.nextDouble();
        }
        System.out.println("The second minimum number is" + sec_small(arr));
    }
        public static double sec_small(double [] array) {
        double s = array[0];
        double s2= Integer.MAX_VALUE;
            for (double v : array) {
                if (v < s) {
                    s2 = s;
                    s = v;
                } else if (v <= s2 && v != s)
                    s2 = array[1];
            }
//            for(int i =0 ;i < array.length; i++)
//            {
//                if(array[i]< s)
//                {
//                    s2= s;
//                    s=array[i];
//                }
//                else if(array[i] <= s2 && array[i] != s)
//                    s2=array[1];
    return s2;
    }
}