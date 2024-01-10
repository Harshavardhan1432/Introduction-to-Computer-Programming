public class Q7_A {
    public static void main(String[] args) {
        for(int i = 65; i <= 69; i++)
        {
            for(int j = 65; j <= i; j++)
                System.out.print((char)i + " ");
            System.out.println();
        }
    }
}

