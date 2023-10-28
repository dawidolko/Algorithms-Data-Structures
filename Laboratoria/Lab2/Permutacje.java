public class Permutacje {
    public static void main() {
        //Wypisywanie permutacji zbioru

        permutacje(0);
    }

    final static int N = 4;
    static int[] l = new int[N];

    static void permutacje(int i) {
        if (i == N) {
            for (int j = 0; j < N; j++) System.out.print(l[j] + " ");
            System.out.println();
        } else {
            for (int j = 1; j <= N; j++) {
                int k;
                for (k = 0; k < i; k++) if (l[k] == j) break;
                if (k == i) {
                    l[k] = j;
                    permutacje(i + 1);
                }
            }
        }
    }
}

