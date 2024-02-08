import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = hv.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = hv.nextInt();
        Arrays.sort(array);
        int max = array.length - 2;
        if (max < array[n - 1])
            System.out.print(array[max]);
    }
}
