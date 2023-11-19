package Programowanie_dynamiczne;

public class Newton {

    // Oddzielna metoda do obliczania symbolu Newtona
    public static int obliczSymbolNewtona(int N, int K) {
        int[][] tab = new int[N+1][K+1];

        for(int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                if (i < j) tab[i][j] = 0;
                else if (i == j || j == 0) tab[i][j] = 1;
                else tab[i][j] = tab[i-1][j-1] + tab[i-1][j];
            }
        }

        return tab[N][K];
    }

    public static void main(String[] args) {
        final int N = 5;
        final int K = 3;

        // Wywołanie metody i wyświetlenie wyniku
        System.out.println("Wynik: "+obliczSymbolNewtona(N, K));
    }
}
