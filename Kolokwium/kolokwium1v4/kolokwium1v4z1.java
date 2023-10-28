public class kolokwium1v4z1 {

    private static final double POCZATKOWA_LICZBA_SAMCOW = 550;
    private static final double POCZATKOWA_LICZBA_SAMIC = 450;
    private static final double PRZYROST = 0.1;
    private static final double SMIERTELNOSC_SAMCOW = 0.02;
    private static final double SMIERTELNOSC_SAMIC = 0.05;

    public double[] liczbaKomarowPoTygodniach(double samce, double samice, int tygodnie) {
        if (tygodnie == 1) {
            double noweSamice = (samce + samice) * PRZYROST * 0.45;
            double noweSamce = (samce + samice) * PRZYROST * 0.55;
            samce = samce + noweSamce - (samce * SMIERTELNOSC_SAMCOW);
            samice = samice + noweSamice - (samice * SMIERTELNOSC_SAMIC);
            return new double[] {samce, samice};
        }

        double[] polowa = liczbaKomarowPoTygodniach(samce, samice, tygodnie / 2);
        return liczbaKomarowPoTygodniach(polowa[0], polowa[1], tygodnie - tygodnie / 2);
    }

    public static void main(String[] args) {
        kolokwium1v4z1 komary = new kolokwium1v4z1();
        double samce = POCZATKOWA_LICZBA_SAMCOW;
        double samice = POCZATKOWA_LICZBA_SAMIC;
        int tygodnie = 1000;
        for (int i = 1; i <= tygodnie; i++) {
            double[] wynik = komary.liczbaKomarowPoTygodniach(samce, samice, i);
            samce = wynik[0];
            samice = wynik[1];
            if (samce >= samice) {
                System.out.println("Po " + i + " tygodniach liczba samców (" + wynik[0] +
                        ") przekroczyła liczbę samic (" + wynik[1] + ").");
                return;
            }
        }
        System.out.println("Po 1000 tygodniach liczba samców nie przekroczyła liczby samic.");
    }
}
