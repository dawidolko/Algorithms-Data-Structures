package Kolokwium1;

public class DZLososieRekiny
{
    static final int PROG_MINIMUM = 100; // Kiedy populacja umrze
    static final double WSP_ROZMNAZANIA = Math.pow(Math.E, 0.003); // Ile łososi będzie, kiedy się rozmnożą
    static final double WSP_UMIERALNOSCI = 0.996; // Ile łososi będzie, kiedy umrą lub zostaną zjedzone
    static final double POCZATKOWO_LOSOSI = 1_000_000; // Początkowa liczba łososi
    static int[] CELE = {500_000, 333_333, 100_000, 10_000}; // Cele populacji
    static int CEL = 0; // Cel populacji

    public static void main(String[] args)
    {
        obliczLososie(1_000_000, 0);
    }

    static void obliczLososie(double liczbaLososi, int minuta)
    {
        double nowaLiczbaLososi = liczbaLososi * WSP_ROZMNAZANIA * WSP_UMIERALNOSCI * WSP_UMIERALNOSCI;
        int czasSkoku = 1; // Można dostosować do większych skoków czasowych

        if (nowaLiczbaLososi < PROG_MINIMUM)
        {
            System.out.println("Populacja łososi wymrze po " + (minuta + czasSkoku) + " minutach");
            return;
        }

        if (CEL < CELE.length && nowaLiczbaLososi < CELE[CEL])
        {
            System.out.println("Populacja łososi osiągnie 1/" + ((int)POCZATKOWO_LOSOSI/CELE[CEL]) + " początkowej populacji po " + (minuta + czasSkoku) + " minutach");
            CEL++;
        }

        obliczLososie(nowaLiczbaLososi, minuta + czasSkoku); // Rekurencyjne wywołanie z nową liczbą łososi i zaktualizowanym czasem
    }
}
