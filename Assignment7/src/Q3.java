import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter 10 elements in array : ");
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++)
            arr[i] = hv.nextInt();
        System.out.println("Enter the number to be searched : ");
        int search = hv.nextInt();
        for (int j = 0; j < 10; j++)
        {
            if (arr[j] == search) {
                System.out.println("Element found at index : " + j);
                count++;
            }
        }
        System.out.println(search + " is found " + count + " times");
    }
}
