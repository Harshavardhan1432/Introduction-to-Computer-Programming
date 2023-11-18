//Calculate Bus Fair
import java.util.Scanner;
public class bus_fair
{
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Please enter the distance to be travelled");
        int distance = hv.nextInt();
        int fair;
        if (distance <= 10)
          fair = 10;
        else if (distance <= 40)
            fair = 20;
        else if (distance <= 100)
            fair = 60;
        else
            fair = 120;
        System.out.println("The total distance travelled " + distance);
        System.out.println("The total fair " + fair);
    }
}
