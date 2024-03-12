import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner hv = new Scanner (System.in);
		System.out.println("Please enter the basic salary of the employee");
		double salary = hv.nextDouble();
		double da = (salary * 40)/100;
		double hra = (salary * 20)/100;
		double gross = salary + (da + hra);
		System.out.println("Basic Salary : " + salary);
		System.out.println("Dearness Allowance : " + da);
		System.out.println("House Rent Allowance : " + hra);
		System.out.println("Gross Salary : " + gross );
	}

}
