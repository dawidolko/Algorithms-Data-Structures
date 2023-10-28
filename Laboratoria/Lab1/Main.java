public class Main {
    public static void main(String[] args) {

        //METODA BRUTALNEJ SIŁY
        
        //Wyszukiwanie trojek pitagorejskich
        System.out.println("Wyszukiwanie trojek pitagorejskich");
        int a, b, c, counterA = 0, counterB = 0, counterC = 0, counter = 0;
        int par = 20;

        for (a = 1; a<=par; a++) {
            counterA++;
            for (b = a+1; b<=par; b++) {
                counterB++;
                for (c = b+1; c <= par; c++) {
                    counterC++;
                    if (a*a + b*b == c*c) {
                        counter++;
                        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                    }
                }
            }
        }

        System.out.println("Ilosc trojek: " + counter);
        System.out.println("Wykonania pętli(kolejno): " + counterA + " " + counterB + " " + counterC);



        //Wypisywanie podzbiorow zbioru o mocy N
        //Pierwsza metoda (mniej efektywna)
        System.out.println("\n\n\nWypisywanie podzbiorow zbioru o mocy N");
        System.out.println("Pierwsza metoda (mniej efektywna)");
        int b1,b2,b3,b4,b5;
        for (b1 = 0; b1 <= 1; b1++)
            for (b2 = 0; b2 <= 1; b2++)
                for (b3 = 0; b3 <= 1; b3++)
                    for (b4 = 0; b4 <= 1; b4++)
                        for (b5 = 0; b5 <= 1; b5++)
                    {
                        System.out.print("{ ");
                        if (b1 == 1) System.out.print("1 ");
                        if (b2 == 1) System.out.print("2 ");
                        if (b3 == 1) System.out.print("3 ");
                        if (b4 == 1) System.out.print("4 ");
                        if (b5 == 1) System.out.print("5 ");
                        System.out.println("}");
                    }

        //Druga metoda (bardziej efektywna)
        System.out.println("\nDruga metoda (bardziej efektywna)");
        int N = 3; //moc zbioru
        int [] tab = new int[N+1];
        int s = (int)Math.pow(2, N);

        for (int l = 1; l<=s; l++) {
            System.out.print("{ ");
            for (int i=1; i<=N; i++) {
                if (tab[i-1]==1) System.out.print(i + " ");
            }
            System.out.println("}");

            int i = 0;
            do {
                if (tab[i]==1) {
                    tab[i]=0;
                    i++;
                } else {
                    tab[i]=1;
                    break;
                }
            } while (true);
        }

        backpack();
        cosmos();
    }




    public static void backpack() {
        //Decyzyjny problem plecakowy
        System.out.println("\n\n\nDecyzyjny problem plecakowy");
        int backpackVolume = 10; //Objetosc plecaka
        int[] volumeOfItems = {6, 2, 3, 2, 3, 1}; //Objetosci przedmiotow
        int[] valueOfItems = {6, 4, 5, 7, 10, 2}; //Wartosci przedmiotow

        int N = 6; //ilosc przedmiotow
        int[] tab = new int[N+1];
        int s = (int)Math.pow(2,N);

        int[] bestBackpack = new int[N];
        int bestValue = 0;

        for (int l=0; l<s; l++) {
            int localValue = 0; //Objetosc proby
            int localVolume = 0; //Wartosc proby
            for (int i=0;i<N;i++) {
                if (tab[i]==1) {
                    localVolume += volumeOfItems[i];
                    localValue += valueOfItems[i];
                }
            }

            if (localVolume<=backpackVolume) {
                if (localValue > bestValue) {
                    bestValue = localValue;
                    System.arraycopy(tab, 0, bestBackpack, 0, N);
                }
            }

            int i = 0;
            do {
                if (tab[i]==1) {
                    tab[i] = 0;
                    i++;
                } else {
                    tab[i] = 1;
                    break;
                }
            } while (true);
        }

        System.out.println("Najbardziej lukratywne wypelnienie plecaka to przedmioty o indeksach:");
        System.out.print("{ ");
        for (int i=0; i<N; i++) {
            if (bestBackpack[i] == 1) System.out.print(i + " ");
        }
        System.out.println("}");
        System.out.println("Ten plecak jest warty " + bestValue);
    }




    public static void cosmos() {
        //Problem doboru zalogi statku kosmicznego
        System.out.println("\n\n\nProblem doboru zalogi statku kosmicznego");
        int[][] cosmonauts = { //Tabela umiejetnosci wiersze-kosmonauci; kolumny-dziedziny
                {1, 0, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1}
        };

        int N = 5; //ilosc kosmonautow
        int D = 4; //ilosc dziedzin
        int[] tab = new int[N+1];
        int s = (int)Math.pow(2,N);

        int[] bestShip = new int[N];
        int bestCounter = N;

        for (int l=0; l<s; l++) {
            int[] status = new int[D];
            int counter = 0;
            boolean everything = true;

            for (int i=0; i<N;i++) {
                if (tab[i]==1) {
                    counter++;
                    for (int j=0;j<D;j++) {
                        if (status[j]==0 && cosmonauts[i][j]==1) {
                            status[j]=1;
                        }
                    }
                }
            }

            for (int i = 0; i<D; i++) {
                if (status[i]==0) {
                    everything = false;
                    break;
                }
            }

            if (everything && (bestCounter >= counter)) {
                System.arraycopy(tab,0,bestShip,0,N);
                bestCounter = counter;
            }

            int i=0;
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
        for (int i=0;i<N;i++) {
            if (bestShip[i]==1) System.out.println("Kosmonauta nr " + (i+1));
        }
    }
}