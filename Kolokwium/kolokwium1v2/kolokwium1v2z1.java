public class kolokwium1v2z1 {

    final static double poczatkowaLiczbaBakterii = 12; // Początkowa liczba bakterii

    public static void main(String[] args) {
        double doceloweZwiekszenie = 1000; // Docelowe zwiększenie liczby bakterii
        double potrzebneMinuty = obliczCzasZwiekszenia(poczatkowaLiczbaBakterii, doceloweZwiekszenie, 0);
        System.out.println("Liczba bakterii zwiększy się 1000 razy po " + potrzebneMinuty + " minutach.");
    }

    private static int obliczCzasZwiekszenia(double aktualnaLiczbaBakterii, double doceloweZwiekszenie, int minuty) {
        // Jeżeli liczba bakterii osiągnęła lub przekroczyła docelowe zwiększenie, zwróć aktualną liczbę minut
        if (aktualnaLiczbaBakterii >= poczatkowaLiczbaBakterii * doceloweZwiekszenie) {
            return minuty;
        }
        // Co 2 minuty liczba bakterii się podwaja
        aktualnaLiczbaBakterii *= 2;
        minuty += 2; // Zwiększamy licznik czasu o 2 minuty

        // Co 10 minut liczba bakterii zmniejsza się o połowę
        if (minuty % 10 == 0) {
            aktualnaLiczbaBakterii /= 2;
        }
        // Rekurencyjne wywołanie funkcji
        return obliczCzasZwiekszenia(aktualnaLiczbaBakterii, doceloweZwiekszenie, minuty);
    }
}
