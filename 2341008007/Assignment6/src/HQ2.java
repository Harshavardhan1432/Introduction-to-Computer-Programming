import java.util.Scanner;
public class HQ2
{
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the value of length : ");
        double length = hv.nextDouble();
        System.out.print("Enter the value of breadth : ");
        double breadth = hv.nextDouble();
        System.out.print("Enter the value of height : ");
        double height = hv.nextDouble();
        System.out.print("Enter the value of radius : ");
        double radius = hv.nextDouble();
        System.out.println("The volume of the cuboid  : " + volume(length,breadth,height));
        System.out.println("The volume of the sphere : " + volume(radius));

    }
    public static double volume(double l, double b, double h)
    {
        return l * b * h;
    }
    public static double volume (double radius)
    {
        return Math.PI * Math.pow(radius,3) * 4/3;
    }
}
