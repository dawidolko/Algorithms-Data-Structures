package Algorytm_zachlanny;

public class A1_Decyzyjny_problem_plecakowy {

    final static int[] objetosci = {6, 2, 3, 2, 3, 1};
    final static int[] wartosci = {6, 4, 5, 7, 10, 2};
    final static int MAX = 10;
    final static int przedmioty = objetosci.length;

    public static void main(String[] args) {
        poObjetosci();
        poWartosci();
        poWspolczynniku();
    }

    public static void poObjetosci() {

        boolean[] tab = new boolean[przedmioty];
        for (boolean e : tab) e = false;

        int objetosc = 0;
        int wartosc = 0;

        while (true) {
            int najmniejszaObjetosc = Integer.MAX_VALUE;
            int pozycja = -1;

            for (int i=0;i<przedmioty;i++) {
                if (!tab[i] && objetosc+objetosci[i]<=MAX && objetosci[i]<najmniejszaObjetosc) {
                    najmniejszaObjetosc = objetosci[i];
                    pozycja = i;
                }
            }

            if (pozycja>-1) {
                tab[pozycja] = true;
                wartosc += wartosci[pozycja];
                objetosc += objetosci[pozycja];
            } else break;
        }

        System.out.print("Przedmioty: ");
        for (int i=0;i<przedmioty;i++) if (tab[i]) System.out.print(i + " ");
        System.out.println("\tWartosc: " + wartosc);
    }

    public static void poWartosci() {
        boolean[] tab = new boolean[przedmioty];
        for (boolean e : tab) e = false;

        int objectosc = 0;
        int wartosc = 0;

        while (true) {
            int pozycja=-1;
            int maksymalnaWartosc = Integer.MIN_VALUE;

            for (int i=0;i<przedmioty;i++) {
                if (!tab[i] && wartosci[i]>maksymalnaWartosc && objetosci[i]+objectosc<=MAX) {
                    maksymalnaWartosc = wartosci[i];
                    pozycja = i;
                }
            }

            if (pozycja>-1) {
                tab[pozycja] = true;
                wartosc += wartosci[pozycja];
                objectosc += objetosci[pozycja];
            } else break;
        }

        System.out.print("Przedmioty: ");
        for (int i=0;i<przedmioty;i++) if (tab[i]) System.out.print(i + " ");
        System.out.println("\tWartosc: " + wartosc);
    }

    public static void poWspolczynniku() {
        boolean[] tab = new boolean[przedmioty];
        for (boolean e : tab) e = false;

        double[] wspolczynniki = new double[przedmioty];
        for (int i=0;i<przedmioty;i++) wspolczynniki[i] = wartosci[i]/objetosci[i];

        int wartosc=0;
        int objetosc=0;

        while(true) {
            int pozycja = -1;
            double najWspolczynnik = Double.MIN_VALUE;

            for (int i=0;i<przedmioty;i++) {
                if (!tab[i] && najWspolczynnik<wspolczynniki[i] && objetosc+objetosci[i]<=MAX) {
                    pozycja = i;
                    najWspolczynnik=wspolczynniki[i];
                }
            }

            if (pozycja>-1) {
                wartosc += wartosci[pozycja];
                objetosc += objetosci[pozycja];
                tab[pozycja] = true;
            } else break;
        }

        System.out.print("Przedmioty: ");
        for (int i=0;i<przedmioty;i++) if (tab[i]) System.out.print(i+" ");
        System.out.println("\tWartosci: " + wartosc);
    }
}
