public class HQ5_I {
    public static void main(String [] args) {
        int W = 1, G = 2, K = 3, A = 4;

        int i = W;
        int j = A;
        int k = K;
        int l = G;

        W = j;
        A = k;
        K = l;
        G = i;

        System.out.println(W);
        System.out.println(A);
        System.out.println(K);
        System.out.println(G);
    }
}
