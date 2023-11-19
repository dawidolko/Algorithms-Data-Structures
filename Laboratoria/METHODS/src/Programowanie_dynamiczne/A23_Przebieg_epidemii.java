package Programowanie_dynamiczne;

public class A23_Przebieg_epidemii {

        final static int MAX = 100000;
        static int chorych = 10;
        static int zdrowych = MAX - chorych;
        static int odpornych = 0;
        static int dzien = 0;
        static int[] chorzy = new int[50];
        static int[] ozdrowialych = new int[50];

        public static void symuluj() {
            for (dzien = 0; dzien < chorzy.length; dzien++) {
                chorzy[dzien] = chorych;

                if (dzien > 6) {
                    ozdrowialych[dzien] = chorzy[dzien - 7];
                    chorzy[dzien] -= ozdrowialych[dzien];
                }

                odpornych = 0;
                int startDay;
                if (dzien > 13) {
                    startDay = dzien - 13;
                } else {
                    startDay = 0;
                }
                for (int i = startDay; i <= dzien; i++) {
                    odpornych = ozdrowialych[i];
                }

                chorych -= odpornych;
                zdrowych = MAX - (chorych + odpornych);

                if (chorzy[dzien] * 3 > zdrowych || dzien >= chorzy.length - 1) {
                    wypiszWyniki();
                    break;
                } else {
                    int nowoZarazeni;
                    if (chorzy[dzien] * 3 < zdrowych) {
                        nowoZarazeni = chorzy[dzien] * 3;
                    } else {
                        nowoZarazeni = zdrowych;
                    }
                    chorych = nowoZarazeni;
                }
            }
        }

        private static void wypiszWyniki() {
            for (int i = 0; i <= dzien; i++) {
                System.out.println("Dzień: " + (i + 1) + " Chorzy: " + chorzy[i] + " Zdrowi: " + (MAX - (chorzy[i] + ozdrowialych[i])) + " Odporni: " + ozdrowialych[i]);
            }
        }

        public static void main(String[] args) {
            symuluj();
        }
    }
