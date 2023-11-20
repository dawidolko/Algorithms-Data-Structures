import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Obliczanie pola figury
        Random rand = new Random();
        int polef = 0;

        for (int i = 0; i < 100; i++) {
            double x = rand.nextDouble() * 0.7;
            double y = rand.nextDouble() * 0.3 + 0.4;

            if (Math.pow(x / 10, x) >= y) polef++;
        }

        System.out.println("Pole figury to " + (double) polef / 100 + ".");

        // Problem wydawania reszty
        Scanner scanner = new Scanner(System.in);

        int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int zl, gr, r, ilosc, i;

        System.out.println("Podaj resztę..");
        System.out.print("złotych: ");
        zl = scanner.nextInt();
        System.out.print("groszy: ");
        gr = scanner.nextInt();
        r = zl * 100 + gr;

        String header = "Nominał (zł) | Ilość";
        System.out.println(header);
        System.out.println("-".repeat(header.length()));

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

        scanner.close();
    }
}
