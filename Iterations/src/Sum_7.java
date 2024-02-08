//s = 16 * 1 + 15 * 2 ..... 2 * 15 + 1 * 16
public class Sum_7
{
    public static void main(String [] args)
    {
        int i, x = 0, s = 0;
        for(i = 16; i>=1; i--)
        {
            s=i*x;
            x=s+1;
        }
        System.out.println(s);
    }
}
