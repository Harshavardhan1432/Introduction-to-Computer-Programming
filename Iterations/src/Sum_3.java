import java.util.Scanner;

public class Sum_3
{
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        int n = hv.nextInt();
        double i,s= 0;
        double p;
        for (i = n; i <= n ; i+=2)
        {
            p = (i*i) + i;
            s = s + p;
            s=s+s;
        }
        System.out.print(s);
    }
}
