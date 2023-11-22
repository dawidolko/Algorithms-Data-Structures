import java.util.Random;

public class Main {

    public static void main(String[] args) {
        przeprowadzSymulacje();
    }

    private static void przeprowadzSymulacje() {
        final int[][] czasPrzerobki = {
                {0, 7, 20, -1, 12, 23},
                {27, 0, 13, 16, -1, 5},
                {53, -1, 0, 25, 27, 6},
                {16, 2, 35, 0, 47, -1},
                {31, 29, -1, 18, 0, 4},
                {-1, 24, 1, 17, 5, 0}
        };

        String smaki = "";
        String najlepszaKombinacja = "";
        int optymalnyCzas = Integer.MAX_VALUE;
        Random losowy = new Random();

        for (int i = 0; i < 100; i++) {
            int czasPracy = 0;
            int[] wybraneSmaki = new int[]{-1, -1, -1, -1, -1, -1};
            int liczbaWybranychSmakow = 0;
            smaki = "";

            while (liczbaWybranychSmakow != 6) {
                int wybranySmak = losowy.nextInt(6);
                boolean moznaDodac = true;
                for (int j = 0; j < liczbaWybranychSmakow; j++) {
                    if (wybraneSmaki[j] == wybranySmak) {
                        moznaDodac = false;
                        break;
                    }
                }
                if (moznaDodac) {
                    wybraneSmaki[liczbaWybranychSmakow] = wybranySmak;
                    smaki += (wybranySmak + 1) + ", ";
                    liczbaWybranychSmakow++;
                }
            }

            for (int j = 0; j < czasPrzerobki.length - 1; j++) {
                if (czasPrzerobki[wybraneSmaki[j]][wybraneSmaki[j + 1]] > 0) {
                    czasPracy += czasPrzerobki[wybraneSmaki[j]][wybraneSmaki[j + 1]];
                } else {
                    czasPracy = Integer.MAX_VALUE;
                    break;
                }
            }

            if (czasPracy != Integer.MAX_VALUE && czasPrzerobki[wybraneSmaki[5]][wybraneSmaki[0]] > 0) {
                czasPracy += czasPrzerobki[wybraneSmaki[5]][wybraneSmaki[0]];
            } else {
                czasPracy = Integer.MAX_VALUE;
            }

            if (czasPracy < optymalnyCzas) {
                optymalnyCzas = czasPracy;
                najlepszaKombinacja = smaki;
            }
        }

        System.out.println("Wybrane smaki: " + najlepszaKombinacja);
        System.out.println("Optymalny czas produkcji: " + optymalnyCzas);
    }
}
