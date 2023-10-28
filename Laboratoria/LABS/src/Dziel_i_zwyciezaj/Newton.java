package Dziel_i_zwyciezaj;

public class Newton {
    public static int newton(int n, int k) {
        if (k==n || k==0) return 1;

        return newton(n-1, k-1) + newton(n-1, k);
    }

    public static void main(String[] args) {
        final int n = 10;
        final int k = 3;

        System.out.println(newton(5, 3));
    }
}
