package Kolokwium1;

import java.util.Random;

public class MCPlecak
{
    static int[] VI = {6,2,3,2,3,1}; // Objętości przedmiotów
    static int[] WI = {6,4,5,7,10,2}; // Wartości przedmiotów
    static int[] UZYTE = {0,0,0,0,0,0}; // Użyte przedmioty
    static int[] UZYTEOBECNE = {0,0,0,0,0,0}; // Użyte przedmioty przy obecnym losowaniu
    static int VMAKS = 0; // Maksymalna objętość plecaka
    static int WMAKS = 0; // Maksymalna wartość plecaka
    static int VOBECNE = 10; // Maksymalna objętość plecaka przy obecnym losowaniu
    static int WOBECNE = 0; // Maksymalna wartość plecaka przy obecnym losowaniu

    public static void main(String[] args)
    {
        for(int losowanieNumer = 0; losowanieNumer < 100; losowanieNumer++)
        {
            plecak(); // Losowanie zawartości plecaka
            sprawdz(); // Sprawdzenie czy wylosowana wartość plecaka jest lepsza od najlepszego losowania
            ustaw(); // Resetowanie obecnego stanu plecaka do kolejnego losowania
        }
        wypisz();
    }

    private static void plecak()
    {
        int przedmioty = 6; // Ile przedmiotów zostało do sprawdzenia
        Random random = new Random();
        while (przedmioty != 0)
        {
            int losuj = random.nextInt(6); // Losowanie przedmiotu
            if(UZYTEOBECNE[losuj] == 0) // Jeśli przedmiot nie został już wylosowany
            {
                if(VI[losuj] <= VOBECNE) // Jeśli przedmiot się mieści w plecaku
                {
                    VOBECNE -= VI[losuj];
                    WOBECNE += WI[losuj];
                    UZYTEOBECNE[losuj] = 1;
                }
                UZYTEOBECNE[losuj] += 1;
                przedmioty -= 1;
            }
        }
    }

    private static void sprawdz()
    {
        if(WOBECNE >= WMAKS)
        {
            VMAKS = 10 - VOBECNE;
            WMAKS = WOBECNE;
            UZYTE = UZYTEOBECNE;
        }
    }

    private static void ustaw()
    {
        VI = new int[]{6,2,3,2,3,1};
        WI = new int[]{6,4,5,7,10,2};
        UZYTEOBECNE = new int[]{0,0,0,0,0,0};
        VOBECNE = 10;
        WOBECNE = 0;
    }

    private static void wypisz()
    {
        System.out.print("Użyte przedmioty: ");
        for(int i = 0; i < UZYTE.length; i++) { if(UZYTE[i]==2) { System.out.print("p" + i + ", "); } }
        System.out.println("\nWartość plecaka: " + WMAKS);
        System.out.println("Objętość plecaka: " + VMAKS);
    }
}
