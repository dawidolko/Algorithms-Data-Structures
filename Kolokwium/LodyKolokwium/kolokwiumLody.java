import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class kolokwiumLody {

    // Tablica przechowująca czasy przestawień między poszczególnymi smakami.
    // Wartość -1 oznacza brak możliwości przestawienia między dwoma smakami.
    private static final int[][] CZASY = {
            {0, 7, 20, -1, 12, 23},
            {27, 0, 13, 16, -1, 5},
            {53, -1, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, -1},
            {31, 29, -1, 18, 0, 4},
            {-1, 24, 1, 17, 5, 0}
    };

    /**
     * Funkcja obliczająca całkowity czas przestawień maszyny dla danej permutacji smaków.
     * @param permutacja Lista przedstawiająca kolejność smaków.
     * @return Całkowity czas przestawień maszyny. Jeśli przestawienie między dwoma smakami jest niemożliwe, zwraca wartość Integer.MAX_VALUE.
     */
    private static int obliczCalkowityCzas(ArrayList<Integer> permutacja) {
        int czas = 0;
        for (int i = 0; i < permutacja.size() - 1; i++) {
            int obecny = permutacja.get(i);
            int nastepny = permutacja.get(i + 1);
            int przestawienie = CZASY[obecny][nastepny];
            if (przestawienie == -1) return Integer.MAX_VALUE; // Jeśli brak możliwości przestawienia, zwróć maksymalną wartość.
            czas += przestawienie;
        }
        return czas;
    }

    public static void main(String[] args) {
        ArrayList<Integer> smaki = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            smaki.add(i); // Dodajemy identyfikatory smaków do listy.
        }

        Random random = new Random();
        ArrayList<Integer> najlepszaPermutacja = null;
        int najkrotszyCzas = Integer.MAX_VALUE;

        // Wykonujemy 100000 prób, w każdej z nich losowo mieszając smaki i obliczając dla nich czas przestawienia.
        for (int i = 0; i < 100000; i++) {
            Collections.shuffle(smaki, random);
            int czas = obliczCalkowityCzas(smaki);
            if (czas < najkrotszyCzas) {
                najkrotszyCzas = czas;
                najlepszaPermutacja = new ArrayList<>(smaki); // Zapisz najlepszą dotychczas znalezioną permutację.
            }
        }

        System.out.println("Najlepsza kolejność produkcji: " + najlepszaPermutacja);
        System.out.println("Całkowity czas przestawienia: " + najkrotszyCzas);
    }
}
