package Programowanie_dynamiczne;

import java.util.Random;

public class A6_Odgadywanie_liczby {
    public static void main(String[] args) {
        // Tworzenie generatora liczb losowych
        Random rand = new Random();
        // Definiowanie zakresu liczby do odgadnięcia
        final int ZAKRES = 1000;
        // Obliczanie ilości prób potrzebnych do odgadnięcia liczby
        // (maksymalna liczba prób w metodzie podziału na pół)
        final int N = (int) Math.ceil(Math.log(ZAKRES) / Math.log(2));
        // Losowanie liczby, którą należy odgadnąć
        int liczba = rand.nextInt(ZAKRES + 1);
        // Tablica do przechowywania dolnego i górnego zakresu oraz zgadywanej wartości
        int[][] tab = new int[3][N];
        // Ustawienie początkowego dolnego zakresu na 0
        tab[0][0] = 0;
        // Ustawienie początkowego górnego zakresu na maksymalną wartość zakresu
        tab[2][0] = ZAKRES;

        // Główna pętla odgadywania liczby
        for (int i = 0; i < N; i++) {
            // Zgadywanie liczby poprzez wybranie środkowego elementu aktualnego zakresu
            tab[1][i] = (int) ((tab[0][i] + tab[2][i]) / 2);

            // Jeśli odgadnięto liczbę, wypisz wynik i zakończ program
            if (tab[1][i] == liczba) {
                System.out.println("Zgadles, liczba to " + liczba);
                break;
            }
            // Jeśli zgadywana liczba jest większa niż odgadywana, zaktualizuj zakres
            if (tab[1][i] > liczba) {
                System.out.println(tab[1][i] + " za duza");
                tab[0][i + 1] = tab[0][i]; // Dolny zakres pozostaje bez zmian
                tab[2][i + 1] = tab[1][i]; // Górny zakres jest aktualizowany na zgadywaną wartość
            }
            // Jeśli zgadywana liczba jest mniejsza niż odgadywana, zaktualizuj zakres
            if (tab[1][i] < liczba) {
                System.out.println(tab[1][i] + " za mala");
                tab[0][i + 1] = tab[1][i]; // Dolny zakres jest aktualizowany na zgadywaną wartość
                tab[2][i + 1] = tab[2][i]; // Górny zakres pozostaje bez zmian
            }
        }
    }
}
