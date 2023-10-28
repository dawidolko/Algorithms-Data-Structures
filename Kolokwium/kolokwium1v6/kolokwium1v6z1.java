public class kolokwium1v6z1 {

    private static final double POPULACJA = 100000.0;
    private static final int POCZATKOWA_LICZBA_CHORYCH = 10;

    public static int liczbaDniDoPrzekroczeniaPolowy() {
        double[] chorychWDanymDniu = new double[7];
        double sumarycznaLiczbaChorych = POCZATKOWA_LICZBA_CHORYCH;
        chorychWDanymDniu[0] = POCZATKOWA_LICZBA_CHORYCH;
        int dni = 0;

        while (sumarycznaLiczbaChorych <= POPULACJA / 2) {
            dni++;
            double nowoZakazeni = chorychWDanymDniu[6] * 2;  // Tylko osoby zarażone 7 dni temu zarażają nowe osoby

            for (int i = 6; i > 0; i--) {
                chorychWDanymDniu[i] = chorychWDanymDniu[i-1];
            }

            chorychWDanymDniu[0] = nowoZakazeni;
            sumarycznaLiczbaChorych += nowoZakazeni;
        }

        return dni;
    }

    public static void main(String[] args) {
        System.out.println("Liczba dni do przekroczenia połowy populacji: " + liczbaDniDoPrzekroczeniaPolowy());
    }
}
