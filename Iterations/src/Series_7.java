//  1   10  100     1000    .....n series

import java.util.Scanner;

public class Series_7
{
    public static void main(String [] args) {
        Scanner hv = new Scanner(System.in);
        int n = hv.nextInt( );
        int i; double p;
        for (i = 0; i <= n; i++)
        {
            p = Math.pow(10,i);
            System.out.print(p + " ");
        }
    }
}

