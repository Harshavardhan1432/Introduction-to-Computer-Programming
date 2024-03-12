import java.util.*;
public class Q8 {
	public static void main(String [] args)
	{
		Scanner hv = new Scanner(System.in);
		System.out.println("Please enter the value of x");
		int x = hv.nextInt();
		System.out.println("Please enter the value of x");
		int y = hv.nextInt();
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println(x);
		System.out.println(y);
	}

}