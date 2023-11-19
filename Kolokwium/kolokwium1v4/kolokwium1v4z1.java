public class kolokwium1v4z1 {

    public static void main(String[] args) {
        double samce = 450.0;
        double samice = 550.0;
        int tydzien = 0;
        znajdzTydzienGdySamceZrownajaSamice(samce, samice, tydzien);
    }

    private static void znajdzTydzienGdySamceZrownajaSamice(double samce, double samice, int tydzien) {
        // Procent wzrostu dla samców i samic
        double wzrostSamcow = 0.10 * 0.45 - 0.02;
        double wzrostSamic = 0.10 * 0.55 - 0.05;

        if (wzrostSamcow <= wzrostSamic) {
            System.out.println("Nigdy liczba samców nie będzie większa od liczby samic.");
            return;
        }

        if (samce >= samice) {
            System.out.println("Po " + tydzien + " tygodniach liczba samców (" + samce +
                    ") zrówna się lub przekroczy liczbę samic (" + samice + "). Całkowita liczba komarów wyniesie: " + (samce + samice));
            return;
        }

        // Przyrost samców i samic
        double noweSamce = samce * 0.10 * 0.45;
        double noweSamice = samice * 0.10 * 0.55;

        // Śmiertelność samców i samic
        samce = (samce - samce * 0.02) + noweSamce;
        samice = (samice - samice * 0.05) + noweSamice;

        znajdzTydzienGdySamceZrownajaSamice(samce, samice, tydzien + 1);
    }
}
