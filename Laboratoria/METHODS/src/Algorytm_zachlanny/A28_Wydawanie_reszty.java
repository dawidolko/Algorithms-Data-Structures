package Algorytm_zachlanny;

public class A28_Wydawanie_reszty {
    public static void main(String[] args) {
        final int[] nominaly = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] pozostalo = {1, 2, 0, 2, 1, 4, 2, 1, 1}; // Ilości poszczególnych monet
        int[] zabrane = new int[9];
        final double RESZTA = 9.99;
        int wgroszach = (int)(RESZTA * 100);

        int i = 0;
        while (true) {
            if (i < 9) {
                if (wgroszach - nominaly[i] >= 0 && pozostalo[i] > 0) {
                    pozostalo[i]--;
                    zabrane[i]++;
                    wgroszach -= nominaly[i];
                } else {
                    i++;
                }
            } else {
                break;
            }
        }

        System.out.println("Wydane monety:");
        for (i = 0; i < nominaly.length; i++) {
            int zlotowki = nominaly[i] / 100;
            int grosze = nominaly[i] % 100;
            System.out.println(zlotowki + " zł " + grosze + " gr \t" + zabrane[i]);
        }

        if (wgroszach > 0) {
            System.out.println("Nie udało się wydać całej reszty, zostało " + wgroszach + " gr");
        } else {
            System.out.println("Udało się wydać całą resztę");
        }
    }
}
