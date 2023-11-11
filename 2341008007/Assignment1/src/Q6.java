import java.util.Scanner;
public class Q6 {
	public static void main(String [] args)
	{
		Scanner hv = new Scanner(System.in);
		System.out.println("PLEASE ENTER YOUR NAME");
		String name = hv.nextLine();
		System.out.println("PLEASE ENTER YOUR BANK ACCOUNT NO.");
		long acc_no = hv.nextLong();
		System.out.println("PLEASE ENTER YOU ACCOUNT BALANCE");
		double balance = hv.nextDouble();
		System.out.println("My name is " + name + 
				" bearing account number " + acc_no + 
				" having balance " + balance + " only.");
	}

}
