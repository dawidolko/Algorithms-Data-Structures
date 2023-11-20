public class Main {
    public static void main(String[] args) {

        // METODA BRUTALNEJ SIŁY

        // Wyszukiwanie trójek pitagorejskich
        System.out.println("Wyszukiwanie trójek pitagorejskich");
        int a, b, c, counterA = 0, counterB = 0, counterC = 0, counter = 0;
        int par = 20;

        for (a = 1; a <= par; a++) {
            counterA++;
            for (b = a + 1; b <= par; b++) {
                counterB++;
                for (c = b + 1; c <= par; c++) {
                    counterC++;
                    if (a * a + b * b == c * c) {
                        counter++;
                        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                    }
                }
            }
        }

        System.out.println("Ilość trójek: " + counter);
        System.out.println("Wykonania pętli (kolejno): " + counterA + " " + counterB + " " + counterC);

        // Wypisywanie podzbiorów zbioru o mocy N
        // Pierwsza metoda (mniej efektywna)
        System.out.println("\n\n\nWypisywanie podzbiorów zbioru o mocy N");
        System.out.println("Pierwsza metoda (mniej efektywna)");
        int b1, b2, b3, b4, b5;
        for (b1 = 0; b1 <= 1; b1++)
            for (b2 = 0; b2 <= 1; b2++)
                for (b3 = 0; b3 <= 1; b3++)
                    for (b4 = 0; b4 <= 1; b4++)
                        for (b5 = 0; b5 <= 1; b5++) {
                            System.out.print("{ ");
                            if (b1 == 1) System.out.print("1 ");
                            if (b2 == 1) System.out.print("2 ");
                            if (b3 == 1) System.out.print("3 ");
                            if (b4 == 1) System.out.print("4 ");
                            if (b5 == 1) System.out.print("5 ");
                            System.out.println("}");
                        }

        // Druga metoda (bardziej efektywna)
        System.out.println("\nDruga metoda (bardziej efektywna)");
        int N = 3; // moc zbioru
        int[] tab = new int[N + 1];
        int s = (int) Math.pow(2, N);

        for (int l = 1; l <= s; l++) {
            System.out.print("{ ");
            for (int i = 1; i <= N; i++) {
                if (tab[i - 1] == 1) System.out.print(i + " ");
            }
            System.out.println("}");

            int i = 0;
            do {
                if (tab[i] == 1) {
                    tab[i] = 0;
                    i++;
                } else {
                    tab[i] = 1;
                    break;
                }
            } while (true);
        }

        plecak();
        kosmos();
    }

    public static void plecak() {
        // Decyzyjny problem plecakowy
        System.out.println("\n\n\nDecyzyjny problem plecakowy");
        int pojemnośćPlecaka = 10; // Pojemność plecaka
        int[] objętośćPrzedmiotów = {6, 2, 3, 2, 3, 1}; // Objętości przedmiotów
        int[] wartośćPrzedmiotów = {6, 4, 5, 7, 10, 2}; // Wartości przedmiotów

        int N = 6; // ilość przedmiotów
        int[] tab = new int[N + 1];
        int s = (int) Math.pow(2, N);

        int[] najlepszyPlecak = new int[N];
        int najlepszaWartość = 0;

        for (int l = 0; l < s; l++) {
            int lokalnaWartość = 0; // Objętość próby
            int lokalnaObjętość = 0; // Wartość próby
            for (int i = 0; i < N; i++) {
                if (tab[i] == 1) {
                    lokalnaObjętość += objętośćPrzedmiotów[i];
                    lokalnaWartość += wartośćPrzedmiotów[i];
                }
            }

            if (lokalnaObjętość <= pojemnośćPlecaka) {
                if (lokalnaWartość > najlepszaWartość) {
                    najlepszaWartość = lokalnaWartość;
                    System.arraycopy(tab, 0, najlepszyPlecak, 0, N);
                }
            }

            int i = 0;
            do {
                if (tab[i] == 1) {
                    tab[i] = 0;
                    i++;
                } else {
                    tab[i] = 1;
                    break;
                }
            } while (true);
        }

        System.out.println("Najbardziej opłacalne wypełnienie plecaka to przedmioty o indeksach:");
        System.out.print("{ ");
        for (int i = 0; i < N; i++) {
            if (najlepszyPlecak[i] == 1) System.out.print(i + " ");
        }
        System.out.println("}");
        System.out.println("Ten plecak jest wart " + najlepszaWartość);
    }

    public static void kosmos() {
        // Problem doboru załogi statku kosmicznego
        System.out.println("\n\n\nProblem doboru załogi statku kosmicznego");
        int[][] kosmonauci = { // Tabela umiejętności wiersze-kosmonauci; kolumny-dziedziny
                {1, 0, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1}
        };

        int N = 5; // ilość kosmonautów
        int D = 4; // ilość dziedzin
        int[] tab = new int[N + 1];
        int s = (int) Math.pow(2, N);

        int[] najlepszyStatek = new int[N];
        int najlepszyLicznik = N;

        for (int l = 0; l < s; l++) {
            int[] status = new int[D];
            int licznik = 0;
            boolean wszystko = true;

            for (int i = 0; i < N; i++) {
                if (tab[i] == 1) {
                    licznik++;
                    for (int j = 0; j < D; j++) {
                        if (status[j] == 0 && kosmonauci[i][j] == 1) {
                            status[j] = 1;
                        }
                    }
                }
            }

            for (int i = 0; i < D; i++) {
                if (status[i] == 0) {
                    wszystko = false;
                    break;
                }
            }

            if (wszystko && (najlepszyLicznik >= licznik)) {
                System.arraycopy(tab, 0, najlepszyStatek, 0, N);
                najlepszyLicznik = licznik;
            }

            int i = 0;
            do {
                if (tab[i] == 1) {
                    tab[i] = 0;
                    i++;
                } else {
                    tab[i] = 1;
                    break;
                }
            } while (true);
        }

        System.out.println("Najlepiej, aby polecieli: ");
        for (int i = 0; i < N; i++) {
            if (najlepszyStatek[i] == 1) System.out.println("Kosmonauta nr " + (i + 1));
        }
    }
}
