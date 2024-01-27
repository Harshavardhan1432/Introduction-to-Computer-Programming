import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the value of height : ");
        double height = hv.nextDouble();
        System.out.print("Enter the value of base : ");
        double base = hv.nextDouble();
        System.out.print("Enter the value of side : ");
        int side = hv.nextInt();
        System.out.println("Enter the value of radius : ");
        double radius = hv.nextDouble();
        System.out.print("Enter the value of length : ");
        int length = hv.nextInt();
        System.out.print("Enter the value of breadth : ");
        int breadth = hv.nextInt();
        System.out.println("The area of the triangle is " + area(height,base));
        System.out.println("The area of the square is " + area(side));
        System.out.println("The area of the circle is " + area(radius));
        System.out.println("The area of the rectangle is " + area(length,breadth));
    }
    public static double area (double height, double base)
    {
        return 0.5 * base * height;
    }
    public static int area (int side)
    {
        return side * side;
    }
    public static double area (double radius)
    {
        return Math.PI * radius * radius;
    }
    public static int area (int length, int breadth)
    {
        return length * breadth;
    }
}
