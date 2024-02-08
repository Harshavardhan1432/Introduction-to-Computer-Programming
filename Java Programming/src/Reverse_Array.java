import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = hv.nextInt();
        System.out.print("Enter the values : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = hv.nextInt();
        for (int j = size - 1; j >= 0; j--)
            System.out.print(array[j] + "\t");
    }
}
