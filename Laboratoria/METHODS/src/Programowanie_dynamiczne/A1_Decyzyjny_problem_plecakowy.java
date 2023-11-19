package Programowanie_dynamiczne;

public class A1_Decyzyjny_problem_plecakowy {
    public static void main(String[] args) {
        // Objętości poszczególnych przedmiotów
        final int[] objetosci = {6, 2, 3, 2, 3, 1};
        // Wartości poszczególnych przedmiotów
        final int[] wartosci = {6, 4, 5, 7, 10, 2};
        // Maksymalna objętość plecaka
        final int MAX = 10;
        // Ilość dostępnych przedmiotów
        final int przedmioty = objetosci.length;
        // Tablica do przechowywania maksymalnych wartości dla danych objętości plecaka
        int[][] tab = new int[przedmioty][MAX + 1];

        for (int i = 0; i < przedmioty; i++) {
            for (int j = 0; j <= MAX; j++) {
                if (i == 0 && objetosci[i] > j) {
                    // Jeśli to pierwszy przedmiot i nie mieści się w plecaku
                    tab[i][j] = 0;
                } else if (i == 0) {
                    // Jeśli to pierwszy przedmiot i mieści się w plecaku
                    tab[i][j] = wartosci[i];
                } else if (objetosci[i] > j) {
                    // Jeśli przedmiot nie mieści się w plecaku
                    tab[i][j] = tab[i - 1][j];
                } else {
                    // Obliczanie wartości plecaka bez dodania tego przedmiotu
                    int bezPrzedmiotu = tab[i - 1][j];
                    // Obliczanie wartości plecaka z dodaniem tego przedmiotu
                    int zPrzedmiotem = wartosci[i] + tab[i - 1][j - objetosci[i]];
                    // Porównanie tych dwóch wartości i wybór większej
                    if (bezPrzedmiotu > zPrzedmiotem) {
                        tab[i][j] = bezPrzedmiotu;
                    } else {
                        tab[i][j] = zPrzedmiotem;
                    }
                }
            }
        }

        System.out.println(tab[przedmioty - 1][MAX]);
    }
}
