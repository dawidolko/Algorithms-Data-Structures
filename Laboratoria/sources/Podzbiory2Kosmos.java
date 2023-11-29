package asd_lab_1;

public class Podzbiory2Kosmos {

    public static void main(String[] args) {

        int[][] kosmonauci = {{1, 0, 0, 1, 0}, //A
                              {0, 1, 1, 1, 0}, //B
                              {0, 0, 1, 0, 1}, //C
                              {1, 1, 0, 0, 1}}; //D
        String podzbior = "{";
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int ile=0;
        int ileMax=Integer.MAX_VALUE;

        final int N = kosmonauci[0].length; // moc zbioru
        int[] tab = new int[N + 1];
        int s = (int) Math.pow(2, N);
        for (int l = 0; l < s; l++) {
            for (int i = 0; i < N; i++) {
                
                if (tab[i] == 1) {
                    a += kosmonauci[0][i];
                    b += kosmonauci[1][i];
                    c += kosmonauci[2][i];
                    d += kosmonauci[3][i];
                    podzbior = podzbior + " " + (i+1);
                    ile++;
                }
            }

            if (a>0 && b>0 && c>0 && d>0 && ile<=ileMax) {
                System.out.println(podzbior + "}");
                ileMax=ile;
            }

            podzbior = "{";
            a=0;
            b=0;
            c=0;
            d=0;
            ile=0;

            int i = 0;
            do {
                if (tab[i] == 1) {
                    tab[i] = 0;
                    i++;
                } else {
                    tab[i] = 1;
                    break;
                }
            } while (true);
        }
    }
}
