import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = hv.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[1] = hv.nextInt();
        }
        System.out.print("The elements without reverse: ");
        for (int j = 0; j < n; j++)
            System.out.print(arr[j] + " ");
        reverse(arr);
    }
        public static void reverse (int[] array)
        {
            int j = array.length - 1;
            for (int i = 0; i < j; i++) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j--;
            }
            System.out.print("\nThe elements after reverse : ");
            for (int i : array) System.out.print(i + " ");
        }
    }

//    for (int k = 0; k < array.length; k++)
//        System.out.print(array [k] + " ");