// s = 3 + 33 + 333 + ... n terms
import java.util.Scanner;

public class Sum_5
{
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n = hv.nextInt();
        int i,p = 0, s = 0;
        for(i = 1;i<=n;i++)
        {
            p = (p*10)+3;
            s=s+p;
        }
        System.out.println(s);

    }
}
