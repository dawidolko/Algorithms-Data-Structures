import java.util.Random;

public class Main {

    private static final int[][] CZASY = {
            {0, 7, 20, -1, 12, 23},
            {27, 0, 13, 16, -1, 5},
            {53, -1, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, -1},
            {31, 29, -1, 18, 0, 4},
            {-1, 24, 1, 17, 5, 0}
    };

    private static final int LICZBA_PROBEK = 100;

    public static void main(String[] args) {
        int najkrotszyCzas = Integer.MAX_VALUE;
        int[] najlepszaPermutacja = new int[6];
        Random rand = new Random();

        for (int p = 0; p < LICZBA_PROBEK; p++) {
            int[] permutacja = losujPermutacje(rand);

            int czas = 0;
            boolean isValid = true;

            for (int i = 0; i < 5; i++) {
                if (CZASY[permutacja[i]][permutacja[i + 1]] == -1) {
                    isValid = false;
                    break;
                }
                czas += CZASY[permutacja[i]][permutacja[i + 1]];
            }

            if (isValid && czas < najkrotszyCzas) {
                najkrotszyCzas = czas;
                System.arraycopy(permutacja, 0, najlepszaPermutacja, 0, 6);
            }
        }

        System.out.print("Najlepsza kolejność produkcji: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(najlepszaPermutacja[i] + 1 + " ");
        }
        System.out.println("\nCałkowity czas przestawienia: " + najkrotszyCzas);
    }

    private static int[] losujPermutacje(Random rand) {
        int[] permutacja = {0, 1, 2, 3, 4, 5};
        for (int i = 5; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = permutacja[index];
            permutacja[index] = permutacja[i];
            permutacja[i] = temp;
        }
        return permutacja;
    }
}
