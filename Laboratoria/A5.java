package asd_lab_1;

public class A5 {

    // Dwuwymiarowa tablica reprezentująca czasy przestrojenia pomiędzy maszynami.
    private static int[][] czasy = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}
    };

    // Tablica określająca, które maszyny zostały już odwiedzone w danym momencie algorytmu.
    private static boolean[] odwiedzone = new boolean[6];

    // Aktualna trasa/kolejność maszyn.
    private static int[] trasa = new int[7];

    // Najlepsza (optymalna) trasa/kolejność maszyn.
    private static int[] optymalnaKolejnosc = new int[7];

    // Aktualnie znaleziony najkrótszy czas przestrojenia.
    private static int minCzas = Integer.MAX_VALUE;

    public static void main(String[] args) {
        trasa[0] = 0;
        trasa[6] = 0;

        // Rozpoczęcie procedury szukania optymalnej trasy.
        szukaj(1);

        System.out.println("Minimalny czas przestrojenia: " + minCzas);
        System.out.print("Najlepsza kolejność: 1 ");
        for (int i = 1; i <= 6; i++) {
            System.out.print((optymalnaKolejnosc[i] + 1) + " ");
        }
    }

    // Metoda przeszukiwania z nawrotami do znalezienia optymalnej trasy.
    private static void szukaj(int krok) {
        if (krok == 6) {
            int czas = 0;

            // Obliczanie kosztu dla danej trasy.
            for (int i = 0; i < 6; i++) {
                czas += czasy[trasa[i]][trasa[i + 1]];
                System.out.println("Czas elementu po zsumowaniu z elementu[" + i + "][" + (i + 1) + "]: " + czas);
            }

            // Jeśli obliczony czas jest mniejszy niż minCzas, aktualizujemy wartość minCzas oraz kopjujemy aktualną trasę jako optymalną.
            if (czas < minCzas) {
                minCzas = czas;
                System.arraycopy(trasa, 0, optymalnaKolejnosc, 0, 7);
            }

            // Wyświetlanie informacji o sprawdzanej trasie oraz jej czasie.
            System.out.print("\nSprawdzana kolejność: 1 ");
            for (int i = 1; i < 6; i++) {
                System.out.print((trasa[i] + 1) + " ");
            }
            System.out.println(", Czas: " + czas + "\n");
            return;
        }

        // Iteracja przez wszystkie maszyny, próbując każdej kombinacji.
        for (int i = 1; i < 6; i++) {
            // Jeśli maszyna nie była jeszcze odwiedzona, dodajemy ją do trasy i oznaczamy jako odwiedzoną.
            if (!odwiedzone[i]) {
                System.out.printf("Jakie aktualnie elementy są zamienione do liczenia: [" + i + "] [" + (i + 1) + "]\n");
                trasa[krok] = i;
                odwiedzone[i] = true;

                // Rekursywnie wywołujemy metodę szukaj() dla następnego kroku.
                szukaj(krok + 1);

                // Po powrocie z rekursji, oznaczamy maszynę jako nieodwiedzoną, co pozwala na przeszukiwanie innych tras.
                odwiedzone[i] = false;
            }
        }
    }
}
