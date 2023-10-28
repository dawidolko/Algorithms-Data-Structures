public class kolokwium1v5z2 {

        // Reprezentacja macierzy odległości między miastami
        private static final int BRAK = Integer.MAX_VALUE; // oznaczenie braku połączenia
        private static final int[][] odleglosci = {
                {0, 300, 402, 356, 474, BRAK, BRAK, BRAK, BRAK},
                {300, 0, BRAK, 440, 474, BRAK, BRAK, 823, BRAK},
                {402, BRAK, 0, 330, 823, BRAK, BRAK, BRAK, BRAK},
                {356, 440, 330, 0, 813, 336, BRAK, BRAK, 774},
                {474, 474, 823, 813, 0, 430, BRAK, BRAK, 68},
                {BRAK, BRAK, BRAK, 336, 430, 0, 775, 403, 768},
                {BRAK, BRAK, BRAK, BRAK, BRAK, 775, 0, BRAK, 0},
                {BRAK, 823, BRAK, BRAK, BRAK, 403, BRAK, 0, 768},
                {BRAK, BRAK, BRAK, 774, 68, 768, 0, 768, 0}
        };

        public int wyznaczDroge() {
            boolean[] odwiedzone = new boolean[odleglosci.length];
            int obecneMiasto = wybierzPoczatkoweMiasto();
            odwiedzone[obecneMiasto] = true;

            int calkowitaOdleglosc = 0;

            for (int i = 1; i < odleglosci.length; i++) {
                int najkrotszaDroga = BRAK;
                int nastepneMiasto = -1;

                for (int j = 0; j < odleglosci.length; j++) {
                    if (!odwiedzone[j] && odleglosci[obecneMiasto][j] != BRAK && odleglosci[obecneMiasto][j] < najkrotszaDroga) {
                        najkrotszaDroga = odleglosci[obecneMiasto][j];
                        nastepneMiasto = j;
                    }
                }

                if (nastepneMiasto != -1) {
                    calkowitaOdleglosc += najkrotszaDroga;
                    odwiedzone[nastepneMiasto] = true;
                    obecneMiasto = nastepneMiasto;
                }
            }
            return calkowitaOdleglosc;
        }

        private int wybierzPoczatkoweMiasto() {
            int maxPolaczen = -1;
            int miasto = -1;

            for (int i = 0; i < odleglosci.length; i++) {
                int polaczenia = 0;
                for (int j = 0; j < odleglosci[i].length; j++) {
                    if (odleglosci[i][j] != BRAK) {
                        polaczenia++;
                    }
                }

                if (polaczenia > maxPolaczen) {
                    maxPolaczen = polaczenia;
                    miasto = i;
                }
            }
            return miasto;
        }

        public static void main(String[] args) {
            kolokwium1v5z2 droga = new kolokwium1v5z2();
            System.out.println("Całkowita długość trasy: " + droga.wyznaczDroge() + " km");
        }
    }
