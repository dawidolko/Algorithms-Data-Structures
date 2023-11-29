package asd_lab_1;

class PlecakDecWyp {
    final static int N = 6;     // liczba wszystkich przedmiotów
    final static int MAX_V = 10; // objetosc plecaka
    final static int[] V = {6, 2, 3, 2, 3, 1}; // objetosci przedmiotow
    final static int[] W = {6, 4, 5, 7, 10, 2}; // wartosci przedmiotow

    static class Plecak {
        int wartosc;
        int[] zawartosc = new int[N];
    }

    public static void main(String[] args) {
        Plecak p = P(N - 1, MAX_V);
        System.out.println("Wartosc plecaka: " + p.wartosc);
        System.out.print("Przedmioty w plecaku: ");
        for (int i = 0; i < N; i++) {
            if (p.zawartosc[i] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static Plecak P(int i, int v) {
        if (i < 0 || v <= 0) {
            Plecak p = new Plecak();
            p.wartosc = 0;
            return p;
        }

        Plecak p1 = P(i - 1, v); // plecak, gdy nie bierzemy i-tego przedmiotu

        if (V[i] > v) {
            return p1;
        }

        Plecak p2 = P(i - 1, v - V[i]); // plecak, gdy bierzemy i-ty przedmiot

        p2.zawartosc[i] = 1;
        p2.wartosc += W[i];

        if (p2.wartosc > p1.wartosc) {
            return p2;
        } else {
            return p1;
        }
    }
}

