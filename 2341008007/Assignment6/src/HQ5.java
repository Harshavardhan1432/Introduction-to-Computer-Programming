import java.util.Scanner;
public class HQ5 {
    public static void main(String[] args) {
        Scanner hv = new Scanner (System.in);
        System.out.println("Enter first number : ");
        int x = hv.nextInt();
        System.out.println("Enter second number : ");
        int y = hv.nextInt();
        System.out.println("Enter third number : ");
        int z = hv.nextInt();
        System.out.println("Check whether the given three numbers are consecutive or not : " + consecutive(x,y,z));
    }
    public static boolean consecutive (int x,  int y, int z)
    {
        return ((x+1 == y && y+1 == z) || (y+1 == z && z+1 == x));
    }
}
