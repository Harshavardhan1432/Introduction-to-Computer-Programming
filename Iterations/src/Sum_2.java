// S = 1+3+6+.... n terms

import java.util.Scanner;

public class Sum_2
{
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
            int n = hv.nextInt();
            int i,s= 0, p=0;
            for (i = 1; i <= n ; i++) {
                p = p + i;
                s = s + p;
            }
        System.out.print(s);
    }
}
