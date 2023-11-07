package Dziel_i_zwyciezaj;

public class A23_Przebieg_epidemii {

    final static int MAX = 100000; // Maksymalna liczba ludzi w społeczności
    static int chorych = 10; // Początkowa liczba chorych
    static int zdrowych = MAX - chorych; // Początkowa liczba zdrowych
    static int odpornych = 0; // Początkowa liczba odpornych
    static int dzien = 0; // Licznik dni
    static int[] chorzy = new int[50]; // Tablica do śledzenia liczby zakażonych każdego dnia
    static int[] ozdrowialych = new int[50]; // Tablica do śledzenia liczby ozdrowiałych każdego dnia

    public static int choruj(int chorych, int dzien) {
        chorzy[dzien] = chorych; // Zapisujemy liczbę chorych dla danego dnia
        zdrowych -= chorzy[dzien]; // Zmniejszamy liczbę zdrowych o liczbę nowo zarażonych

        // Ludzie zdrowieją po 7 dniach
        if (dzien > 6) {
            ozdrowialych[dzien] = chorzy[dzien - 7];
            chorzy[dzien] -= ozdrowialych[dzien]; // Zmniejszamy liczbę chorych o liczbę ozdrowiałych
            zdrowych += ozdrowialych[dzien]; // Zwiększamy liczbę zdrowych o liczbę ozdrowiałych
        }

        // Obliczamy liczbę aktualnie odpornych (tylko do 14 dni wstecz)
        odpornych = 0;
        int startDay = Math.max(0, dzien - 13); // Zaczynamy od obecnego dnia lub od 13 dni wcześniej
        for (int i = startDay; i <= dzien; i++) {
            odpornych += ozdrowialych[i];
        }

        // Jeżeli choroba nie może się już dalej rozprzestrzeniać, zatrzymujemy rekurencję
        if (chorzy[dzien] * 3 > zdrowych || dzien >= chorzy.length - 1) {
            System.out.println("Dzień: " + dzien + " Chorzy: " + chorych + " Zdrowi: " + zdrowych + " Odporni: " + odpornych);
            System.out.println("Populacja: " + (chorych + zdrowych + odpornych));
            System.out.println("Postęp ilości chorych:");
            for (int i = 0; i <= dzien; i++) {
                System.out.print("[" + chorzy[i] + "] ");
            }
            System.out.println();
            return dzien;
        } else {
            // Sprawdzamy, czy jest wystarczająca liczba zdrowych osób do zarażenia
            int nowoZarażeni = Math.min(chorzy[dzien] * 3, zdrowych);
            return choruj(nowoZarażeni, dzien + 1);
        }
    }

    public static void main(String[] args) {
        choruj(chorych, dzien);
    }
}
