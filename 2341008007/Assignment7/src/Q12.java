import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter ten integer values: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++)
            numbers[i] = hv.nextInt();
        selectionSort(numbers);
        System.out.print("Sorted elements: ");
        for (int number : numbers)
            System.out.print(number + " ");
        hv.close();
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

