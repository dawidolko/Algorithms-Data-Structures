package Dziel_i_zwyciezaj;

public class A20_Populacja_krolikow {

    static boolean sto, tysiac, diesiectys, milion;


    public static int zliczaj(int n) {
        if (n==1 || n==2) return 1;
        int kroliki = zliczaj(n-1) + zliczaj(n-2);

        if (kroliki > 100 && !sto) {
            System.out.println("Sto: " + n);
            sto = true;
        }

        if (kroliki > 1000  && !tysiac) {
            System.out.println("Tysiac: " + n);
            tysiac=true;
        }

        if (kroliki > 10000  && !diesiectys) {
            System.out.println("Dziesiec tysiecy: " + n);
            diesiectys=true;
        }

        if (kroliki > 1000000  && !milion) {
            System.out.println("Milion: " + n);
            milion=true;
        }

        return kroliki;
    }

    public static void main(String[] args) {
        final int N = 40;
        zliczaj(N);
    }
}
