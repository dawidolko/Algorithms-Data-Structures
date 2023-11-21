package Kolokwium1;

import java.util.Random;

public class MCFigura
{
    final private static int ILE_PUNKTOW = 10000; // Ile losowań punktów
    private static int ILE_DOBRYCH_PUNKTOW = 0; // Ile punktów należy lub leży pod wykresem (należy do figury)

    public static void main(String[] args)
    {
        Random random = new Random();
        for(int i = 0; i < ILE_PUNKTOW; i++)
        {
            double x = (double) (random.nextInt(70001)) / 100000; // Losowanie wartości punktu dla współrzędnej x od (od 0 do 0,7)
            double y = (double) (random.nextInt(70001) + 40000) / 100000; // Losowanie wartości punktu dla współrzędnej y (od 0,4 do 1,1)
            double Y = Math.pow((x/10), x); // Wyliczenie wartości maksymalnej, jaką może przyjąć wartość x
            if(y <= Y) { ILE_DOBRYCH_PUNKTOW++; } // Jeśli wartość się mieści, dodaj liczbę dobrych punktów
        }
        double wartoscX = 0.7 - 0.0; // Szerokość figury
        double wartoscY = 1.1 - 0.4; // Długość figury
        double polePrawdziwe = wartoscX * wartoscY; // Prawdziwe pole figury całej
        double pole = (double) ILE_DOBRYCH_PUNKTOW / ILE_PUNKTOW * polePrawdziwe; // Obliczanie pola figury
        System.out.println("Pole figury: " + pole);
        System.out.println("Przedziały x=[od 0 do 0,7] y=[od 0,4 do 1,1]");
    }
}
