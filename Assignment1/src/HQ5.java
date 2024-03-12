public class HQ5_II
{
        public static void main(String[] args) {
            int W = 1, G = 2, K = 3, A = 4;

            W = W + G;
            G = W - G;
            W = W - G;

            G = G + K;
            K = G - K;
            G = G - K;

            K = K + A;
            A = K - A;
            K = K - A;

            System.out.println(W);
            System.out.println(G);
            System.out.println(K);
            System.out.println(A);
        }
}
