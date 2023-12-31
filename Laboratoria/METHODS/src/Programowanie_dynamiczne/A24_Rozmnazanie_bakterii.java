package Programowanie_dynamiczne;

public class A24_Rozmnazanie_bakterii {
    public static void main(String[] args) {
        // Ustalenie maksymalnej wartości liczby bakterii.
        final int max = 1000000;
        // Obliczenie wymaganej długości tablicy na podstawie logarytmu binarnego maksymalnej wartości.
        int N = (int)Math.ceil((Math.log(max)/Math.log(2))+1);
        // Inicjalizacja tablicy do przechowywania liczby bakterii w kolejnych etapach rozmnażania.
        int[] tab = new int[N];

        // Flagi do zaznaczania, czy osiągnięto określony próg liczby bakterii.
        boolean tysiac = false, dziesiecysiecy = false, stotysiecy = false, milion = false;

        // Pętla wypełniająca tablicę i sprawdzająca progi.
        for (int i = 0; i < N; i++) {
            // Pierwsza bakteria, od której zaczyna się rozmnażanie.
            if (i == 0) tab[i] = 1;
                // Każda kolejna komórka tablicy to podwojenie liczby bakterii z poprzedniej komórki.
            else tab[i] = 2 * tab[i - 1];

            if (!tysiac && tab[i] > 1000) {
                System.out.println("Tysiąc razy: po " + (i * 2) + " minutach");
                tysiac = true;
            }

            if (!dziesiecysiecy && tab[i] > 10000) {
                System.out.println("Dziesięć tysięcy razy: po " + (i * 2) + " minutach");
                dziesiecysiecy = true;
            }

            if (!stotysiecy && tab[i] > 100000) {
                System.out.println("Sto tysięcy razy: po " + (i * 2) + " minutach");
                stotysiecy = true;
            }

            if (!milion && tab[i] > max) {
                System.out.println("Milion razy: po " + (i * 2) + " minutach");
                milion = true;
            }
        }
    }
}
