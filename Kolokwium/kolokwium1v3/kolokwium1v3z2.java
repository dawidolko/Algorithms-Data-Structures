// kolokwium1v3z2
public class kolokwium1v3z2 {

        private static final int[] NOMINALY = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        private static final int[] LICZBA_DOSTEPNYCH_MONET = {30, 7, 4, 1, 4, 1, 1, 0, 7};

        public static void wydajReszte(double kwota) {
            int pozostalaKwota = (int) (kwota * 100);  // przeliczamy na grosze

            for (int i = NOMINALY.length - 1; i >= 0; i--) {
                if (NOMINALY[i] <= pozostalaKwota && LICZBA_DOSTEPNYCH_MONET[i] > 0) {
                    int liczbaMonet = Math.min(pozostalaKwota / NOMINALY[i], LICZBA_DOSTEPNYCH_MONET[i]);
                    pozostalaKwota -= liczbaMonet * NOMINALY[i];

                    System.out.println("Nominał: " + (double) NOMINALY[i] / 100 + "zł, Liczba monet: " + liczbaMonet);
                }
            }

            if (pozostalaKwota > 0) {
                System.out.println("Nie można wydać dokładnej reszty.");
            }
        }

        public static void main(String[] args) {
            double reszta = 7.53;  // przykładowa kwota
            System.out.println("Wydawanie reszty dla kwoty: " + reszta + "zł");
            wydajReszte(reszta);
        }
    }