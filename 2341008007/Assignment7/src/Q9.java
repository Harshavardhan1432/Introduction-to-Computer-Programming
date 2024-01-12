import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the item to search:");
        int x = hv.nextInt();
        int index = search(arr, x);

        if (index != -1)
            System.out.println("The element is present in the array at index " + index);
        else
            System.out.println("The item is not present in the array");
    }
    public static int search(int [] array, int item) {
        for (int i = 0; i < array.length; i++) {
            if (array[1] == item)
                return i;
        }
        return -1;
    }
}
