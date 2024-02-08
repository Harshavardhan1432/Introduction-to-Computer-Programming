//  1   12  123 1234    12345   .....n series

import java.util.Scanner;

public class Series_6
{
    public static void main(String [] args) {
        Scanner hv = new Scanner(System.in);
        int n = hv.nextInt( );
        int i, p = 0;
        for (i = 1; i <= n; i++)
        {
            p = ( p * 10 ) + i;
            System.out.print(p + " ");
        }
    }
}

