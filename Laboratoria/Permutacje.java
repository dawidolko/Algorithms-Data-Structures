package asd_lab_2;

public class Permutacje {

    final static int N =3; // permutacje n-elementowe
    private static int[] l = new int[N];

    public static void main(String[] args) {
        permutacje(0);
    }

    static void permutacje(int i) {
        if (i == N) {
            for (int j = 0; j < N; j++) {
                System.out.print(l[j] + " ");
            }
            System.out.println();
        } else {
            for (int j = 1; j <= N; j++) {
                int k;
                for (k = 0; k < i; k++) {
                    if (l[k] == j) {
                        break;
                    }
                }
                if (k == i) {
                    l[k] = j;
                    permutacje(i + 1);
                }
            }
        }
    }
}
