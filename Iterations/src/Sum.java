//  s = 1+3+5+... n terms

import java.util.Scanner;

public class Sum
{
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        int n = hv.nextInt();
        int i,s= 0, p=0;
        for (i = 1; i <= n ; i+=2) {
            p = p + i;
            s = s + p;
        }
        System.out.println(s);
    }
}
