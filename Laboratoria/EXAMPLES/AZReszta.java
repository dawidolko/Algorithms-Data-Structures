package Kolokwium1;

import java.io.IOException;
import java.util.Scanner;

public class AZReszta
{
    static final int[] MONETY = {500,200,100,50,20,10,5,2,1};
    static final int[] LIMITY = {1,2,0,7,2,2,5,2,0};
    static final int[] UZYTE = {0,0,0,0,0,0,0,0,0};

    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String tekst;
        int zl, gr, reszta, i = 0;
        System.out.println("Podaj resztę do wydania:");
        System.out.print("Złotych: ");
        tekst = scanner.nextLine(); // Ile złotych do wydania
        zl = Integer.parseInt(tekst);
        System.out.print("Groszy: ");
        tekst = scanner.nextLine();; // Ile groszy do wydania
        gr = Integer.parseInt(tekst);

        reszta = zl*100 + gr; // Reszta do wydania
        int doWydania = reszta;
        while (reszta >= 0 && i < MONETY.length)
        {
            if (reszta >= MONETY[i]) // Czy dalej reszta do wydania
            {
                if(LIMITY[i] > 0) // Czy dalej jest dostępny dany nominał
                {
                    UZYTE[i] += 1; // Użyty dany nominał, zwiększenie o 1
                    LIMITY[i]--; // Użyty limit danego nominału, zmniejszenie o 1
                    reszta = reszta - MONETY[i]; // Ile zostało reszty do wydania
                }
                else { i++; }
            }
            else { i++; }
        }
        wypisz(); // Wypisanie dostępnych nominałów
        policzCzyWydano(doWydania); // Policzenie czy cała reszta została wydana
    }

    public static void wypisz()
    {
        System.out.print("\nReszta:\n");
        for(int i=MONETY.length-1; i >= 0; i--)
        {
            if(i <= 2) { System.out.println((int)(MONETY[i]/100.0) + "zł x " + UZYTE[i]); }
            else { System.out.println(MONETY[i] + "gr x " + UZYTE[i]); }
        }
    }

    public static void policzCzyWydano(int doWydania)
    {
        int reszta = 0;
        for(int i=0; i < MONETY.length; i++) { reszta += UZYTE[i]*MONETY[i]; }
        if(reszta!=doWydania)
        {
            double ileZabraklo = doWydania - reszta;
            System.out.println("Nie wydano całej reszty, zabrakło " + ileZabraklo/100 + "zł");
        }
        else { System.out.println("Wydano całą resztę"); }
    }
}
