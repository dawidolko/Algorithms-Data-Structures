package asd_lab_2;

public class PermutacjeLODY {

    final static int N = 6;
    private static int[] l = new int[N];

    static int[][] czas = {{0, 7, 20, 21, 12, 23}, 
                          {27, 0, 13, 16, 46, 5}, 
                          {53, 15, 0, 25, 27, 6}, 
                          {16, 2, 35, 0, 47, 10}, 
                          {31, 29, 5, 18, 0, 4}, 
                          {28, 24, 1, 17, 5, 0}};

    static int minCzas = Integer.MAX_VALUE;
    static String lody = "";

    static void permutacje(int i) {
        if (i == N) {
            String aktLody = "";
            int aktCzas = 0;
            for (int j = 0; j < N; j++) { // przejscie przez cala zbudowana sekwencje smakow (permutacje)
                aktLody += (l[j] + 1) + ", "; // dopisywanie numerow smakow do rozwiazania
                if(j < N-1) // przejsc miedzy smakami bedzie o 1 mniej niz wszystkich smakow (z ostatniego smaku w permutacji nie ma juz przejscia)
                    aktCzas += czas[l[j]][l[j + 1]]; // doliczanie czasu przejscia ze smaku j na smak j+1
            }
            // powrot na smak startowy
            aktCzas += czas[l[N - 1]][l[0]]; // doliczenie czasu powrotu na smak rozpoczynajacy sekwencje
            aktLody += (l[0] + 1); // dolaczenie numeru smaku rozpoczynajacego sekwencje na koniec
            // wypisanie aktualnego rozwiazania
            System.out.println("LODY: " + aktLody + " CZAS: " + aktCzas);
            // wybor najlepszego rozwiazania (podmiana na biezaco)
            if (aktCzas < minCzas) {
                minCzas = aktCzas;
                lody = aktLody;
            }
        } else {
            for (int j = 0; j < N; j++) {
                int k;
                for (k = 0; k < i; k++) {
                    if (l[k] == j) {
                        break;
                    }
                }

                if (k == i) {
                    l[k] = j;
                    permutacje(i + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        permutacje(0);
        System.out.println(">> BEST:\n\tCzas: " + minCzas + "\tsekwencja: " + lody);
    }
}
