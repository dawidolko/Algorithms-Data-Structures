package Kolokwium1;

public class PDNewton
{
    static final int N = 7;
    static final int K = 3;

    public static void main(String[] args)
    {
        System.out.println(newton(N,K));
    }

    static int newton(int n, int k)
    {
        int[][] tab = new int[n+1][k+1];
        for(int i=0; i<=n; i++)
        {
            tab[i][0] = 1;
        }
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=k; j++)
            {
                tab[i][j]=tab[i-1][j-1]+tab[i-1][j];
            }
        }
        return tab[n][k];
    }
}
