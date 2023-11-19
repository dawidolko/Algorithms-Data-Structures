public class kolokwium1v6z1 {

    final static int MAX = 100000; // Całkowita liczba osób w społeczności
    static int chorych = 10; // Początkowa liczba chorych
    static int zdrowych = MAX - chorych; // Początkowa liczba zdrowych
    static int odpornych = 0; // Początkowa liczba odpornych
    static int dzien = 0; // Licznik dni
    static int[] chorzy = new int[50]; // Tablica do śledzenia liczby zakażonych każdego dnia
    static int[] ozdrowialych = new int[50]; // Tablica do śledzenia liczby ozdrowiałych każdego dnia

    public static void symuluj() {
        for (dzien = 0; dzien < chorzy.length; dzien++) {
            chorzy[dzien] = chorych;

            if (dzien > 6) {
                ozdrowialych[dzien] = chorzy[dzien - 7];
                chorzy[dzien] -= ozdrowialych[dzien];
            }

            odpornych = 0;
            int startDay;
            if (dzien > 13) {
                startDay = dzien - 13;
            } else {
                startDay = 0;
            }

            for (int i = startDay; i <= dzien; i++) {
                odpornych = ozdrowialych[i];
            }

            chorych -= odpornych;
            zdrowych = MAX - (chorych + odpornych);

            if (chorych > MAX / 2) {
                wypiszWyniki();
                break;
            } else {
                int nowoZarazeni = (int)(0.5 * chorzy[dzien]) * 2; // 50% chorych zaraża po 2 osoby
                if (nowoZarazeni < zdrowych) {
                    chorych += nowoZarazeni;
                } else {
                    chorych += zdrowych;
                }
            }
        }
    }

    private static void wypiszWyniki() {
        System.out.println("Dzień, w którym liczba chorych przekroczyła połowę populacji: " + (dzien + 1));
        System.out.println("Liczba chorych w tym dniu: " + chorych);
    }

    public static void main(String[] args) {
        symuluj();
    }
}
