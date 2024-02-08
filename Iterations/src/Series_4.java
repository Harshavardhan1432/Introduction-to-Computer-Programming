//  2   6   12  ....n series

import java.util.Scanner;

public class Series_4
{
    public static void main(String [] args) {
        Scanner hv = new Scanner(System.in);
        int n = hv.nextInt( );
        int i, p;
        for (i = 1; i <= n; i++)
        {
            p = ( i * i ) + i;
            System.out.print(p + " ");
        }
    }
}
