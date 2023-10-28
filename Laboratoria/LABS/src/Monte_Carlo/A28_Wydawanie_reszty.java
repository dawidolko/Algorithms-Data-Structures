package Monte_Carlo;

import java.util.Random;

public class A28_Wydawanie_reszty {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] nominaly = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        final double RESZTA = 4.78;

        String najlepszeRozwiazanie = "";
        int najmniejMonet = Integer.MAX_VALUE;

        for (int i=0;i<100;i++) {

            int wGroszach = (int)(RESZTA*100);
            String rozwiazanie = "";
            int ileMonet = 0;

            while (true) {
                int nominal = nominaly[rand.nextInt(nominaly.length)];

                if (wGroszach-nominal>=0) {
                    wGroszach -= nominal;
                    rozwiazanie += (float)nominal/100 + " ";
                    ileMonet++;
                }

                if (wGroszach<=0) break;
            }

            if (ileMonet<najmniejMonet) {
                najlepszeRozwiazanie=rozwiazanie;
            }
        }

        System.out.println("Wydane monety:\n" + najlepszeRozwiazanie);


    }
}
