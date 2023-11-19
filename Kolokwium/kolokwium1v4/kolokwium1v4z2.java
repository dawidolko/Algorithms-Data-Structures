public class kolokwium1v4z2 {

        // Nominały monet
        private static final int[] NOMINALY = {1, 2, 5, 10, 20, 50, 100, 200, 500};  // w groszach
        private static final int[] ILOSCI = {5, 3, 4, 1, 0, 7, 0, 1, 3};  // dostępne ilości monet

        public static void wydajReszte(double kwota) {
            int reszta = (int) (kwota * 100);  // przeliczenie na grosze
            int[] wydaneMonety = new int[NOMINALY.length];

            for (int i = 0; i < NOMINALY.length; i++) {
                while (reszta >= NOMINALY[i] && ILOSCI[i] > 0) {
                    reszta -= NOMINALY[i];
                    wydaneMonety[i]++;
                    ILOSCI[i]--;
                }
            }

            if (reszta > 0) {
                System.out.println("Nie można wydać dokładnej reszty.");
            } else {
                for (int i = 0; i < NOMINALY.length; i++) {
                    if (wydaneMonety[i] > 0) {
                        System.out.println("Nominał " + (double) NOMINALY[i] / 100 + "zł: " + wydaneMonety[i] + " szt.");
                    }
                }
            }
        }

        public static void main(String[] args) {
            wydajReszte(9.28);
        }
    }
