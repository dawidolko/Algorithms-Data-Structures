package Dziel_i_zwyciezaj;

// Klasa A24_Rozmnazanie_bakterii symuluje proces rozrodowy bakterii
public class A24_Rozmnazanie_bakterii {

    // Maksymalna liczba bakterii, której jednak nie używamy w tej wersji programu.
    final static int MAX = 1000000;

    // Flagi do określenia, czy osiągnięto określoną liczbę bakterii
    static boolean thousand, tenthousand, hundredthousand, million;

    // Metoda rozrod to funkcja rekurencyjna symulująca rozprzestrzenianie się bakterii.
    // Zaczynając od 1 bakterii, zwiększa ich liczbę dwukrotnie co 2 minuty
    // i wypisuje czas osiągnięcia określonych progów liczby bakterii.
    public static void rozrod(int bakterii, int minuty) {

        // Sprawdzamy, czy przekroczono próg 1000 i czy nie zapisano wcześniej tej informacji.
        if (bakterii > 1000 && !thousand) {
            thousand = true;
            System.out.println("Tysiąc razy: po " + minuty + " minutach");
        }

        // Sprawdzamy, czy przekroczono próg 10 000 i czy nie zapisano wcześniej tej informacji.
        if (bakterii > 10000 && !tenthousand) {
            tenthousand = true;
            System.out.println("Dziesięć tysięcy razy: po " + minuty + " minutach");
        }

        // Sprawdzamy, czy przekroczono próg 100 000 i czy nie zapisano wcześniej tej informacji.
        if (bakterii > 100000 && !hundredthousand) {
            hundredthousand = true;
            System.out.println("Sto tysięcy razy: po " + minuty + " minutach");
        }

        // Sprawdzamy, czy przekroczono próg 1 000 000 i czy nie zapisano wcześniej tej informacji.
        // Jeśli tak, wyjście z funkcji - zakończenie rekurencji.
        if (bakterii > 1000000 && !million) {
            million = true;
            System.out.println("Milion razy: po " + minuty + " minutach");
            return;
        }

        // Rekurencyjne wywołanie metody rozrod z podwojoną liczbą bakterii i czasem większym o 2 minuty.
        rozrod(2 * bakterii, minuty + 2);
    }

    // Metoda main jest punktem wejścia programu.
    public static void main(String[] args) {
        // Rozpoczęcie procesu rozrodowego od 1 bakterii i 0 minut.
        rozrod(1, 0);
    }
}
