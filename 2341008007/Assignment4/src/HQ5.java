import java.util.Scanner;
public class HQ5
{ public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = hv.nextInt();

        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print("  ");
            }
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        hv.close();
    }
}

