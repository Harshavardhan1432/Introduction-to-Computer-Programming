import java.util.Scanner;
public class Q1 {
	public static void main(String [] args)
	{
		Scanner hv = new Scanner(System.in);
		System.out.println("Please enter the temperature");
		double f = hv.nextDouble();
		double c = (f-32)*(5.0/9);
		System.out.print(f + " Fahrenheit = " + c + " Celcius");
	}

}
