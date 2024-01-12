import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = hv.nextInt();
        }
        System.out.println("The maximum number i s : " + max(arr));
    }
        public static int max(int [] array){
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
    }
