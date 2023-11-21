package Kolokwium1;

public class AZStatek
{
    private final static int SPECJALIZACJE = 4; // Liczba specjalizacji
    private final static int KOSMONAUCI = 5; // Liczba kosmonautów
    private final static int[][] kosmonauci = {{1, 0, 0, 1, 0}, // A
                                               {0, 1, 1, 1, 0}, // B
                                               {0, 0, 1, 0, 1}, // C
                                               {1, 1, 0, 0, 1}}; // D
    private static int liczbaKosmonautow = 0; // Najlepszy schemat liczby kosmonautów
    private static final StringBuilder kosmonauciSlownie = new StringBuilder(); // Najlepsza sekwencja kosmonautów

    public static void main(String[] args)
    {
        generuj();
        wypisz();
    }

    private static void generuj()
    {
        int[] uzyteSpecjalizacje = new int[SPECJALIZACJE];
        int[] uzyciKosmonauci = new int[KOSMONAUCI];

        int ileUzytych = 0;
        while (ileUzytych != SPECJALIZACJE)
        {
            int najlepszyKosmonauta = -1;
            int maxSpec = -1;
            for (int kosmonauta = 0; kosmonauta < KOSMONAUCI; kosmonauta++)
            {
                if (uzyciKosmonauci[kosmonauta] == 0)
                {
                    int spec = liczSpecjalizacje(kosmonauta, uzyteSpecjalizacje);
                    if (spec > maxSpec)
                    {
                        najlepszyKosmonauta = kosmonauta;
                        maxSpec = spec;
                    }
                }
            }
            if (najlepszyKosmonauta != -1)
            {
                uzyciKosmonauci[najlepszyKosmonauta] = 1;
                for (int i = 0; i < SPECJALIZACJE; i++)
                {
                    if (kosmonauci[i][najlepszyKosmonauta] != 0)
                    {
                        uzyteSpecjalizacje[i] = 1;
                    }
                }
                liczbaKosmonautow++;
                kosmonauciSlownie.append("k").append(najlepszyKosmonauta).append(", ");
            }

            ileUzytych = 0;
            for (int i : uzyteSpecjalizacje) { if (i != 0) ileUzytych++; }
        }
    }

    private static int liczSpecjalizacje(int kosmonauta, int[] uzyteSpecjalizacje)
    {
        int liczba = 0;
        for (int i = 0; i < SPECJALIZACJE; i++)
        {
            if (kosmonauci[i][kosmonauta] == 1 && uzyteSpecjalizacje[i] == 0)
            {
                liczba++;
            }
        }
        return liczba;
    }

    private static void wypisz()
    {
        System.out.println("Liczba kosmonautów: " + liczbaKosmonautow);
        System.out.println("Użyci kosmonauci: " + kosmonauciSlownie);
    }
}
