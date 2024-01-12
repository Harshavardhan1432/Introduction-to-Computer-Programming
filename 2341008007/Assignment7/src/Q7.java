import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = hv.nextInt();
            System.out.println("The second maximum number is: " + sec_max(arr));
        }
    }
        public static int sec_max (int [] array) {
            int max = array[0];
            int max2 = Integer.MIN_VALUE;
            for (int i = 1; i < array.length; i++) {
                if (array[i] == array[i - 1])
                    continue;
                else if (array[i] >= max) {
                    max2 = max;
                    max = array[i];
                } else if (array[i] >= max2 && array[i] != max)
                    max2 = array[i];
            }
            return max2;
        }
}

