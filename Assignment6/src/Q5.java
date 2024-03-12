import java.util.Scanner;
public class Q5
{
    public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the number of sides : ");
        int n = hv.nextInt();
        System.out.print("Enter the value of side : ");
        double side = hv.nextDouble();
        System.out.println("The area : " + area(n,side));
    }
    public static double area(int n, double side)
    {
        return (n * Math.pow(side, n))/4 * Math.tan(Math.PI/n);
    }
}
