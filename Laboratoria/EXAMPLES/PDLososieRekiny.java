package Kolokwium1;

import java.util.HashMap;
import java.util.Map;

public class PDLososieRekiny
{
    static Map<Integer, Double> wyniki = new HashMap<>(); // Mapa wyników ile jest populacji łososi
    static double AKTUALNIE_LOSOSI = 1_000_000; // Aktualna liczba łososi
    static final double POCZATKOWO_LOSOSI = 1_000_000; // Początkowa liczba łososi
    static final double WSP_ROZMNAZANIA = Math.pow(Math.E, 0.003); // Ile łososi będzie, kiedy się rozmnożą
    static final double WSP_UMIERALNOSCI = 0.996; // Ile łososi będzie, kiedy umrą lub zostaną zjedzone
    static int[] CELE = {500_000, 333_333, 100_000, 10_000, 100}; // Cele populacji
    static int CZAS = 0; // Czas wymarcia populacji

    public static void main(String[] args)
    {
        for (int cel : CELE)
        {
            wyniki.put(cel, AKTUALNIE_LOSOSI);
            CZAS = obliczLososie(cel);
            if(cel == CELE[CELE.length - 1]) { System.out.println("Populacja łososi wymrze po " + CZAS + " minutach"); return; }
            System.out.println("Populacja łososi osiągnie 1/" + ((int) POCZATKOWO_LOSOSI/cel) + " początkowej populacji po " + CZAS +" minutach");
        }
    }

    static int obliczLososie(int cel)
    {
        AKTUALNIE_LOSOSI = wyniki.get(cel);
        if(AKTUALNIE_LOSOSI > cel)
        {
            AKTUALNIE_LOSOSI = AKTUALNIE_LOSOSI * WSP_ROZMNAZANIA * WSP_UMIERALNOSCI * WSP_UMIERALNOSCI;
            CZAS++;
            wyniki.put(cel, AKTUALNIE_LOSOSI);
            return obliczLososie(cel);
        }
        return CZAS;
    }
}
