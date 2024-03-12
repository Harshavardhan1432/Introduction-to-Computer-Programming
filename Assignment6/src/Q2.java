public class Q2
{
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 50; i++) {
            System.out.println(getPentagonalNumber(i) + "\t");
            if (count % 10 == 0)
                System.out.println();
            count++;
        }

    }
    public static int getPentagonalNumber(int n)
    {
        return (n*(3*n-1))/2;
    }
}
