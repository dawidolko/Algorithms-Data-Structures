package Programowanie_dynamiczne;
public class A23 {

    final static int MAX = 100000;
    static int chorych = 10;
    static int zdrowych = MAX - chorych;
    static int odpornych = 0;
    static int dzien = 0;
    static int[] chorzy = new int[50];
    static int[] ozdrowialych = new int[50];

    // Metoda aktualizująca liczbę odpornych
    public static void aktualizujOdpornych(int dzien) {
        odpornych = 0; // resetujemy liczbę odpornych

        // Określamy okno czasowe dla odporności
        int start = Math.max(0, dzien - 13); // nie wcześniej niż 14 dni temu
        int koniec = Math.max(0, dzien - 6);  // ale nie później niż 7 dni temu

        for (int i = start; i < koniec; i++) {
            odpornych += ozdrowialych[i];
        }
    }

    public static int choruj(int chorych, int dzien) {
        if (dzien >= chorzy.length) { // zabezpieczenie przed wyjściem poza zakres tablicy
            return dzien;
        }

        chorzy[dzien] = chorych;
        zdrowych -= chorzy[dzien];

        if (dzien > 6) { // zaczynamy ozdrowieńców zapisywać od 7 dnia
            ozdrowialych[dzien] = chorzy[dzien - 7];
        }

        aktualizujOdpornych(dzien);

        if (zdrowych <= 0) { // zabezpieczenie przed ujemną liczbą zdrowych
            zdrowych = 0;
        }

        // Logika zarażania: każda chora osoba może zarazić do 3 zdrowych
        int nowiChorzy = (chorzy[dzien] * 3 > zdrowych) ? zdrowych : chorzy[dzien] * 3;

        // Wyświetlanie informacji o stanie epidemii
        System.out.println("Dzień: " + dzien + " Chorzy: " + chorzy[dzien] + " Zdrowi: " + zdrowych + " Odporni: " + odpornych);

        // Jeśli nie ma więcej zdrowych, to epidemia się zakończyła
        if (zdrowych == 0) {
            return dzien;
        }

        // Rekurencyjne wywołanie symulacji dla kolejnego dnia
        return choruj(nowiChorzy, dzien + 1);
    }

    public static void main(String[] args) {
        int finalDay = choruj(chorych, dzien);
        System.out.println("Epidemia zakończyła się w dniu: " + finalDay);
    }
}
