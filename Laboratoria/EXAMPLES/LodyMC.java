package Kolokwium1;

import java.util.Random;

public class LodyMC
{
    private static final int[][] czasy = {{0, 7, 20, -1, 12, 23},
                                          {27, 0, 13, 16, -1, 5},
                                          {53, -1, 0, 25, 27, 6},
                                          {16, 2, 35, 0, 47, -1},
                                          {31, 29, -1, 18, 0, 4},
                                          {-1, 24, 1, 17, 5, 0}};
    private static StringBuilder lody = new StringBuilder();
    private static StringBuilder lodyNajlepsze = new StringBuilder();
    private static int czasProdukcji = 0;
    private static int czasProdukcjiNajlepszy = Integer.MAX_VALUE;
    private static int[] uzyteLodyTab = {-1, -1, -1, -1, -1, -1};

    public static void main(String[] args)
    {
        for(int i = 0; i < 100; i++)
        {
            generujLody();
            sprawdzLody();
            resetujLody();
        }
        wypiszLody();
    }

    private static void generujLody()
    {
        Random random = new Random();
        int jakaMaszyna;
        int uzyteLody = 0;

        while(uzyteLody != 6)
        {
            jakaMaszyna = random.nextInt(6);
            if(uzyteLody == 0)
            {
                uzyteLodyTab[uzyteLody] = jakaMaszyna;
                lody.append(jakaMaszyna + 1).append(", ");
                uzyteLody++;
            }
            else
            {
                boolean czyMozna = true;
                for(int i = 0; i < uzyteLody; i++)
                    { if(uzyteLodyTab[i] == jakaMaszyna) { czyMozna = false; break; } }
                if(czyMozna)
                {
                    uzyteLodyTab[uzyteLody] = jakaMaszyna;
                    lody.append(jakaMaszyna + 1).append(", ");
                    uzyteLody++;
                }
            }
        }

        for(int i = 0; i < czasy.length - 1; i++)
        {
            if (czasy[uzyteLodyTab[i]][uzyteLodyTab[i + 1]] > 0)
                { czasProdukcji += czasy[uzyteLodyTab[i]][uzyteLodyTab[i + 1]]; }
            else
                { czasProdukcji = Integer.MAX_VALUE; return; }
        }

        if(czasy[uzyteLodyTab[5]][uzyteLodyTab[0]] > 0)
            { czasProdukcji += czasy[uzyteLodyTab[5]][uzyteLodyTab[0]]; }
        else
            { czasProdukcji = Integer.MAX_VALUE; }
    }

    private static void sprawdzLody()
    {
        if(czasProdukcji < czasProdukcjiNajlepszy)
        {
            czasProdukcjiNajlepszy = czasProdukcji;
            lodyNajlepsze = lody;
        }
    }

    private static void resetujLody()
    {
        lody = new StringBuilder();
        czasProdukcji = 0;
        uzyteLodyTab = new int[]{-1, -1, -1, -1, -1, -1};
    }

    private static void wypiszLody()
    {
        System.out.println("Wykorzystane lody: " + lodyNajlepsze);
        System.out.println("Minimalny czas produkcji: " + czasProdukcjiNajlepszy);
    }
}
