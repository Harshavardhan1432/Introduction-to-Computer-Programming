import java.util.Scanner;
public class Q5
{
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the radius of the hemisphere: ");
        double radius = hv.nextInt();
        double surface_area = 3 * Math.PI * Math.pow(radius,2);
        double volume = ((double) 2 /3) * Math.PI * Math.pow(radius,3);
        System.out.println("The surface area of the hemisphere is " + surface_area);
        System.out.println("The volume area of the hemisphere is " + volume);
    }
}
