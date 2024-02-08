//  1   3   6   ....n series

import java.util.Scanner;

public class Series_3
{
    public static void main(String [] args) {
        Scanner hv = new Scanner(System.in);
        int n = hv.nextInt( );
        int i;
        int p = 0;
        for (i = 1; i <= n; i++)
        {
            p = p + i;
            System.out.print(p + " ");
        }
    }
}

