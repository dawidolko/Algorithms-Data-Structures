package Kolokwium1;

public class BakterieDZ
{
    private static double bakteriePoczatek = 12;
    private static double bakterie = 12;
    private static double podzialCzas = 0;

    public static void main(String[] args)
    {
        obliczBakterie();
    }

    private static void obliczBakterie()
    {
        bakterie *= 2;
        podzialCzas += 2;
        if(podzialCzas % 10 == 0) { bakterie *= 0.5; }
        if(bakteriePoczatek*1000 <= bakterie)
        {
            System.out.println("Po " + podzialCzas + " minutach liczba bakterii zwiększy się 1000 razy");
            System.out.println("Liczba bakteri wyniesie: " + bakterie);
        }
        else obliczBakterie();
    }
}
