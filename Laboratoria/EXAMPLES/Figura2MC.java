package Kolokwium1;

import java.util.Random;

public class Figura2MC
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
            double x = (double) random.nextInt(10001) / 10000;
            double y = (double) random.nextInt(10001) / 10000;
            double Y = Math.pow(x, 2);
            if(y <= Y) { ileDobrychPunktow++; }
        }
        double pole = (double) ileDobrychPunktow / liczbaPunktow;
        System.out.println("Pole figury wynosi: " + pole);
    }
}
