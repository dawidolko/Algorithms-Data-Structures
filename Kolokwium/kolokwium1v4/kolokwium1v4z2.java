public class kolokwium1v4z2 {

    private static final int[] NOMINALY = {1, 2, 5, 10, 20, 50, 100, 200, 500};  // Nominały od najmniejszego do największego
    private static final int[] LICZBA_DOSTEPNYCH_MONET = {5, 3, 4, 1, 0, 7, 0, 1, 3};  // Dostępność monet dla każdego nominału

    public static void wydajReszte(int zlote, int grosze) {
        int pozostalaKwota = zlote * 100 + grosze;  // przeliczamy na grosze

        for (int i = NOMINALY.length - 1; i >= 0; i--) {
            int liczbaMonetDoWydania = 0;
            while (pozostalaKwota >= NOMINALY[i] && LICZBA_DOSTEPNYCH_MONET[i] > 0) {
                pozostalaKwota -= NOMINALY[i];
                LICZBA_DOSTEPNYCH_MONET[i]--;
                liczbaMonetDoWydania++;
            }

            if (liczbaMonetDoWydania > 0) {
                System.out.println("Nominał: " + NOMINALY[i]/100.0 + "zł, Liczba monet: " + liczbaMonetDoWydania);
            }
        }

        if (pozostalaKwota > 0) {
            System.out.println("Nie można wydać dokładnej reszty. Zostało: " + pozostalaKwota/100.0 + "zł");
        }
    }

    public static void main(String[] args) {
        int resztaZlote = 9;  // przykładowa ilość złotych
        int resztaGrosze = 28; // przykładowa ilość groszy
        System.out.println("Wydawanie reszty dla kwoty: " + resztaZlote + "zł " + resztaGrosze + "gr");
        wydajReszte(resztaZlote, resztaGrosze);
    }
}
