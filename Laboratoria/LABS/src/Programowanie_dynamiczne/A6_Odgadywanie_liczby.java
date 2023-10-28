package Programowanie_dynamiczne;

import java.util.Random;

public class A6_Odgadywanie_liczby {
    public static void main(String[] args) {

        Random rand = new Random();
        final int ZAKRES = 1000;
        final int N = (int) Math.ceil(Math.log(ZAKRES) / Math.log(2));
        int liczba = rand.nextInt(ZAKRES + 1);
        int[][] tab = new int[3][N];
        tab[0][0] = 0;
        tab[2][0] = ZAKRES;

        for (int i = 0; i < N; i++) {
            tab[1][i] = (int) ((tab[0][i] + tab[2][i]) / 2);

            if (tab[1][i] == liczba) {
                System.out.println("Zgadles, liczba to " + liczba);
                break;
            }
            if (tab[1][i] > liczba) {
                System.out.println(tab[1][i] + " za duza");
                tab[0][i + 1] = tab[0][i];
                tab[2][i + 1] = tab[1][i];
            }
            if (tab[1][i] < liczba) {
                System.out.println(tab[1][i] + " za mala");
                tab[0][i + 1] = tab[1][i];
                tab[2][i + 1] = tab[2][i];
            }
        }
    }
}