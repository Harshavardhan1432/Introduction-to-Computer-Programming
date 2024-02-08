// s = 10 + 100 + ... n terms
import java.util.Scanner;
public class Sum_6
{
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int n = hv.nextInt();
        double s = 0, p;
        int i;
        for(i = 1; i<=n; i++)
        {
            p=Math.pow(10,i);
            s=s+p;
        }
        System.out.println(s);
    }
}
