package Algorytm_zachlanny;

public class A19_Najkrotsza_droga {

    public static void main(String[] args) {
        final int[][] polaczenia = {
                {0, 300, 402, 356, -1, -1, -1, -1, -1},
                {300, 0, -1, -1, 440, 474, -1, -1, -1},
                {402, -1, 0, -1, -1, 330, -1, -1, -1},
                {356, -1, -1, 0, -1, -1, 823, -1, -1},
                {-1, 440, -1, -1, 0, -1, -1, 430, -1},
                {-1, 474, 330, -1, -1, 0, 813, 365, 774},
                {-1, -1, -1, 823, -1, 813, 0, -1, 403},
                {-1, -1, -1, -1, 430, 365, -1, 0, 768},
                {-1, -1, -1, -1, -1, 774, 403, 768, 0}
        };
        final String[] nazwy = {"Warszawa", "Katowice", "Zakopane", "Lwow", "Wieden", "Budapeszt", "Bukareszt", "Zagrzeb", "Sofia"};

        int wiersz = 0; // Start z Warszawy
        int cel = 8; // Cel to Sofia
        System.out.println("Trasa: ");
        System.out.print(nazwy[wiersz] + " -> ");

        boolean[] odwiedzone = new boolean[polaczenia.length];
        odwiedzone[wiersz] = true;

        int suma = 0;
        while (wiersz != cel) {
            int minTrasa = Integer.MAX_VALUE;
            int pozycja = -1;

            for (int j = 0; j < polaczenia[wiersz].length; j++) {
                if (polaczenia[wiersz][j] < minTrasa && polaczenia[wiersz][j] > 0 && !odwiedzone[j]) {
                    pozycja = j;
                    minTrasa = polaczenia[wiersz][j];
                }
            }

            if (pozycja > -1) {
                System.out.print(nazwy[pozycja] + " -> ");
                suma += polaczenia[wiersz][pozycja];
                wiersz = pozycja;
                odwiedzone[pozycja] = true;
            } else {
                System.out.println("Nie można znaleźć dalszej drogi.");
                break;
            }
        }

        System.out.println("\nTa trasa ma " + suma + " km");
    }
}