import java.util.Random;

public class kolokwiumLody {

    public static void main(String[] args) {
        int[][] kosztyPrzestawienia = {
                {0, 7, 20, -1, 12, 23},
                {27, 0, 13, 16, -1, 5},
                {53, -1, 0, 25, 27, 6},
                {16, 2, 35, 0, 47, -1},
                {31, 29, -1, 18, 0, 4},
                {-1, 24, 1, 17, 5, 0}
        };

        String wynik = znajdzOptymalnaKolejnoscProdukcji(kosztyPrzestawienia, 100);
        System.out.println(wynik);
    }

    public static String znajdzOptymalnaKolejnoscProdukcji(int[][] kosztyPrzestawienia, int liczbaProb) {
        Random rand = new Random();
        int minSuma = Integer.MAX_VALUE;
        String najlepszeRozwiazanie = "";

        for (int i = 0; i < liczbaProb; i++) {
            int suma = 0;
            String rozwiazanie = "";
            int[] odwiedzone = new int[kosztyPrzestawienia.length];
            int aktualnySmak = rand.nextInt(kosztyPrzestawienia.length);
            odwiedzone[aktualnySmak] = 1;
            rozwiazanie += (aktualnySmak + 1) + " ";

            for (int j = 1; j < kosztyPrzestawienia.length; j++) {
                int index = -1;
                do {
                    index = rand.nextInt(kosztyPrzestawienia.length);
                } while (odwiedzone[index] == 1);

                if (kosztyPrzestawienia[aktualnySmak][index] == -1) {
                    suma = Integer.MAX_VALUE;
                    break;
                }
                suma += kosztyPrzestawienia[aktualnySmak][index];
                aktualnySmak = index;
                odwiedzone[aktualnySmak] = 1;
                rozwiazanie += (aktualnySmak + 1) + " ";
            }

            if (suma < minSuma) {
                minSuma = suma;
                najlepszeRozwiazanie = rozwiazanie;
            }
        }

        return "Najlepsza kolejność produkcji to: " + najlepszeRozwiazanie.trim() +
                "\nMinimalny łączny czas przestawienia: " + (minSuma);
    }
}
