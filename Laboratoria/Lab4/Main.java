public class Main {
    public static void main(String[] args) {
        // Metoda programowania dynamicznego
        // Decyzyjny problem plecakowy

        // Definicja maksymalnej wagi plecaka.
        final int maksymalnaWaga = 10;

        // Tablice przechowujące wagi i wartości dostępnych przedmiotów.
        final int[] wagi = {6, 2, 3, 2, 3, 1};
        final int[] wartości = {6, 4, 5, 7, 10, 2};

        // Obliczenie liczby przedmiotów.
        final int ilośćPrzedmiotów = wagi.length;

        // Tablica do przechowywania wyników pośrednich obliczeń dla programowania dynamicznego.
        int[][] tablica = new int[ilośćPrzedmiotów][maksymalnaWaga + 1];

        // Inicjalizacja pierwszego wiersza tablicy.
        for (int i = 0; i < maksymalnaWaga + 1; i++) {
            if (wagi[0] > i) {
                tablica[0][i] = 0; // Jeśli pierwszy przedmiot jest cięższy niż aktualna pojemność, wtedy wartość to 0.
            } else {
                tablica[0][i] = wartości[0]; // W przeciwnym razie przyjmuje wartość pierwszego przedmiotu.
            }
        }

        // Wypełnianie tablicy rozwiązań problemu plecakowego.
        for (int i = 1; i < ilośćPrzedmiotów; i++) {
            for (int j = 0; j < maksymalnaWaga + 1; j++) {
                if (wagi[i] > j) {
                    tablica[i][j] = tablica[i - 1][j]; // Jeśli przedmiot jest cięższy niż aktualna pojemność, przyjmujemy poprzedni wynik.
                } else {
                    int bezAktualnegoPrzedmiotu = tablica[i - 1][j];
                    int zAktualnymPrzedmiotem = wartości[i] + tablica[i - 1][j - wagi[i]];
                    
                    if (zAktualnymPrzedmiotem > bezAktualnegoPrzedmiotu) {
                        tablica[i][j] = zAktualnymPrzedmiotem; // Wybieramy większą wartość.
                    } else {
                        tablica[i][j] = bezAktualnegoPrzedmiotu;
                    }
                }
            }
        }

        // Wyświetlenie najlepszej możliwej wartości dla plecaka o zadanej maksymalnej wadze.
        System.out.println("Najlepsza wartość plecaka to " + tablica[ilośćPrzedmiotów - 1][maksymalnaWaga] + ".");
    }
}
