package Kolokwium1;

import java.util.Random;

public class MCLody
{
    final static int N = 6;
    static int[][] czas = {{0, 7, 20, 21, 12, 23},
                           {27, 0, 13, 16, 46, 5},
                           {53, 15, 0, 25, 27, 6},
                           {16, 2, 35, 0, 47, 10},
                           {31, 29, 5, 18, 0, 4},
                           {28, 24, 1, 17, 5, 0}};
    private static int[] uzyteLody = {0, 0, 0, 0, 0, 0}; // Ile aktualnie użyliśmy lodów
    private static int[] listaLodow = new int[N]; // Aktualny schemat produkcji lodów
    private static int[] listaLodowNajlepsza = new int[N]; // Najlepszy Schemat produkcji lodów
    static int minCzas; // Aktualny czas produkcji lodów
    static int minCzasNajlepszy = Integer.MAX_VALUE; // Najlepszy czas produkcji lodów
    static StringBuilder lody = new StringBuilder(); // Aktualna sekwencja produkcji lodów
    static StringBuilder lodyNajlepsze = new StringBuilder(); // Najlepsza sekwencja produkcji lodów

    public static void main(String[] args)
    {
        for(int losuj = 0; losuj < 100; losuj++) // Liczba losowań
        {
            produkcja();
            sprawdz();
            resetowanie();
        }
        wypisz();
    }

    private static void produkcja()
    {
        Random random = new Random();
        int ileLodow = 0;
        while (ileLodow != 6)
        {
            int maszyna = random.nextInt(6);
            if(uzyteLody[maszyna] == 0)
            {
                lody.append("p").append(maszyna).append(", ");
                uzyteLody[maszyna] = 1;
                listaLodow[ileLodow] = maszyna;
            }
            ileLodow = 0;
            for(int i : uzyteLody) { ileLodow += i; }
        }

        for(int i = 0; i < listaLodow.length - 1; i++) { minCzas += czas[listaLodow[i]][listaLodow[i + 1]]; }
        minCzas += czas[listaLodow[5]][listaLodow[0]];
    }

    private static void sprawdz()
    {
        if(minCzas <= minCzasNajlepszy)
        {
            minCzasNajlepszy = minCzas;
            lodyNajlepsze = lody;
            listaLodowNajlepsza = listaLodow;
        }
    }

    private static void resetowanie()
    {
        lody = new StringBuilder();
        minCzas = 0;
        listaLodow = new int[N];
        uzyteLody = new int[]{0, 0, 0, 0, 0, 0};
    }

    private static void wypisz()
    {
        System.out.println("Minimalny czas produkcji: " + minCzasNajlepszy);
        System.out.print("Użyte lody: ");
        for(int i : listaLodowNajlepsza) { System.out.print((i + 1) + ", "); }
        System.out.println(listaLodowNajlepsza[0] + 1);
    }
}
