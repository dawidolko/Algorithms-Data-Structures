package asd_lab_1;

public class A4 {
    public static void main(String[] args) {
        int k1, k2, k3, k4, k5;
        int najlepszaLiczbaKosmonautow = 6; // maksymalna liczba + 1
        String najlepszaKombinacja = "";

        for (k1 = 0; k1 <= 1; k1++)
            for (k2 = 0; k2 <= 1; k2++)
                for (k3 = 0; k3 <= 1; k3++)
                    for (k4 = 0; k4 <= 1; k4++)
                        for (k5 = 0; k5 <= 1; k5++) {
                            if (spełniaWarunki(k1, k2, k3, k4, k5)) {
                                int liczbaKosmonautow = k1 + k2 + k3 + k4 + k5;
                                if (liczbaKosmonautow < najlepszaLiczbaKosmonautow) {
                                    najlepszaLiczbaKosmonautow = liczbaKosmonautow;
                                    najlepszaKombinacja = formatujKosmonautow(k1, k2, k3, k4, k5);
                                }
                            }
                        }

        System.out.println("Najmniejsza liczba kosmonautów: " + najlepszaLiczbaKosmonautow);
        System.out.println("Kombinacja: " + najlepszaKombinacja);
    }

    public static boolean spełniaWarunki(int k1, int k2, int k3, int k4, int k5) {
        boolean warunekA = k1 == 1 || k4 == 1;
        boolean warunekB = k2 == 1 || k3 == 1 || k4 == 1;
        boolean warunekC = k3 == 1 || k5 == 1;
        boolean warunekD = k1 == 1 || k2 == 1 || k5 == 1;

        return warunekA && warunekB && warunekC && warunekD;
    }

    public static String formatujKosmonautow(int k1, int k2, int k3, int k4, int k5) {
        String wynik = "{ ";
        if (k1 == 1) wynik += "k1 ";
        if (k2 == 1) wynik += "k2 ";
        if (k3 == 1) wynik += "k3 ";
        if (k4 == 1) wynik += "k4 ";
        if (k5 == 1) wynik += "k5 ";
        wynik += "}";
        return wynik;
    }
}
