package Programowanie_dynamiczne;

import java.util.Random;

public class A6_Odgadywanie_liczby {
    public static void main(String[] args) {
        Random rand = new Random();
        final int ZAKRES = 1000;
        int N = 0;
        int potegaDwójki = 1;

        // Znajdowanie N bez Math.log
        while (potegaDwójki < ZAKRES) {
            potegaDwójki *= 2;
            N++;
        }

        int liczba = rand.nextInt(ZAKRES + 1);
        int[][] tab = new int[3][N];
        tab[0][0] = 0;
        tab[2][0] = ZAKRES;

        for (int i = 0; i < N; i++) {
            tab[1][i] = (tab[0][i] + tab[2][i]) / 2;

            if (tab[1][i] == liczba) {
                System.out.println("Zgadłeś, liczba to " + liczba);
                break;
            } else if (tab[1][i] > liczba) {
                System.out.println(tab[1][i] + " za duża");
                if (i < N - 1) {
                    tab[0][i + 1] = tab[0][i];
                    tab[2][i + 1] = tab[1][i];
                }
            } else {
                System.out.println(tab[1][i] + " za mała");
                if (i < N - 1) {
                    tab[0][i + 1] = tab[1][i];
                    tab[2][i + 1] = tab[2][i];
                }
            }
        }
    }
}
