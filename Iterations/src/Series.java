// 1    4   9   16  25  .....n series

import java.util.Scanner;

public class Series
{
    public static void main(String [] args) {
        Scanner hv = new Scanner(System.in);
        int n = hv.nextInt( );
        int i, p;
        for (i = 1; i <= n; i++)
        {
            p = ( i * i );
            System.out.print(p + " ");
        }
    }
}
