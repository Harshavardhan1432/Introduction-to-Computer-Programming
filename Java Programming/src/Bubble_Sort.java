import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter ten double numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++)
            numbers[i] = hv.nextDouble();
        bubbleSort(numbers);
        System.out.print("Sorted numbers: ");
        for (double number : numbers)
            System.out.print(number + " ");
        hv.close();
    }

    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        boolean check;
        do {
            check = false;
            for (int i = 1; i < n; i++)
            {
                if (arr[i - 1] > arr[i])
                {
                    double temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    check = true;
                }
            }
            n--;
        } while (check);
    }
}


