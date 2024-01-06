import java.util.Scanner;
public class HQ5
{ public static void main(String[] args) {
        Scanner hv = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = hv.nextInt();
         String s = "";
        for (int i = 1; i <= rows; i++)
        {
        	System.out.println(s+i+s);
        	s = s + i + s;
        }
        hv.close();
    }
}

