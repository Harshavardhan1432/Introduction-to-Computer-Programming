//y=ax2 + bx + c;
import java.util.*;
public class quad_eq
{
    public static void main(String [] args)
    {
       Scanner hv = new Scanner(System.in);
       System.out.println("Enter a value for a");
       int a = hv.nextInt();
        System.out.println("Enter a value for b");
        int b= hv.nextInt();
        System.out.println("Enter a value for c");
        int c= hv.nextInt();
        System.out.println("Enter a value for x");
        int x= hv.nextInt();
        int y;
        if(x<=4)
        {
            y= (a*x*x + b*x + c);
            System.out.println(y);
        }
        else
        {
            y= -a*x*x + b*x -c;
            System.out.println(y);
        }
    }
}
