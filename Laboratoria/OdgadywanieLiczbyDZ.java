package asd_lab_3.dzielzwyciezaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OdgadywanieLiczbyDZ {

    static int krok = 0;
    static int liczba;

    static void znajdz(int a, int b) {
        krok++;
        int srodek = (a + b) / 2;
        if (srodek == liczba) {
            System.out.println("Zaproponowano: "+srodek+"\tZGADŁEŚ!\t"
                    + "Liczba " + srodek + " odnaleziona po " + krok + " krokach.");
        } else {
            if (liczba < srodek) {
                System.out.print("Zaproponowano: "+srodek+"\tZA DUŻA\t\t");
                System.out.println("przedzial: " + a + " " + (srodek - 1));
                znajdz(a, srodek - 1);
            }
            if (srodek < liczba) {
                System.out.print("Zaproponowano: "+srodek+"\tZA MAŁA\t\t");
                System.out.println("przedzial: " + (srodek + 1) + " " + b);
                znajdz(srodek + 1, b);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Podaj liczbe z przedzialu od 0 do 1000");
        BufferedReader klaw = new BufferedReader(new InputStreamReader(System.in));
        try {
            liczba = Integer.parseInt(klaw.readLine());
        } catch (IOException ex) {
            System.out.println("błąd");
        }
        if (liczba < 0 || liczba > 1000) {
            System.out.println("podales liczbe spoza dozwolonego przedzialu");
            System.exit(0);
        }

        znajdz(0, 1000);
    }
}
