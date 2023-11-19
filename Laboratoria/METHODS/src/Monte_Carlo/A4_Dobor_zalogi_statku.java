package Monte_Carlo;

import java.util.Random;

public class A4_Dobor_zalogi_statku {
    public static void main(String[] args) {
        final int[][] kosmonauci = {
                {1, 0, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1}
        };

        Random rand = new Random();
        String najlepszeRozwiazanie = "";
        int minAstronautow = Integer.MAX_VALUE;

        for (int i=0; i<10;i++) {
            int astronautow=0;
            String rozwiazanie = "";
            boolean[] dziedziny = new boolean[kosmonauci[0].length];
            boolean[] leca = new boolean[kosmonauci.length];

            while (true) {
                int kosmonauta = rand.nextInt(kosmonauci.length);

                if (!leca[kosmonauta]) {
                    leca[kosmonauta] = true;
                    rozwiazanie += kosmonauta+1 + " ";
                    astronautow++;
                    for (int j=0;j<dziedziny.length;j++) {
                        if (kosmonauci[kosmonauta][j]==1) dziedziny[j]=true;
                    }
                }

                boolean wszystko = true;
                for (int j=0;j<dziedziny.length;j++) if (!dziedziny[j]) wszystko=false;

                if (wszystko) {
                    if (astronautow<minAstronautow) {
                        minAstronautow=astronautow;
                        najlepszeRozwiazanie = rozwiazanie;
                    }
                    break;
                }
            }
        }

        System.out.println("Moga poleciec: " + najlepszeRozwiazanie);
    }
}
