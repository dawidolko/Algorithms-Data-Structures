package Dziel_i_zwyciezaj;

public class A23_Przebieg_epidemii {

    //NIE DZIAŁA

    final static int MAX = 100000;
    static int chorych = 10;
    static int zdrowych = MAX-chorych;
    static int odpornych = 0;
    static int dzien = 0;
    static int[] chorzy = new int[50];
    static int[] ozdrowialych = new int[50];

    public static int choruj(int chorych, int dzien) {
        chorzy[dzien] = chorych;
        zdrowych -= chorzy[dzien];

        //uzupełniamy dany na kolejny dzień, ludzie sobie zdrowieją
        if (dzien>6) {
            ozdrowialych[dzien] = chorzy[dzien-7];
            chorzy[dzien] = chorzy[dzien]-chorzy[dzien-7];
        }

        //Zliczamy ilosc obecnie odpornych(maksymalnie 14dni wstecz, bo wtedy znowu można zachorowac)
        odpornych = 0;
        if (dzien<14) {
            for(int i=dzien;i<0;i--) {
                odpornych += ozdrowialych[i];
            }
        }
        if (dzien>=14) {
            for(int i=dzien;i<dzien-14;i--) {
                odpornych += ozdrowialych[i];
            }
        }

        if (chorzy[dzien]*3 >= zdrowych+odpornych) {
            System.out.println("Dnie: " + dzien + " Chorzy: " + chorych + " Ludzie: " + zdrowych + " Odporni: " + odpornych);
            System.out.println("Liczba: " + (chorych + zdrowych + odpornych));
            System.out.println("Ilość chorych postęp:");
            for (int i = 0; i < chorzy.length; i++) {
                System.out.print("["+chorzy[i]+"] ");
            }
            System.out.println();
            return dzien;
        } else return choruj(chorzy[dzien]*3, dzien + 1);
    }

    public static void main(String[] args) {
        choruj(chorych, dzien);
    }
}
