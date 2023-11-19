package Algorytm_zachlanny;

public class A19_Dijkstry {

    public static void main(String[] args) {
        final int[][] polaczenia = {
                {0, 300, 402, 356, -1, -1, -1, -1, -1},
                {300, 0, -1, -1, 440, 474, -1, -1, -1},
                {402, -1, 0, -1, -1, 330, -1, -1, -1},
                {356, -1, -1, 0, -1, -1, 823, -1, -1},
                {-1, 440, -1, -1, 0, -1, -1, 430, -1},
                {-1, 474, 330, -1, -1, 0, 813, 365, 774},
                {-1, -1, -1, 823, -1, 813, 0, -1, 403},
                {-1, -1, -1, -1, 430, 365, -1, 0, 768},
                {-1, -1, -1, -1, -1, 774, 403, 768, 0}
        };
        final String[] nazwy = {"Warszawa", "Katowice", "Zakopane", "Lwow", "Wieden", "Budapeszt", "Bukareszt", "Zagrzeb", "Sofia"};

        znajdzNajkrotszaDroge(polaczenia, nazwy, 0, 8); // Z Warszawy (0) do Sofii (8)
    }

    public static void znajdzNajkrotszaDroge(int[][] polaczenia, String[] nazwy, int start, int cel) {
        int n = polaczenia.length;
        int[] odleglosci = new int[n];
        boolean[] odwiedzone = new boolean[n];
        int[] poprzednicy = new int[n];

        // Inicjalizacja tablic
        for (int i = 0; i < n; i++) {
            odleglosci[i] = Integer.MAX_VALUE;
            odwiedzone[i] = false;
            poprzednicy[i] = -1;
        }
        odleglosci[start] = 0;

        for (int i = 0; i < n; i++) {
            int u = znajdzNajblizszy(odleglosci, odwiedzone);
            odwiedzone[u] = true;

            for (int v = 0; v < n; v++) {
                if (!odwiedzone[v] && polaczenia[u][v] > 0 && odleglosci[u] + polaczenia[u][v] < odleglosci[v]) {
                    odleglosci[v] = odleglosci[u] + polaczenia[u][v];
                    poprzednicy[v] = u;
                }
            }
        }

        wypiszTrase(odleglosci, poprzednicy, nazwy, start, cel);
    }

    private static int znajdzNajblizszy(int[] odleglosci, boolean[] odwiedzone) {
        int minOdleglosc = Integer.MAX_VALUE;
        int najblizszyIndeks = -1;

        for (int i = 0; i < odleglosci.length; i++) {
            if (!odwiedzone[i] && odleglosci[i] <= minOdleglosc) {
                minOdleglosc = odleglosci[i];
                najblizszyIndeks = i;
            }
        }
        return najblizszyIndeks;
    }

    private static void wypiszTrase(int[] odleglosci, int[] poprzednicy, String[] nazwy, int start, int cel) {
        if (odleglosci[cel] == Integer.MAX_VALUE) {
            System.out.println("Nie znaleziono drogi z " + nazwy[start] + " do " + nazwy[cel]);
            return;
        }

        System.out.println("Najkrótsza droga z " + nazwy[start] + " do " + nazwy[cel] + " wynosi " + odleglosci[cel] + " km.");

        int u = cel;
        String sciezka = nazwy[u];

        while (poprzednicy[u] != -1) {
            u = poprzednicy[u];
            sciezka = nazwy[u] + " -> " + sciezka;
        }

        System.out.println("Trasa: " + sciezka);
    }
}
