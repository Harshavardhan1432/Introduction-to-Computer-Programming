import java.util.*;
public class Negative_Positive {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = hv.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++)
            array [i] = hv.nextInt();
        System.out.println("Original array: " + Arrays.toString(array));
        moveNegativeElements(array);
        System.out.println("Array after moving negative elements: " + Arrays.toString(array));
    }

    public static void moveNegativeElements(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            while (left <= right && array[left] < 0)
                left++;
            while (left <= right && array[right] >= 0)
                right--;
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }
}
