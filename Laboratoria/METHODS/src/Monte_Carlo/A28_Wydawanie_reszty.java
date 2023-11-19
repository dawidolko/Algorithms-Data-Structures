package Monte_Carlo;

import java.io.*;
import java.util.*;

class A28_Wydawanie_reszty {

    public static void main(String[] args) throws IOException {
        // obiekty do pobierania danych od uzytkownika
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader wejscie = new BufferedReader(str);
        String tekst;

        Random losuj = new Random(); // obiekt klasy do losowania liczb
        final int[] MONETY = {500, 200, 100, 50, 20, 10, 5, 2, 1}; // nominaly wyrazone w groszach
        final int LIMIT_WYDANYCH_MONET = 11; // limit wydanych monet + 1
        final int LICZBA_LOSOWAN = 100; // ile losowych rozwiazan chcemy wygenerowac
        int minLiczbaWydanychMonet = LIMIT_WYDANYCH_MONET; // min. liczba wyd. monet - sluzy do porownywania rozwiazan
        int[] wydaneMonety = new int[LIMIT_WYDANYCH_MONET]; // tablica wydanych monet dla danego rozwiazania
        int[] minWydaneMonety = new int[LIMIT_WYDANYCH_MONET]; // tablica wydanych monet dla najlepszego rozwiazania
        int moneta, zl, gr, r;
        System.out.println("Podaj reszte..");
        System.out.print("zlotych: ");
        tekst = wejscie.readLine(); // pobranie liczby zlotych
        zl = Integer.parseInt(tekst);
        System.out.print("groszy: ");
        tekst = wejscie.readLine(); // pobranie liczby groszy
        gr = Integer.parseInt(tekst);

        for (int i = 0; i < LICZBA_LOSOWAN; i++) { // petla do tworzenia rozwiazan zadania
            r = zl * 100 + gr; // konwersja zdefiniowanej reszty na grosze
            int liczbaWydanychMonet = 0; // licznik wydanych monet
            // dopoki reszta>0 i liczba wydanych monet miesci sie w limicie...
            while (r > 0 && liczbaWydanychMonet < LIMIT_WYDANYCH_MONET) {
                moneta = MONETY[losuj.nextInt(MONETY.length)]; // losowanie nominalu - zakres losowania od 0 do 8 (wlacznie)
                if (r >= moneta) { // jesli reszta wieksza/rowna od wylosowanego nominalu ...
                    wydaneMonety[liczbaWydanychMonet] = moneta; // ... dodaj ten nominal do tablicy wydanych monet
                    r = r - moneta; // ... pomniejsz reszte o wydany nominal
                    liczbaWydanychMonet++; // ... zwieksz licznik wydanych monet
                }
            }
            // wybor najlepszego rozwiazania - z najmniejsza liczba wydanych monet
            if (liczbaWydanychMonet < minLiczbaWydanychMonet) { // jesli l.monet danego rozwiazania mniejsza od min.l.monet ...
                // ... przypisz parametry tego losowego rozwiazania jako aktualnie najlepszego
                minLiczbaWydanychMonet = liczbaWydanychMonet;
                for(int j = 0; j < liczbaWydanychMonet; j++)
                    minWydaneMonety[j] = wydaneMonety[j];
            }
        }
        //Jesli najlepsze rozwiazanie (sposrod generowanych losowo) miesci sie w limicie monet ...
        if (minLiczbaWydanychMonet < LIMIT_WYDANYCH_MONET)
        {
            // ... wypisz je
            System.out.print("Reszta: ");
            for (int i = 0; i < minLiczbaWydanychMonet; i++)
                System.out.print(minWydaneMonety[i] / 100.0 + " ");
        }
        else // w przeciwnym przypadku ...
            System.out.print("Nie znaleziono rozwiazania.");
        System.out.println();
    }
}