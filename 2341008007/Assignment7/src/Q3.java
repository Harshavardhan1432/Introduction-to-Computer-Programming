
import java.util.*;
public class Q3 {
public static void main(String[]args) {
    int[] count= new int[101];
    Scanner hv = new Scanner(System.in);
    int n;
    System.out.print("Enter the integers between 1 and 100: ");
    do
    {
        n = hv.nextInt();
        count[n]++;
    } while( n !=0);
    for(int i = 1;i <= 100; i++)
    {
        if (count[1]>0)
            System.out.println(i + " occurs" + count[i]+ ((count[i] > 1)? "times.":"time."));
    }
}
}
