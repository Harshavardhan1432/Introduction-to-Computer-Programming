// s =
import java.util.Scanner;

public class Sum_4
{
    public static void main(String[]args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Please enter the value");
        int n = hv.nextInt();
        int i, p = 0,s=0;
        for (i=1;i<=n;i+=3)
        {
            p = ( p*10 ) + 3;
            s = s + p ;
        }
        System.out.println(s);
    }
}
