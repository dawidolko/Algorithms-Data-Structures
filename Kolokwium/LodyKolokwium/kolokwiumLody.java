import java.util.Random;

public class kolokwiumLody {
    // Główna metoda programu
    public static void main(String[] args) {
        // Wywołuje metodę, która wykonuje symulację produkcji lodów
        wykonajSymulacje();
    }

    // Metoda wykonująca symulację produkcji lodów
    private static void wykonajSymulacje() {
        // Tablica czasy przechowuje czasy przestawienia maszyny produkcyjnej między różnymi smakami lodów
        final int[][] czasy = {
            {0, 7, 20, -1, 12, 23},
            {27, 0, 13, 16, -1, 5},
            {53, -1, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, -1},
            {31, 29, -1, 18, 0, 4},
            {-1, 24, 1, 17, 5, 0}
        };

        // StringBuilder do tworzenia sekwencji smaków lodów
        StringBuilder lody;
        // StringBuilder przechowujący najlepszą sekwencję smaków lodów
        StringBuilder lodyNajlepsze = new StringBuilder();
        // Zmienna przechowująca najlepszy czas produkcji
        int czasProdukcjiNajlepszy = Integer.MAX_VALUE;
        // Obiekt klasy Random do losowania kolejności smaków
        Random random = new Random();

        // Pętla wykonująca 100 prób losowania kolejności smaków
        for (int i = 0; i < 100; i++) {
            int czasProdukcji = 0;
            // Tablica przechowująca wylosowane smaki lodów
            int[] uzyteLodyTab = new int[]{-1, -1, -1, -1, -1, -1};
            int uzyteLody = 0;
            lody = new StringBuilder();

            // Pętla losująca smaki lodów, aż wszystkie będą wykorzystane
            while (uzyteLody != 6) {
                int jakaMaszyna = random.nextInt(6);
                boolean czyMozna = true;
                for (int k = 0; k < uzyteLody; k++) {
                    if (uzyteLodyTab[k] == jakaMaszyna) {
                        czyMozna = false;
                        break;
                    }
                }
                if (czyMozna) {
                    uzyteLodyTab[uzyteLody] = jakaMaszyna;
                    lody.append(jakaMaszyna + 1).append(", ");
                    uzyteLody++;
                }
            }

            // Pętla obliczająca czas produkcji dla danej sekwencji smaków
            for (int j = 0; j < czasy.length - 1; j++) {
                if (czasy[uzyteLodyTab[j]][uzyteLodyTab[j + 1]] > 0) {
                    czasProdukcji += czasy[uzyteLodyTab[j]][uzyteLodyTab[j + 1]];
                } else {
                    czasProdukcji = Integer.MAX_VALUE;
                    break;
                }
            }

            // Sprawdzenie, czy można wrócić do pierwszego smaku
            if (czasProdukcji != Integer.MAX_VALUE && czasy[uzyteLodyTab[5]][uzyteLodyTab[0]] > 0) {
                czasProdukcji += czasy[uzyteLodyTab[5]][uzyteLodyTab[0]];
            } else {
                czasProdukcji = Integer.MAX_VALUE;
            }

            // Sprawdzenie, czy aktualna sekwencja jest najlepsza
            if (czasProdukcji < czasProdukcjiNajlepszy) {
                czasProdukcjiNajlepszy = czasProdukcji;
                lodyNajlepsze = new StringBuilder(lody);
            }
        }

        // Wyświetlenie wyników symulacji
        System.out.println("Wykorzystane lody: " + lodyNajlepsze + " i wraca do smaku jaki był na początku.");
        System.out.println("Minimalny czas produkcji: " + czasProdukcjiNajlepszy);
    }
}
