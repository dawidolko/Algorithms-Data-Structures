import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //METODA MONTE CARLO

        //Obliczanie pola figury

        Random rand = new Random();

        int field = 0;
        for (int i=0; i<100; i++) {
            double x = rand.nextInt(701)/1000f;
            double y = rand.nextInt(701)/1000f + 0.4;

            if (Math.pow((x/10), x) >= y) field++;
        }
        System.out.println("Pole figury to " + (double)field/100 + ".");


        //Problem wydawania reszty

       import java.io.*;

        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader wejscie = new BufferedReader(str);
        String tekst;
        final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int zl, gr, r, ilosc, i;
        System.out.println("Podaj resztę..");
        System.out.print("złotych: ");
        tekst = wejscie.readLine();
        zl = Integer.parseInt(tekst);
        System.out.print("groszy: ");
        tekst = wejscie.readLine();
        gr = Integer.parseInt(tekst);
        r = zl * 100 + gr;

        String header = "Nominał (zł) | Ilość";
        System.out.println(header);
        System.out.println(new String(new char[header.length()]).replace("\0", "-"));

        for (i = 0; i < M.length; i++) {
            ilosc = 0;
            while (r >= M[i]) {
                r -= M[i];
                ilosc++;
            }
            if (ilosc > 0) { // jeśli jakaś moneta jest używana
                System.out.printf("%10.2f zł | %5d\n", M[i] / 100.0, ilosc);
            }
        }

        if (r > 0) { // Jeśli pozostały jeszcze jakieś grosze
            System.out.printf("Pozostało niewydanych groszy: %d\n", r);
        } else {
            System.out.println("Nie pozostało niewydanych groszy.");
        }
    }
}
    }
}
