package Programowanie_dynamiczne;

public class Newton {
    public static void main(String[] args) {
        final int N = 5;
        final int K = 3;
        int[][] tab = new int[N+1][K+1];

        for(int i=0;i<=N;i++) {
            for (int j=0;j<=K;j++) {
                if (i<j) tab[i][j] = 0;
                else if (i==j || j==0) tab[i][j] = 1;
                else tab[i][j] = tab[i-1][j-1]+tab[i-1][j];
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println(tab[N][K]);
    }
}
