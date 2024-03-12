import java.util.Scanner;
public class Q3 {
    public static void main (String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.print("Input First Number : ");
        int a = hv.nextInt();
        System.out.print("Input Second Number : ");
        int b = hv.nextInt();
        System.out.print("Input Third Number : ");
        int c = hv.nextInt();
        if (a <= b && b <= c)
            System.out.println("Increasing");
        else if (c <= b && b <= a)
            System.out.println("Decreasing");
        else
            System.out.println("Neither Increasing nor decreasing");
    }
}
