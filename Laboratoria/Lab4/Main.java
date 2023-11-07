public class Main {
    public static void main(String[] args) {
        // METODA PROGRAMOWANIA DYNAMICZNEGO
        // Decyzyjny problem plecakowy

        // Definicja maksymalnej wagi plecaka.
        final int maxWeight = 10;

        // Tablice przechowujące wagi i wartości dostępnych przedmiotów.
        final int[] weights = {6, 2, 3, 2, 3, 1};
        final int[] values = {6, 4, 5, 7, 10, 2};
        
        // Obliczenie liczby przedmiotów.
        final int items = weights.length;

        // Tablica do przechowywania wyników pośrednich obliczeń dla programowania dynamicznego.
        int[][] tab = new int[items][maxWeight+1];

        // Inicjalizacja pierwszego wiersza tablicy.
        for (int i=0;i<maxWeight+1;i++) {
            if (weights[0]>i) tab[0][i] = 0; // Jeśli pierwszy przedmiot jest cięższy niż aktualna pojemność, wtedy wartość to 0.
            else tab[0][i] = values[0]; // W przeciwnym razie przyjmuje wartość pierwszego przedmiotu.
        }

        // Wypełnianie tablicy rozwiązań problemu plecakowego.
        for (int i=1;i<items;i++) {
            for (int j=0;j<maxWeight+1;j++) {
                if (weights[i]>j) 
                    tab[i][j] = tab[i-1][j]; // Jeśli przedmiot jest cięższy niż aktualna pojemność, przyjmujemy poprzedni wynik.
                else {
                    // Wybieramy maksimum z poprzedniego wyniku i sumy wartości aktualnego przedmiotu 
                    // oraz najlepszego rozwiązania dla plecaka o wadze pomniejszonej o wagę bieżącego przedmiotu.
                    tab[i][j] = Math.max(tab[i-1][j], values[i]+tab[i-1][j-weights[i]]);
                }
            }
        }

        // Wyświetlenie najlepszej możliwej wartości dla plecaka o zadanej maksymalnej wadze.
        System.out.println("Najlepsza wartość plecaka to " + tab[items-1][maxWeight] + ".");
    }
}
