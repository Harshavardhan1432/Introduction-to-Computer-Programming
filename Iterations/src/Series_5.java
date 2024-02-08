//  1   11  111  1111    .....n series

import java.util.Scanner;

public class Series_5
{
    public static void main(String [] args) {
        Scanner hv = new Scanner(System.in);
        int n = hv.nextInt( );
        int i, p = 0;
        for (i = 1; i <= n; i++)
        {
            p = ( p * 10 ) + 1;
            System.out.print(p + " ");
        }
    }
}
