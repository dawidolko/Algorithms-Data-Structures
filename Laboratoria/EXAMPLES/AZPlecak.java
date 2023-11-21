package Kolokwium1;

import java.util.Arrays;

public class AZPlecak
{
    static int[] VI = {6,2,3,2,3,1}; // Objętości przedmiotów
    static int[] WI = {6,4,5,7,10,2}; // Wartości przedmiotów
    static final double[] WI_VI = new double[VI.length]; // WI/VI
    static int[] UZYTE = {0,0,0,0,0,0}; // Użyte przedmioty
    static int VMAKS = 0; // Maksymalna objętość plecaka
    static int WMAKS = 0; // Maksymalna wartość plecaka

    public static void main(String[] args)
    {
        // Zachłannie od największej wartości do najmniejszej
        System.out.println("Zachłannie plecak1: ");
        plecak1();

        // Zachłannie od najmniejszej objętości do największej
        System.out.println("\nZachłannie plecak2: ");
        plecak2();

        // Zachłannie od największej Wi/Vi do najmniejszej
        System.out.println("\nZachłannie plecak3: ");
        plecak3();
    }

    private static void plecak1()
    {
        deklaracja();

        for(int sprawdz = 0; sprawdz < VI.length; sprawdz++)
        {
            if(VMAKS >= 10) { break; }
            else
            {
                int wAktualne = 0; int vAktualne = Arrays.stream(VI).max().getAsInt(); int indeks = 0;
                for(int przedmiot = 0; przedmiot < VI.length; przedmiot++)
                {
                    if(UZYTE[przedmiot]!=1) // Sprawdzenie, czy dany przedmiot nie został już użyty
                        if((WI[przedmiot] >= wAktualne) && (VI[przedmiot]+VMAKS <= 10)) // Sprawdzenie jaki przedmiot ma aktualnie największą wartość i czy zmieści się w plecaku
                            if((WI[przedmiot] > wAktualne) || ((WI[przedmiot] == wAktualne) && (VI[przedmiot] <= vAktualne))) // Sprawdzenie jaki przedmiot ma najmniejszą objętość, gdy co najmniej dwa przedmiotów mają taką samą aktualnie największą wartość
                                { wAktualne = WI[przedmiot]; vAktualne = VI[przedmiot]; indeks = przedmiot; }
                }
                if((VI[indeks]+VMAKS <= 10))
                { WMAKS+=wAktualne; VMAKS+=vAktualne; UZYTE[indeks] = 1; VI[indeks] = 0; WI[indeks] = 0; } // Dodanie do plecaka przedmiotu, który ma aktualnie największą wartość i przy tym najmniejszą objętość
            }
        }
        wypisz(); // Wypisanie użytych przedmiotów, wartości i objętości plecaka
    }

    private static void plecak2()
    {
        deklaracja();

        for(int sprawdz = 0; sprawdz < VI.length; sprawdz++)
        {
            if(VMAKS >= 10) { break; }
            else
            {
                int wAktualne = 0; int vAktualne = Arrays.stream(VI).max().getAsInt(); int indeks = 0;
                for(int przedmiot = 0; przedmiot < VI.length; przedmiot++)
                {
                    if(UZYTE[przedmiot]!=1) // Sprawdzenie, czy dany przedmiot nie został już użyty
                        if((VI[przedmiot] <= vAktualne) && (VI[przedmiot]+VMAKS <= 10)) // Sprawdzenie jaki przedmiot ma aktualnie najmniejszą objętość i czy zmieści się w plecaku
                            if((VI[przedmiot] < vAktualne) || ((VI[przedmiot] == vAktualne) && (WI[przedmiot] >= wAktualne))) // Sprawdzenie jaki przedmiot ma największą wartość, gdy co najmniej dwa przedmiotów mają taką samą aktualnie najmniejszą objętość
                                { wAktualne = WI[przedmiot]; vAktualne = VI[przedmiot]; indeks = przedmiot; }
                }
                if((VI[indeks]+VMAKS <= 10))
                { WMAKS+=wAktualne; VMAKS+=vAktualne; UZYTE[indeks] = 1; VI[indeks] = 0; WI[indeks] = 0; } // Dodanie do plecaka przedmiotu, który ma aktualnie najmniejszą objętość i przy tym największą wartość
            }
        }
        wypisz(); // Wypisanie użytych przedmiotów, wartości i objętości plecaka
    }

    private static void plecak3()
    {
        deklaracja();

        for(int podziel = 0; podziel < VI.length; podziel++)
        { WI_VI[podziel] = (double) WI[podziel] / VI[podziel]; }

        for(int sprawdz = 0; sprawdz < VI.length; sprawdz++)
        {
            if(VMAKS >= 10) { break; }
            else
            {
                int wAktualne = 0; int vAktualne = Arrays.stream(VI).max().getAsInt(); int indeks = 0; double wvAktualne = 0;
                for(int przedmiot = 0; przedmiot < VI.length; przedmiot++)
                {
                    if(UZYTE[przedmiot]!=1) // Sprawdzenie, czy dany przedmiot nie został już użyty
                        if((WI_VI[przedmiot] >= wvAktualne) && (VI[przedmiot]+VMAKS <= 10)) // Sprawdzenie jaki przedmiot ma aktualnie największy stosunek Wi/Vi i czy zmieści się w plecaku
                            if((WI_VI[przedmiot] > wvAktualne) || ((WI_VI[przedmiot] == wvAktualne) && (VI[przedmiot] <= vAktualne))) // Sprawdzenie jaki przedmiot ma najmniejszą objętość, gdy co najmniej dwa przedmiotów mają taki sami stosunek Wi/Vi
                                { wAktualne = WI[przedmiot]; vAktualne = VI[przedmiot]; indeks = przedmiot; wvAktualne = WI_VI[przedmiot]; }
                }
                if((VI[indeks]+VMAKS <= 10))
                { WMAKS+=wAktualne; VMAKS+=vAktualne; UZYTE[indeks] = 1; VI[indeks] = 0; WI[indeks] = 0; } // Dodanie do plecaka przedmiotu, który ma aktualnie największy stosunek Wi/Vi i przy tym najmniejszą objętość
            }
        }
        wypisz(); // Wypisanie użytych przedmiotów, wartości i objętości plecaka
    }

    private static void deklaracja()
    {
        VI = new int[]{6, 2, 3, 2, 3, 1};
        WI = new int[]{6, 4, 5, 7, 10, 2};
        UZYTE = new int[]{0, 0, 0, 0, 0, 0};
        VMAKS = 0;
        WMAKS = 0;
    }

    private static void wypisz()
    {
        System.out.print("Użyte przedmioty: ");
        for(int i = 0; i < UZYTE.length; i++) { if(UZYTE[i]==1) { System.out.print("p" + i + ", "); } }
        System.out.println("\nWartość plecaka: " + WMAKS);
        System.out.println("Objętość plecaka: " + VMAKS);
    }
}
