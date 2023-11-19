package Algorytm_zachlanny;

    public class A5_Produkcja_lodow {

            final static int N = 6;
            private static int[] l = new int[N];
            private static boolean[] odwiedzone = new boolean[N];

            static int[][] czas = {{0, 7, 20, 21, 12, 23},
                    {27, 0, 13, 16, 46, 5},
                    {53, 15, 0, 25, 27, 6},
                    {16, 2, 35, 0, 47, 10},
                    {31, 29, 5, 18, 0, 4},
                    {28, 24, 1, 17, 5, 0}};

            static int minCzas = Integer.MAX_VALUE;
            static String lody = "";

            static void permutacjeZachlannie() {
                int aktCzas = 0;
                String aktLody = "";
                int obecnySmak = 0; // Zacznij od pierwszego smaku

                for (int i = 0; i < N; i++) {
                    int najkrótszyCzas = Integer.MAX_VALUE;
                    int wybranySmak = -1;
                    l[i] = obecnySmak;
                    odwiedzone[obecnySmak] = true;
                    aktLody += (obecnySmak + 1) + ", ";

                    for (int j = 0; j < N; j++) {
                        if (!odwiedzone[j] && czas[obecnySmak][j] < najkrótszyCzas) {
                            najkrótszyCzas = czas[obecnySmak][j];
                            wybranySmak = j;
                        }
                    }

                    if (wybranySmak != -1) {
                        aktCzas += najkrótszyCzas;
                        obecnySmak = wybranySmak;
                    }
                }
                aktCzas += czas[obecnySmak][l[0]]; // Powrót do smaku startowego
                aktLody += (l[0] + 1);

                if (aktCzas < minCzas) {
                    minCzas = aktCzas;
                    lody = aktLody;
                }

                System.out.println("LODY: " + aktLody + " CZAS: " + aktCzas);
            }

            public static void main(String[] args) {
                permutacjeZachlannie();
                System.out.println(">> BEST:\n\tCzas: " + minCzas + "\tsekwencja: " + lody);
            }
        }
