package Kolokwium1;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MCReszta
{
    static final int[] MONETY = {500,200,100,50,20,10,5,2,1}; // Nominały monet
    static int[] LIMITY = {1,2,0,7,2,2,5,2,0}; // Limity na dany nominał
    static int[] UZYTE = {0,0,0,0,0,0,0,0,0}; // Użyte monety w danej kolejce
    static int[] UZYTE_PRAWIDLOWE = {0,0,0,0,0,0,0,0,0}; // Użyte monety prawidłowa wartość
    static int RESZTA_ZABRAKLO; // Ile reszty zabrakło do wydania w danej kolejce
    static int RESZTA_ZABRAKLO_PRAWIDLOWE = Integer.MAX_VALUE; // Ile reszty zabrakło do wydania prawidłowa wartość
    static int ILE_MONET; // Ile monet wydano w danej kolejce
    static int ILE_MONET_PRAWIDLOWE = Integer.MAX_VALUE; // Ile monet wydano prawidłowa wartość
    static int ZL, GR, RESZTA, ZL_RESET, GR_RESET, RESZTA_RESET;

    public static void main(String[] args) throws IOException
    {
        scanner();
        for(int i = 0; i < 100; i++) // Ile razy będą losowane nominały do wydania
        {
            wydawanie(); // Liczenie wydawanych monet
            policzCzyWydano(); // Policzenie czy cała reszta została wydana
            resetowanie();
        }
        wypisz(); // Wypisanie dostępnych nominałów
    }

    public static void wydawanie()
    {
        int zapetlenieBoBrakDobychNominalow = 0;
        Random random = new Random();
        int ileWLimitach = -1;
        while (RESZTA >= 0 && (ileWLimitach != 0) && (zapetlenieBoBrakDobychNominalow < 25))
        {
            int moneta = random.nextInt(8);
            if(LIMITY[moneta] != 0)
            {
                if(RESZTA >= MONETY[moneta])
                {
                    UZYTE[moneta] += 1; // Użyty dany nominał, zwiększenie o 1
                    LIMITY[moneta]--; // Użyty limit danego nominału, zmniejszenie o 1
                    RESZTA = RESZTA - MONETY[moneta]; // Ile zostało reszty do wydania
                    ILE_MONET++; // Ile użytych monet, zwiększenie o 1
                    zapetlenieBoBrakDobychNominalow = 0;
                }
            }
            else { zapetlenieBoBrakDobychNominalow += 1; }

            ileWLimitach = 0;
            for (int j : LIMITY) { ileWLimitach += j; }
        }
    }

    public static void scanner()
    {
        Scanner scanner = new Scanner(System.in);
        String tekst;
        System.out.println("Podaj resztę do wydania:");
        System.out.print("Złotych: ");
        tekst = scanner.nextLine(); // Ile złotych do wydania
        ZL = Integer.parseInt(tekst);
        ZL_RESET = ZL;
        System.out.print("Groszy: ");
        tekst = scanner.nextLine();; // Ile groszy do wydania
        GR = Integer.parseInt(tekst);
        GR_RESET = GR;
        RESZTA = ZL*100 + GR; // Reszta do wydania
        RESZTA_RESET = RESZTA;
    }

    public static void resetowanie() // Resetowanie wartości do każdego obiegu pętli
    {
        GR = GR_RESET;
        ZL = ZL_RESET;
        RESZTA = RESZTA_RESET;
        LIMITY = new int[]{1, 2, 0, 7, 2, 2, 5, 2, 0};
        UZYTE = new int[]{0,0,0,0,0,0,0,0,0};
        ILE_MONET = 0;
        RESZTA_ZABRAKLO = 0;
    }

    public static void policzCzyWydano() // Sprawdzenie, czy dany obiekt pętli jest korzystniejszy pod względem wydanej reszty lub ilości wydanych monet
    {
        RESZTA_ZABRAKLO = RESZTA;
        if((RESZTA_ZABRAKLO == RESZTA_ZABRAKLO_PRAWIDLOWE && ILE_MONET < ILE_MONET_PRAWIDLOWE) || (RESZTA_ZABRAKLO < RESZTA_ZABRAKLO_PRAWIDLOWE))
        {
            ILE_MONET_PRAWIDLOWE = ILE_MONET;
            RESZTA_ZABRAKLO_PRAWIDLOWE = RESZTA_ZABRAKLO;
            UZYTE_PRAWIDLOWE = UZYTE;
        }
    }

    public static void wypisz()
    {
        System.out.print("\nReszta:\n");
        for(int i = MONETY.length - 1; i >= 0; i--)
        {
            if(i <= 2) { System.out.println((int)(MONETY[i] / 100.0) + "zł x " + UZYTE_PRAWIDLOWE[i]); }
            else { System.out.println(MONETY[i] + "gr x " + UZYTE_PRAWIDLOWE[i]); }
        }
        System.out.println("Ilość wydanych monet: " + ILE_MONET_PRAWIDLOWE);
        if(RESZTA_ZABRAKLO_PRAWIDLOWE == 0) { System.out.println("Nie zabrakło reszty do wydania"); }
        else System.out.println("Zabrakło reszty do wydania: " + RESZTA_ZABRAKLO_PRAWIDLOWE);
    }
}
