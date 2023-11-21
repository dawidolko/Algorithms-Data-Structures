import java.util.Random;

public class kolokwiumLody {

    public static void main(String[] args) {
        wykonajSymulacje();
    }

    private static void wykonajSymulacje() {
        final int[][] czasy = {
                {0, 7, 20, -1, 12, 23},
                {27, 0, 13, 16, -1, 5},
                {53, -1, 0, 25, 27, 6},
                {16, 2, 35, 0, 47, -1},
                {31, 29, -1, 18, 0, 4},
                {-1, 24, 1, 17, 5, 0}
        };

        StringBuilder lody = new StringBuilder();
        StringBuilder lodyNajlepsze = new StringBuilder();
        int czasProdukcjiNajlepszy = Integer.MAX_VALUE;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int czasProdukcji = 0;
            int[] uzyteLodyTab = new int[]{-1, -1, -1, -1, -1, -1};
            int uzyteLody = 0;
            lody = new StringBuilder();

            while (uzyteLody != 6) {
                int jakaMaszyna = random.nextInt(6);
                boolean czyMozna = true;
                for (int k = 0; k < uzyteLody; k++) {
                    if (uzyteLodyTab[k] == jakaMaszyna) {
                        czyMozna = false;
                        break;
                    }
                }
                if (czyMozna) {
                    uzyteLodyTab[uzyteLody] = jakaMaszyna;
                    lody.append(jakaMaszyna + 1).append(", ");
                    uzyteLody++;
                }
            }

            for (int j = 0; j < czasy.length - 1; j++) {
                if (czasy[uzyteLodyTab[j]][uzyteLodyTab[j + 1]] > 0) {
                    czasProdukcji += czasy[uzyteLodyTab[j]][uzyteLodyTab[j + 1]];
                } else {
                    czasProdukcji = Integer.MAX_VALUE;
                    break;
                }
            }

            if (czasProdukcji != Integer.MAX_VALUE && czasy[uzyteLodyTab[5]][uzyteLodyTab[0]] > 0) {
                czasProdukcji += czasy[uzyteLodyTab[5]][uzyteLodyTab[0]];
            } else {
                czasProdukcji = Integer.MAX_VALUE;
            }

            if (czasProdukcji < czasProdukcjiNajlepszy) {
                czasProdukcjiNajlepszy = czasProdukcji;
                lodyNajlepsze = new StringBuilder(lody);
            }
        }

        System.out.println("Wykorzystane lody: " + lodyNajlepsze+" i wraca do smaku jaki był na początku.");
        System.out.println("Minimalny czas produkcji: " + czasProdukcjiNajlepszy);
    }
}
