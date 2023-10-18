package asd_lab_1;

class PlecakDec {
    final static int N = 6;     // liczba przedmiotów
    final static int MAX_V = 10; // objetość plecaka
    final static int[] V = {6, 2, 3, 2, 3, 1}; // objetości przedmiotów
    final static int[] W = {6, 4, 5, 7, 10, 2}; // wartości przedmiotów

    static int P(int i, int v) {
        if (i < 0 || v <= 0) {
            return 0;
        }

        int w1 = P(i - 1, v); // wartość, gdy nie bierzemy i-tego przedmiotu

        if (V[i] > v) {
            return w1;
        }

        int w2 = W[i] + P(i - 1, v - V[i]); // wartość, gdy bierzemy i-ty przedmiot

        return Math.max(w1, w2);
    }

    public static void main(String[] args) {
        System.out.println("Wartość przedmiotów: " + P(N - 1, MAX_V));
    }
}


