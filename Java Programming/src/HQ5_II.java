public class HQ5_II
{
        public static void main(String[] args) {
            int W = 10, G = 20, K = 30, A = 40;

            W = W + A;
            A = W - A;
            W = W - A;

            K = K + W;
            W = K - W;
            K = K - W;

            W = W + G;
            G = W - G;
            W = W - G;

            System.out.println("Values Are Swapping the Values Are: ");
            System.out.println(W);
            System.out.println(G);
            System.out.println(K);
            System.out.println(A);
        }
}