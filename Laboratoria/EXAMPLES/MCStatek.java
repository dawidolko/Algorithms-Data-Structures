package Kolokwium1;

import java.util.Random;

public class MCStatek
{
    private final static int SPECJALIZACJE = 4; // Liczba specjalizacji
    private final static int KOSMONAUCI = 5; // Liczba kosmonautów
    private final static int[][] kosmonauci = {{1, 0, 0, 1, 0}, // A
                                               {0, 1, 1, 1, 0}, // B
                                               {0, 0, 1, 0, 1}, // C
                                               {1, 1, 0, 0, 1}}; // D
    private static int[] uzyteSpecjalizacje = {0, 0, 0, 0}; // Ile aktualnie użyliśmy specjalizacji
    private static int[] uzyciKosmonauci = {0, 0, 0, 0, 0}; // Ile aktualnie użyliśmy kosmonautów
    private static int liczbaKosmonautow = 0; // Aktualny schemat liczby kosmonautów
    private static int liczbaKosmonautowNajlepsza = Integer.MAX_VALUE; // Najlepszy schemat liczby kosmonautów
    private static StringBuilder kosmonauciSlownie = new StringBuilder(); // Aktualna sekwencja kosmonautów
    private static StringBuilder kosmonauciSlownieNajlepsze = new StringBuilder(); // Najlepsza sekwencja kosmonautów

    public static void main(String[] args)
    {
        for(int losuj = 0; losuj <= 100; losuj++) // Liczba losowań kosmonautów
        {
            losowanie();
            sprawdz();
            resetowanie();
        }
        wypisz();
    }

    private static void losowanie()
    {
        Random random = new Random();
        int ileUzytych = 0;
        while (ileUzytych != SPECJALIZACJE)
        {
            int kosmonaut = random.nextInt(KOSMONAUCI);
            if(uzyciKosmonauci[kosmonaut] == 0)
            {
                uzyciKosmonauci[kosmonaut] = 1;
                for(int i = 0; i < SPECJALIZACJE; i++)
                    { if(kosmonauci[i][kosmonaut] != 0) { uzyteSpecjalizacje[i] = 1; } }
                liczbaKosmonautow += 1;
                kosmonauciSlownie.append("k").append(kosmonaut).append(", ");
            }
            ileUzytych = 0;
            for(int i : uzyteSpecjalizacje) { if(i != 0) ileUzytych++; }
        }
    }

    private static void sprawdz()
    {
        if(liczbaKosmonautow <= liczbaKosmonautowNajlepsza)
        {
            liczbaKosmonautowNajlepsza = liczbaKosmonautow;
            kosmonauciSlownieNajlepsze = kosmonauciSlownie;
        }
    }
    private static void resetowanie()
    {
        uzyteSpecjalizacje = new int[]{0, 0, 0, 0};
        uzyciKosmonauci = new int[]{0, 0, 0, 0, 0};
        liczbaKosmonautow = 0;
        kosmonauciSlownie = new StringBuilder();
    }
    private static void wypisz()
    {
        System.out.println("Liczba kosmonautów: " + liczbaKosmonautowNajlepsza);
        System.out.println("Użyci kosmonauci: " + kosmonauciSlownieNajlepsze);
    }
}
