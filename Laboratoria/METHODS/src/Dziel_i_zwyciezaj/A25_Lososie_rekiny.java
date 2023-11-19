package Dziel_i_zwyciezaj;

public class A25_Lososie_rekiny {

    static boolean polowaZostalaOsiagnieta; // zmienna wskazująca, czy osiągnięto już połowę maksymalnej liczby łososi
    final static int MAX = 1000000; // maksymalna liczba łososi

    /**
     * Symulacja ekosystemu łososi i rekinów.
     *
     * @param lososie - aktualna liczba łososi w ekosystemie
     * @param min - liczba minut, które upłynęły od początku symulacji
     */
    public static void ekosystem(int lososie, int min) {
        // Sprawdź, czy liczba łososi spadła poniżej połowy maksymalnej liczby i czy nie zarejestrowano tego już wcześniej
        if (lososie < MAX / 2 && !polowaZostalaOsiagnieta) {
            System.out.println("Polowa: po " + min + " minutach");
            polowaZostalaOsiagnieta = true; // zaznacz, że osiągnięto połowę
        }
        // Jeżeli liczba łososi spadnie poniżej 100, zakończ symulację
        if (lososie < 100) {
            System.out.println("Populacja wymrze po " + min + " minutach");
            return;
        }

        // Oblicz nową liczbę łososi biorąc pod uwagę przyrost naturalny oraz straty przez rekinów
        lososie = (int)((lososie * Math.exp(0.003)) * 0.998 * 0.998);
        // Wywołaj funkcję rekurencyjnie, zwiększając liczbę minut o 1
        ekosystem(lososie, min + 1);
    }

    public static void main(String[] args) {
        ekosystem(MAX, 0); // Rozpocznij symulację z maksymalną liczbą łososi
    }
}
