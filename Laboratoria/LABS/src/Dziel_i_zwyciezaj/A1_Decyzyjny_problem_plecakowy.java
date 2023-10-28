package Dziel_i_zwyciezaj;

public class A1_Decyzyjny_problem_plecakowy {

    final static int[] objetosci = {6, 2, 3, 2, 3, 1};
    final static int[] wartosci = {6, 4, 5, 7, 10, 2};
    final static int MAX = 10;
    final static int przedmioty = objetosci.length;

    public static int plecak(int i, int obj) {
        if (i==0 && obj<objetosci[i]) return 0;
        if (i==0 && obj>=objetosci[i]) return wartosci[i];
        if (i>0 && obj<objetosci[i]) return plecak(i-1, obj);
        return Math.max(plecak(i-1,obj), wartosci[i]+plecak(i-1, obj-objetosci[i]));
    }

    public static void main(String[] args) {
        System.out.println("Najlepsza wartosc plecaka: " + plecak(przedmioty-1, MAX));
    }
}
