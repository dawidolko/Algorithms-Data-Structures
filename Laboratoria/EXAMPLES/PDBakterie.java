package Kolokwium1;

import java.util.HashMap;
import java.util.Map;

public class PDBakterie
{
    static Map<Integer, Integer> wyniki = new HashMap<>(); // Mapa wyników ile dany cel zawiera bakterii
    static int[] cele = {1000, 10000, 100000, 1000000}; // Cele rozmnażania się bakterii
    static int czas = 0; // Aktualny czas rozmnażania się bakterii
    static int aktualnaLiczbaBakterii = 1; // Ile bakterii aktualnie istnieje

    public static void main(String[] args)
    {
        for (int cel : cele)
        {
            wyniki.put(cel, aktualnaLiczbaBakterii);
            czas = obliczCzas(cel);
            System.out.println("Populacja zwiększyła się " + cel + " razy po " + czas + " minutach");
        }
    }

    public static int obliczCzas(int cel)
    {
        aktualnaLiczbaBakterii = wyniki.get(cel);
        if(aktualnaLiczbaBakterii < cel)
        {
            aktualnaLiczbaBakterii *= 2;
            czas += 2;
            wyniki.put(cel, aktualnaLiczbaBakterii);
            return obliczCzas(cel);
        }
        return czas;
    }
}
