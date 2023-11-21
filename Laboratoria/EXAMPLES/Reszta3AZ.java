package Kolokwium1;

import java.util.Scanner;

public class Reszta3AZ
{
    private static final int[] NOMINALY = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    private static final int[] LICZEBNOSCI = {5, 2, 0, 3, 5, 1, 4, 7, 5};
    private static final int[] UZYTE = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static void main(String[] args)
    {
        int reszta = wpiszDane();
        obliczReszte(reszta);
    }

    private static int wpiszDane()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj resztę:");
        System.out.print("Podaj zł: ");
        int zl = scanner.nextInt();
        System.out.print("Podaj gr: ");
        int gr = scanner.nextInt();
        return gr + zl * 100;
    }

    private static void obliczReszte(int reszta)
    {
        for(int i = 0; i < NOMINALY.length; i++)
        {
            while(true)
            {
                if(reszta >= NOMINALY[i] && LICZEBNOSCI[i] > 0)
                {
                    UZYTE[i]++;
                    LICZEBNOSCI[i]--;
                    reszta -= NOMINALY[i];
                }
                else break;
            }
        }
        wypisz(reszta);
    }

    private static void wypisz(int reszta)
    {
        System.out.println();
        for(int i = 0; i < UZYTE.length; i++)
        {
            if(NOMINALY[i] >= 100) System.out.println(NOMINALY[i]/100 + "zł x " + UZYTE[i]);
            else System.out.println(NOMINALY[i] + "gr x " + UZYTE[i]);
        }
        if(reszta == 0) System.out.println("Wydano całą resztę");
        else System.out.println("Nie wydano całej reszty, zabrakło " + ((double) reszta / 100) + "zł");
    }
}
