public class Main {

    static int[][] czasy = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}
    };

    static int minimalnyCzas = Integer.MAX_VALUE;
    static int[] optymalnaKolejnosc = new int[7];
    static int[] aktualnaKolejnosc = new int[7];
    static boolean[] odwiedzone = new boolean[6];

    public static void main(String[] args) {
        aktualnaKolejnosc[0] = aktualnaKolejnosc[6] = 0;
        for (int i = 1; i < 6; i++) {
            odwiedzone[i] = true;
            aktualnaKolejnosc[1] = i;
            znajdzOptymalnaKolejnosc(i, 2);
            odwiedzone[i] = false;
        }

        System.out.print("Najlepsza kolejność: ");
        for (int i = 1; i <= 6; i++) {
            System.out.print((optymalnaKolejnosc[i]+1) + " ");
        }
        System.out.println("\nNajmniejszy czas: " + minimalnyCzas);
    }

    public static void znajdzOptymalnaKolejnosc(int ostatni, int glebokosc) {
        if (glebokosc == 6) {
            int calkowityCzas = 0;
            for (int i = 0; i < 6; i++) {
                calkowityCzas += czasy[aktualnaKolejnosc[i]][aktualnaKolejnosc[i+1]];
//                System.out.println(calkowityCzas);
            }
            if (calkowityCzas < minimalnyCzas) {
                minimalnyCzas = calkowityCzas;
                System.arraycopy(aktualnaKolejnosc, 0, optymalnaKolejnosc, 0, 7);
            }
            System.out.print("Sprawdzana kolejność: 1 ");
            for (int i = 1; i < 6; i++) {
                System.out.print((aktualnaKolejnosc[i] + 1) + " ");
            }
            System.out.println(", Czas: " + calkowityCzas);
            return;
        }

        for (int i = 1; i < 6; i++) {
            if (!odwiedzone[i]) {
//                System.out.printf(""+i);
                odwiedzone[i] = true;
                aktualnaKolejnosc[glebokosc] = i;
                znajdzOptymalnaKolejnosc(i, glebokosc+1);
                odwiedzone[i] = false;
            }
        }
    }
}
