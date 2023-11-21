package Kolokwium1;

public class AZDroga
{
    final static int N = 9; // Liczba miast
    static int[][] polaczenia = {
            {0, 300, 402, 356, -1, -1, -1, -1, -1},
            {300, 0, -1, -1, 440, 474, -1, -1, -1},
            {402, -1, 0, -1, -1, 330, -1, -1, -1},
            {356, -1, -1, 0, -1, -1, 823, -1, -1},
            {-1, 440, -1, -1, 0, -1, -1, 430, -1},
            {-1, 474, 330, -1, -1, 0, 813, 365, 774},
            {-1, -1, -1, 823, -1, 813, 0, -1, 403},
            {-1, -1, -1, -1, 430, 365, -1, 0, 768},
            {-1, -1, -1, -1, -1, 774, 403, 768, 0} };
    static String[] miasta = {"Warszawa", "Katowice", "Zakopane", "Lwów", "Wiedeń", "Budapeszt", "Bukareszt", "Zagrzeb", "Sofia"};

    public static void main(String[] args)
    {
        int aktualneMiasto = 0; // Warszawa
        int cel = 8; // Sofia
        int dlugoscTrasy = 0;
        StringBuilder trasa = new StringBuilder(miasta[aktualneMiasto]);

        while (aktualneMiasto != cel)
        {
            int nastepneMiasto = -1;
            int najkrotszaOdleglosc = Integer.MAX_VALUE;

            for (int i = aktualneMiasto; i < N; i++)
            {
                if (polaczenia[aktualneMiasto][i] > 0 && polaczenia[aktualneMiasto][i] < najkrotszaOdleglosc)
                {
                    najkrotszaOdleglosc = polaczenia[aktualneMiasto][i];
                    nastepneMiasto = i;
                }
            }

            if (nastepneMiasto == -1)
            {
                System.out.println("Nie znaleziono trasy.");
                return;
            }

            dlugoscTrasy += najkrotszaOdleglosc;
            trasa.append(" -> ").append(miasta[nastepneMiasto]);
            aktualneMiasto = nastepneMiasto;
        }

        System.out.println("Najkrótsza trasa ma długość: " + dlugoscTrasy + " km.");
        System.out.println("Trasa prowadzi przez: " + trasa);
    }
}
