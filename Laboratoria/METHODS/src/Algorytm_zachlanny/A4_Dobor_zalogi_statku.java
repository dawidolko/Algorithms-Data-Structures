package Algorytm_zachlanny;

public class A4_Dobor_zalogi_statku {
        public static void main(String[] args) {
            final int[][] kosmonauci = {
                    {1, 0, 0, 1},
                    {0, 1, 0, 1},
                    {0, 1, 1, 0},
                    {1, 1, 0, 0},
                    {0, 0, 1, 1}
            };

            String najlepszeRozwiazanie = "";
            int minAstronautow = Integer.MAX_VALUE;
            boolean[] dziedziny = new boolean[kosmonauci[0].length];
            boolean[] leca = new boolean[kosmonauci.length];
            int astronautow = 0;
            String rozwiazanie = "";

            while (true) {
                int najlepszyWybor = -1;
                int maxUmiejetnosci = 0;

                for (int i = 0; i < kosmonauci.length; i++) {
                    if (!leca[i]) {
                        int liczbaUmiejetnosci = 0;
                        for (int j = 0; j < dziedziny.length; j++) {
                            if (kosmonauci[i][j] == 1 && !dziedziny[j]) {
                                liczbaUmiejetnosci++;
                            }
                        }
                        if (liczbaUmiejetnosci > maxUmiejetnosci) {
                            najlepszyWybor = i;
                            maxUmiejetnosci = liczbaUmiejetnosci;
                        }
                    }
                }

                if (najlepszyWybor == -1) {
                    break; // Wszystkie wymagane umiejętności są już pokryte
                }

                leca[najlepszyWybor] = true;
                rozwiazanie += (najlepszyWybor + 1) + " ";
                astronautow++;

                for (int j = 0; j < dziedziny.length; j++) {
                    if (kosmonauci[najlepszyWybor][j] == 1) {
                        dziedziny[j] = true;
                    }
                }

                boolean wszystko = true;
                for (int j = 0; j < dziedziny.length; j++) {
                    if (!dziedziny[j]) {
                        wszystko = false;
                        break;
                    }
                }

                if (wszystko) {
                    if (astronautow < minAstronautow) {
                        minAstronautow = astronautow;
                        najlepszeRozwiazanie = rozwiazanie;
                    }
                    break;
                }
            }

            System.out.println("Moga poleciec: " + najlepszeRozwiazanie);
        }
    }
