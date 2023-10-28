package Algorytm_zachlanny;

public class A4_Dobor_zalogi_statku {
    public static void main(String[] args) {
        final int[][] kosmonauci = {
                {1, 0, 0, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1}
        };

        //Zachlannie po iloscie dziedzin znanych przez astronautow
        final int[] sumaDziedzin = new int[kosmonauci.length];
        boolean[] poleca = new boolean[kosmonauci.length];
        boolean[] zaliczoneDziedziny = new boolean[kosmonauci[0].length];
        int i = 0;
        for (int[] e : kosmonauci) {

            for (int f : e) {
                sumaDziedzin[i] += f;
            }
            i++;
        }

        i=0;
        while (true) {
            int pozycja = -1;
            int max = Integer.MIN_VALUE;
            if (i<5) {
                if (sumaDziedzin[i]>=max && !poleca[i]) {
                    pozycja = i;
                    max = sumaDziedzin[i];
                }

                if (pozycja > -1) {
                    poleca[pozycja] = true;

                    for (int j = 0; j < zaliczoneDziedziny.length; j++) {
                        if (kosmonauci[pozycja][j] == 1) zaliczoneDziedziny[j] = true;
                    }
                }

                boolean czyZaliczone = true;
                for (boolean e : zaliczoneDziedziny) if (!e) czyZaliczone = false;

                if (czyZaliczone) break;
                else i++;
            }
        }

        System.out.print("Moga poleciec: ");
        for (i=0;i<kosmonauci.length;i++) if (poleca[i]) System.out.print(i+1 + " ");
    }
}
