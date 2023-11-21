package Kolokwium1;

public class DZNewton
{
    static final int N = 7;
    static final int K = 3;

    public static void main(String[] args)
    {
        System.out.println(newton(N,K));
    }

    static int newton(int n, int k)
    {
        if (k==0 || k==n) { return 1; }
        else { return newton(n-1,k-1) + newton(n-1,k); }
    }
}
