import java.util.Scanner;

public class Q10
{
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++)
            numbers[i] = hv.nextInt();
        int[] distinctNumbers = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int number : distinctNumbers)
            System.out.print(number + " ");
        hv.close();
    }

    public static int[] eliminateDuplicates(int[] list)
    {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (list[j] == list[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate)
                count++;
        }
        int[] distinctArray = new int[count];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (list[j] == list[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate)
                distinctArray[index++] = list[i];
        }
        return distinctArray;
    }
}

