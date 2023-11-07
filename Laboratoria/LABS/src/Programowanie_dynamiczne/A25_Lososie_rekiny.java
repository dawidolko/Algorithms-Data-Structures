package Programowanie_dynamiczne;

public class A25_Lososie_rekiny {
    public static void main(String[] args) {
        int lososie = 1000000; // początkowa liczba łososi
        int[] tab = new int[7361]; // tablica do przechowywania liczby łososi na każdą minutę symulacji
        // Flagi do zaznaczania, czy określone progi liczby łososi zostały osiągnięte
        boolean dwa = false, // flaga dla połowy populacji
                trzy = false, // flaga dla jednej trzeciej populacji
                dziesiec = false, // flaga dla jednej dziesiątej populacji
                sto = false; // flaga dla jednej setnej populacji

        // Pętla symulująca zmianę liczby łososi w czasie
        for (int i = 0; i < tab.length; i++) {
            // Ustawienie wartości początkowej populacji łososi
            if (i == 0) tab[i] = lososie;
            else {
                // Obliczenie nowej liczby łososi z uwzględnieniem wzrostu naturalnego i strat przez rekinów
                tab[i] = (int) ((tab[i - 1] * Math.exp(0.003) * 0.998) * 0.998);
            }

            // Sprawdzenie, czy liczba łososi spadła poniżej połowy początkowej wartości
            if (!dwa && tab[i] < lososie / 2) {
                System.out.println("Polowa: po " + i + " minutach");
                dwa = true; // aktualizacja flagi
            }
            // Sprawdzenie, czy liczba łososi spadła poniżej jednej trzeciej początkowej wartości
            if (!trzy && tab[i] < lososie / 3) {
                System.out.println("Jedna trzecia: po " + i + " minutach");
                trzy = true; // aktualizacja flagi
            }
            // Sprawdzenie, czy liczba łososi spadła poniżej jednej dziesiątej początkowej wartości
            if (!dziesiec && tab[i] < lososie / 10) {
                System.out.println("Jedna dziesiata: po " + i + " minutach");
                dziesiec = true; // aktualizacja flagi
            }
            // Sprawdzenie, czy liczba łososi spadła poniżej jednej setnej początkowej wartości
            if (!sto && tab[i] < lososie / 100) {
                System.out.println("Jedna setna: po " + i + " minutach");
                sto = true; // aktualizacja flagi
            }
            // Jeżeli liczba łososi spadnie poniżej 100, zakończ symulację
            if (tab[i] < 100) {
                System.out.println("Wymrze: po " + i + " minutach");
                break; // wyjście z pętli
            }
        }
    }
}
