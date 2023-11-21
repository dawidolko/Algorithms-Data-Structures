package Kolokwium1;

public class AZLody
{
    final static int N = 6;
    static int[][] czas = {{0, 7, 20, 21, 12, 23},
                           {27, 0, 13, 16, 46, 5},
                           {53, 15, 0, 25, 27, 6},
                           {16, 2, 35, 0, 47, 10},
                           {31, 29, 5, 18, 0, 4},
                           {28, 24, 1, 17, 5, 0}};
    private static final int[] uzyteLody = {0, 0, 0, 0, 0, 0}; // Ile aktualnie użyliśmy lodów
    static int minCzas = Integer.MAX_VALUE; // Najlepszy czas produkcji lodów
    static StringBuilder lodyNajlepsze = new StringBuilder(); // Najlepsza sekwencja produkcji lodów

    public static void main(String[] args)
    {
        generuj();
        wypisz();
    }

    private static void generuj()
    {
        for (int start = 0; start < N; start++)
        {
            int obecnyCzas = 0;
            int[] uzyteLody = new int[N]; // Ile aktualnie użyliśmy lodów
            StringBuilder lody = new StringBuilder(); // Aktualna sekwencja produkcji lodów

            int obecnaMaszyna = start;
            uzyteLody[obecnaMaszyna] = 1;
            lody.append(obecnaMaszyna + 1).append(", ");

            for (int i = 1; i < N; i++)
            {
                int najlepszyCzas = Integer.MAX_VALUE;
                int najlepszaMaszyna = -1;
                for (int j = 0; j < N; j++)
                {
                    if (uzyteLody[j] == 0 && czas[obecnaMaszyna][j] < najlepszyCzas)
                    {
                        najlepszyCzas = czas[obecnaMaszyna][j];
                        najlepszaMaszyna = j;
                    }
                }
                obecnyCzas += najlepszyCzas;
                obecnaMaszyna = najlepszaMaszyna;
                uzyteLody[najlepszaMaszyna] = 1;
                lody.append(najlepszaMaszyna + 1).append(", ");
            }
            obecnyCzas += czas[obecnaMaszyna][start]; // Dodanie czas powrotu do startowej maszyny

            if (obecnyCzas < minCzas)
            {
                minCzas = obecnyCzas;
                lodyNajlepsze = new StringBuilder(lody);
            }
        }
    }

    private static void wypisz()
    {
        System.out.println("Minimalny czas produkcji: " + minCzas);
        System.out.print("Użyte lody: " + lodyNajlepsze.toString());
    }
}
