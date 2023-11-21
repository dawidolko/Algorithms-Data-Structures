public class kolokwium1v6z1 {
    // dana jest zamknięta społeczność licząca 100 000 osób
    private static int wielkoscPopulacji = 100000;

    private static int liczbaChorych(int dzien) {
        int[] chorzy = new int[dzien + 1];
        // indeks 0 pomijam bo uciążliwe jest to

        // 1 dzień epidemii - 10 osób chorych na katar
        chorzy[1] = 10;

        for (int i = 2; i <= dzien; i++) {
            // 50% osób chorych na katar zaraża jeszcze 2 osoby

            double nowiChorzy = Math.floor(chorzy[i - 1] * 0.5 * 2);
            chorzy[i] = chorzy[i - 1] + (int)nowiChorzy;

            if (i >= 8) {
                chorzy[i] -= chorzy[i - 7]; // osoby wyzdrowiałe
            }
        }

        return chorzy[dzien];
    }

    public static void main(String[] args) {
        System.out.println("Przebieg epidemii kataru:");

        int dzien = 1;
        while (true) {
            int chorzy = liczbaChorych(dzien);
            System.out.println("Dzień epidemii: " + dzien + ", liczba chorych: " + chorzy);

            if (chorzy >= wielkoscPopulacji / 2) {
                System.out.println("\n\tLiczba chorych przekroczyła połowę wszystkich mieszkańców.");
                break;
            }

            dzien++;
        }
    }
}
