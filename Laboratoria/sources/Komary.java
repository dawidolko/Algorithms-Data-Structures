public class Komary {
    public static void main(String[] args) {
        double samce = 450.0;
        double samice = 550.0;
        int week = 0;
        oblicz_kiedy_wiecej_samcow(samce, samice, week);
    }

    public static void oblicz_kiedy_wiecej_samcow(double samce, double samice, int licznik_tyg) {

        if (samce >= samice){
            System.out.println("Ilość tygodni: " + licznik_tyg);
            return;
        }

        double nowe_samce = samce * 0.10 * 0.45;
        double nowe_samice = samice * 0.10 * 0.55;

        double smiertelnosc_samcow = samce * 0.02;
        double smiertelnosc_samic = samice * 0.05;

        samce = samce - smiertelnosc_samcow + nowe_samce;
        samice = samice - smiertelnosc_samic + nowe_samice;

        oblicz_kiedy_wiecej_samcow(samce, samice, licznik_tyg + 1);
    }
}
