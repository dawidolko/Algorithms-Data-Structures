package asd_lab_1;

public class A2 {

    public static void main(String[] args) {

        int[][] przedmioty = {{6, 2, 3, 2, 3, 1},
        {6, 4, 5, 7, 10, 2}};
        int vMax = 10; // maxymalna dopuszczalna objetosc
        int wMax = 0; // poczatkowy stan maksymalnej wartosci przedmiotow
        int vAktual = 0; // objetosc obliczana na biezaco dla danej kombinacji przedmiotow
        int wAktual = 0; // wartosc przedmiotow obliczana na biezaco dla danego podzbioru
        String podzbior = "{";

        final int N = przedmioty[0].length; // moc zbioru
        int[] tab = new int[N + 1];
        int s = (int) Math.pow(2, N);
        for (int l = 0; l < s; l++) {
            for (int i = 0; i < N; i++) {
                
                if (tab[i] == 1) {
                    vAktual = vAktual + przedmioty[0][i];
                    wAktual = wAktual + przedmioty[1][i];
                    podzbior = podzbior + " " + i;
                }
            }

            if (vAktual <= vMax && wAktual >= wMax) {
                wMax = wAktual;
                System.out.println(podzbior + "} v = " + vAktual + " w = " + wAktual);
            }
            vAktual = 0;
            wAktual = 0;
            podzbior = "{";

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
