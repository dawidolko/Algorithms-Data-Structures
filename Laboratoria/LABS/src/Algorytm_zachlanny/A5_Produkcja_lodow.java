package Algorytm_zachlanny;

public class A5_Produkcja_lodow {
    public static void main(String[] args) {
        final int[][] koszty = {
                {0, 7, 20, 21, 12, 23},
                {27, 0, 13, 16, 46, 5},
                {53, 15, 0, 25, 27, 6},
                {16, 2, 35, 0, 47, 10},
                {31, 29, 5, 18, 0, 4},
                {28, 24, 1, 17, 5, 0}
        };

        //Zachlannie po najmnijeszym koszcie zmiany
        boolean[] wykorzystane = new boolean[koszty.length];

        int wiersz=0;
        int tempmin = Integer.MAX_VALUE;
        for (int i=0;i<koszty.length;i++) {
            for (int j=0;j<koszty.length;j++) {
                if (koszty[i][j]<tempmin && koszty[i][j]>0) {
                    wiersz=i;
                }
            }
        }
        wykorzystane[wiersz] = true;
        int tempwiersz = wiersz;

        System.out.print("Kolejnosc: " + (wiersz+1) + " ");
        int suma = 0;
        int i = 0;
        while (true) {
            int pozycja = -1;
            int min = Integer.MAX_VALUE;

            if (i<koszty.length) {
                for(int j=0;j<koszty[wiersz].length;j++) {
                    if (koszty[wiersz][j]<=min && koszty[wiersz][j]>0 && !wykorzystane[j]) {
                        pozycja = j;
                        min = koszty[wiersz][j];
                    }
                }

                if (pozycja>-1) {
                    System.out.print((pozycja+1) + " ");
                    suma += koszty[wiersz][pozycja];
                    wiersz=pozycja;
                    wykorzystane[pozycja] = true;
                } else break;

                i++;
            }
        }

        suma += koszty[wiersz][tempwiersz];

        System.out.println(" " + tempwiersz + "\nSuma kosztow to " + suma);
    }
}
