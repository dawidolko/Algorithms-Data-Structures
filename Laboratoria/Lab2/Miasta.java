public class Miasta {

    public static void main(String [] args) {
        // Problem najkrótszej drogi

        podróż(0);

        System.out.println("Najlepsza trasa z Warszawy do Sofii prowadzi przez " + najlepszaTrasa + " i ma długość " + najlepszaOdległość + " km.");
    }

    static String[] miasta = {"Warszawa", "Katowice", "Zakopane", "Lwów", "Wiedeń", "Budapeszt", "Bukareszt", "Zagrzeb", "Sofia"};

    final static int[][] odległości = {
            {0, 300, 402, 356, -1, -1, -1, -1, -1},
            {300, 0, -1, -1, 440, 474, -1, -1, -1},
            {402, -1, 0, -1, -1, 330, -1, -1, -1},
            {356, -1, -1, 0, -1, -1, 823, -1, -1},
            {-1, 440, -1, -1, 0, -1, -1, 430, -1},
            {-1, 474, 330, -1, -1, 0, 813, 365, 774},
            {-1, -1, -1, 823, -1, 813, 0, -1, 403},
            {-1, -1, -1, -1, 430, 365, -1, 0, 768},
            {-1, -1, -1, -1, -1, 774, 403, 768, 0}
    };

    static int liczbaMiast = odległości.length;
    static int[] L = new int[liczbaMiast];

    static int najlepszaOdległość = Integer.MAX_VALUE;
    static String najlepszaTrasa = "";


    static void podróż(int i) {
        int lokalnaOdległość = 0;
        int status = 0;
        String Trasa = "";
        boolean czyMożeszDotrzeć = true;

        if (i==liczbaMiast) {
            for (int j=0;j<liczbaMiast-1;j++) {

                if (odległości[L[j]][L[j + 1]]!=-1) {
                    if (L[j] == 0 || L[j] == 8) status++;

                    if (status == 1) {
                        lokalnaOdległość += odległości[L[j]][L[j + 1]];
                        if (L[j] != 0) Trasa += (miasta[L[j]] + " ");
                    }
                } else czyMożeszDotrzeć = false;
            }

            if (lokalnaOdległość <= najlepszaOdległość && czyMożeszDotrzeć) {
                najlepszaOdległość = lokalnaOdległość;
                najlepszaTrasa = Trasa;
            }

        } else {
            for (int j = 0; j < liczbaMiast; j++) {
                int k;
                for (k = 0; k < i; k++) if (L[k] == j) break;
                if (k == i) {
                    L[k] = j;
                    podróż(i + 1);
                }
            }
        }
    }
}
