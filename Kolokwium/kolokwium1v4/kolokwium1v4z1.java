public class Main {

    // Stałe określające początkowe warunki oraz parametry dotyczące rozrodu i śmierci komarów
    private static final double POCZATKOWA_LICZBA_SAMCOW = 450;
    private static final double POCZATKOWA_LICZBA_SAMIC = 550;
    private static final double PRZYROST = 0.1;
    private static final double SMIERTELNOSC_SAMCOW = 0.02;
    private static final double SMIERTELNOSC_SAMIC = 0.05;

    // Metoda licząca liczbę samców i samic po danej liczbie tygodni
    public double[] liczbaKomarowPoTygodniach(double samce, double samice, int tygodnie) {
        // Warunek bazowy - jeśli liczba tygodni to 1, to po prostu liczymy ilość komarów po jednym tygodniu
        if (tygodnie == 1) {
            // Obliczenie liczby nowych samców i samic na podstawie przyrostu
            double noweSamce = (samce + samice) * PRZYROST * 0.45;
            double noweSamice = (samce + samice) * PRZYROST * 0.55;
            // Aktualizacja liczby samców i samic z uwzględnieniem nowych komarów oraz śmierci
            samce = samce + noweSamce - (samce * SMIERTELNOSC_SAMCOW);
            samice = samice + noweSamice - (samice * SMIERTELNOSC_SAMIC);
            // Zwrócenie wyników w postaci tablicy
            return new double[]{samce, samice};
        }

        // Jeśli liczba tygodni to więcej niż 1, to dzielimy problem na dwie połowy
        // Najpierw liczymy liczbę komarów po połowie czasu
        double[] polowa = liczbaKomarowPoTygodniach(samce, samice, tygodnie / 2);
        // Następnie korzystamy z wyniku z połowy czasu, aby obliczyć liczbę komarów po pełnym czasie
        return liczbaKomarowPoTygodniach(polowa[0], polowa[1], tygodnie - tygodnie / 2);
    }

    // Metoda znajdująca tydzień, kiedy liczba samców przekroczy liczbę samic
    public int znajdzTydzienKiedySamcePrzekroczaSamice(int poczatek, int koniec, double samce, double samice) {
        // Warunek bazowy: jeśli początek jest większy od końca, oznacza to, że nie znaleźliśmy odpowiedniego tygodnia
        if (poczatek > koniec) {
            return -1;
        }

        // Środkowy punkt w zakresie tygodni, którym teraz się zajmujemy
        int srodek = (poczatek + koniec) / 2;
        // Liczymy liczbę komarów po "środkowej" liczbie tygodni
        double[] wynikSrodek = liczbaKomarowPoTygodniach(samce, samice, srodek);

        // Jeśli w środkowym tygodniu liczba samców przekroczyła liczbę samic
        if (wynikSrodek[0] >= wynikSrodek[1]) {
            // Sprawdzamy, czy w poprzednim tygodniu też tak było
            // Jeśli nie, to znaleźliśmy odpowiedni tydzień
            if (srodek == 1 || liczbaKomarowPoTygodniach(samce, samice, srodek - 1)[0] < liczbaKomarowPoTygodniach(samce, samice, srodek - 1)[1]) {
                return srodek;
            } else {
                // Jeśli w poprzednim tygodniu też liczba samców przekroczyła liczbę samic
                // Szukamy odpowiedzi w pierwszej połowie zakresu
                return znajdzTydzienKiedySamcePrzekroczaSamice(poczatek, srodek - 1, samce, samice);
            }
        } else {
            // Jeśli w środkowym tygodniu liczba samców nie przekroczyła liczby samic
            // Szukamy odpowiedzi w drugiej połowie zakresu
            return znajdzTydzienKiedySamcePrzekroczaSamice(srodek + 1, koniec, samce, samice);
        }
    }

    public static void main(String[] args) {
        Main komary = new Main();
        // Szukamy tygodnia, kiedy liczba samców przekroczy liczbę samic w zakresie od 1 do 1000 tygodni
        int tydzien = komary.znajdzTydzienKiedySamcePrzekroczaSamice(1, 1000, POCZATKOWA_LICZBA_SAMCOW, POCZATKOWA_LICZBA_SAMIC);
        // Jeśli nie znaleźliśmy odpowiedniego tygodnia, wyświetlamy komunikat
        if (tydzien == -1) {
            System.out.println("Po 1000 tygodniach liczba samców nie przekroczyła liczby samic.");
        } else {
            // Jeśli znaleźliśmy odpowiedni tydzień, wyświetlamy wyniki
            double[] wynik = komary.liczbaKomarowPoTygodniach(POCZATKOWA_LICZBA_SAMCOW, POCZATKOWA_LICZBA_SAMIC, tydzien);
            System.out.println("Po " + tydzien + " tygodniach liczba samców (" + wynik[0] +
                    ") przekroczyła liczbę samic (" + wynik[1] + ").");
        }
    }
}
