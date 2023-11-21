package Kolokwium1;

public class PDPlecak
{
    final static int N = 6;                 // Liczba przedmiotów
    final static int MAX_V = 10;            // Objętość plecaka
    final static int[] VI = {6,2,3,2,3,1};  // Objętości przedmiotów
    final static int[] WI = {6,4,5,7,10,2}; // Wartości przedmiotów

    public static void main(String[] args)
    {
        int wartoscPlecaka = plecak();
        System.out.println("Wartość plecaka: " + wartoscPlecaka);
    }

    public static int plecak()
    {
        int [][] tab = new int[N][MAX_V + 1]; // Dla objętości: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 (kolumny)
        // oraz dla przedmiotów: 0, 1, 2, 3, 4, 5 (wiersze)

        for (int v = 0; v <= MAX_V; v++) // Wypełnianie pierwszego wiersza
        {
            if (v < VI[0]) { tab[0][v] = 0; }
            else { tab[0][v] = WI[0]; }
        }

        for (int w = 1; w < N; w++) // Wypełnianie pozostałych wierszy
        {
            for (int k = 0; k <= MAX_V; k++) // Wypełnianie pozostałych kolumn
            {
                if (k < VI[w]) { tab[w][k] = tab[w-1][k]; }
                else
                {
                    int p1 = tab[w-1][k];
                    int p2 = WI[w] + tab[w-1][k - VI[w]];
                    tab[w][k] = Math.max(p1, p2);
                }
            }
        }

        return tab[N - 1][MAX_V];
    }
}
