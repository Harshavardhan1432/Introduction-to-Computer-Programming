import java.util.*;
public class Q8 {
    public static void main(String [] args)
    {
        Scanner hv = new Scanner(System.in);
        System.out.println("Enter the quadrants");
        double x = hv.nextDouble();
        double y = hv.nextDouble();
        if (x == 0.0)
            System.out.println("(" + x + ", " + y + ")" + " is on the y-axis");
        else if (y == 0.0)
            System.out.println("(" + x + ", " + y + ")" + " is on the x-axis");
        else if (x == 0.0 && y == 0.0)
            System.out.println("(" + x + ", " + y + ")" + " is on the origin");
        else if (x < 0 && y > 0)
            System.out.println("(" + x + ", " + y + ")" + " is in the quadrant II");
        else if (x < 0 && y < 0)
            System.out.println("(" + x + ", " + y + ")" + " is in the quadrant III");
        else if (x > 0 && y < 0)
            System.out.println("(" + x + ", " + y + ")" + " is in the quadrant IV");
        else
            System.out.println("(" + x + ", " + y + ")" + " is in the quadrant I");
    }
}
