package asd_lab_2;

public class PermutacjeDebug {

    final static int N = 3; // permutacje n-elementowe
    private static int[] L = new int[N];

    public static void main(String[] args) {
        permutacje(0);
    }

    static void permutacje(int i) {
        System.out.println("permutacje(" + i + ") - START");
        if (i == N) {
            System.out.print(">>> PERMUTACJA: ");
            for (int j = 0; j < N; j++) {
                System.out.print(L[j] + " ");
            }
            System.out.println();
        } else {
            for (int j = 1; j <= N; j++) // j - element do wstawienia do tablicy
            {
                System.out.println(" j = " + j);
                int k; // index tablicy (miejsce wstawienia wartosci j)
                for (k = 0; k < i; k++) {
                    System.out.println("  k = " + k);
                    if (L[k] == j) {
                        System.out.println("  break");
                        break;
                    }
                }
                if (k == i) {
                    L[k] = j;
                    System.out.println("L[k] = j : L[" + k + "]=" + j);
                    permutacje(i + 1);
                }
            }
        }
        System.out.println("permutacje(" + i + ") - KONIEC");
    }
}
