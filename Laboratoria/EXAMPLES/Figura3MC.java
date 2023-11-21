package Kolokwium1;

import java.util.Random;

public class Figura3MC
{
    private static final int liczbaPunktow = 100;
    private static int ileDobrychPunktow = 0;

    public static void main(String[] args)
    {
        obliczPole();
    }

    private static void obliczPole()
    {
        Random random = new Random();
        for(int i = 0; i < liczbaPunktow; i++)
        {
            double x = (double) random.nextInt(70001) / 100000;
            double y = ((double) random.nextInt(70001) + 40000) / 100000;
            double Y = Math.pow(x/10, x);
            if(y <= Y) { ileDobrychPunktow++; }
        }
        double pole = (double) ileDobrychPunktow / liczbaPunktow;
        System.out.println("Pole figury wynosi: " + pole);
    }
}
