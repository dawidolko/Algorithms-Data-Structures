public class FabrykaLodow {

    // Tablica przechowująca czasy przestrojenia maszyny dla różnych smaków
    static int[][] czasyPrzestrojenia = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}
    };

    final static int LICZBA_SMAKOW = 6; // Liczba różnych smaków lodów
    private static int[] aktualnaKolejnosc = new int[LICZBA_SMAKOW];
    static String najlepszaKolejnosc = "";
    static int minimalnyCzasPrzestrojenia = Integer.MAX_VALUE;
    static String wynikowyKomunikat = "";

    public static void main(String[] args) {
        generujOptymalnaKolejnosc(0);
        System.out.println(wynikowyKomunikat);
    }

    // Funkcja rekurencyjna do generowania wszystkich permutacji kolejności smaków
    static void generujOptymalnaKolejnosc(int poziom) {
        wynikowyKomunikat = "";
        int czasDoPoczatku = 0;
        int calkowityCzas = 0;
        String kolejnosc = "";

        if (poziom == LICZBA_SMAKOW) {
            for (int j = 0; j < LICZBA_SMAKOW - 1; j++) {
                czasDoPoczatku = czasyPrzestrojenia[aktualnaKolejnosc[j + 1] - 1][aktualnaKolejnosc[0] - 1];
                calkowityCzas += czasyPrzestrojenia[aktualnaKolejnosc[j] - 1][aktualnaKolejnosc[j + 1] - 1];
            }

            for (int j = 0; j < LICZBA_SMAKOW; j++) {
                kolejnosc += aktualnaKolejnosc[j] + ", ";
            }
            kolejnosc += aktualnaKolejnosc[0];
            calkowityCzas += czasDoPoczatku;

            if (calkowityCzas < minimalnyCzasPrzestrojenia) {
                minimalnyCzasPrzestrojenia = calkowityCzas;
                najlepszaKolejnosc = kolejnosc;
            }

        } else {
            for (int j = 1; j <= LICZBA_SMAKOW; j++) {
                int k;
                for (k = 0; k < poziom; k++) {
                    if (aktualnaKolejnosc[k] == j) {
                        break;
                    }
                }
                if (k == poziom) {
                    aktualnaKolejnosc[k] = j;
                    generujOptymalnaKolejnosc(poziom + 1);
                }
            }
        }
        wynikowyKomunikat = "Najlepszy czas zrobienia wszystkich smaków to: " + minimalnyCzasPrzestrojenia + " i wychodzi na to, że najlepsza kolejność to np: " + najlepszaKolejnosc;
    }
}
