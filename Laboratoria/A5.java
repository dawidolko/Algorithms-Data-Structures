package asd_lab_1;

public class A5 {

    private static int[][] czasy = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}
    };

    private static boolean[] odwiedzone = new boolean[6];
    private static int[] trasa = new int[7];
    private static int[] optymalnaKolejnosc=new int[7];
    private static int minCzas = Integer.MAX_VALUE;

    public static void main(String[] args) {
        trasa[0] = 0;
        trasa[6] = 0;
        szukaj(1);
        System.out.println("Minimalny czas przestrojenia: " + minCzas);
        System.out.print("Najlepsza kolejność: 1 ");
        for (int i = 1; i <= 6; i++) {
            System.out.print((optymalnaKolejnosc[i]+1) + " ");
        }
    }

    private static void szukaj(int krok) {
        if (krok == 6) {
            int czas = 0;
            for (int i = 0; i < 6; i++) {
                czas += czasy[trasa[i]][trasa[i+1]];
                System.out.println("Czas elementu po zsumowaniu z elementu["+(i+1)+"]: "+czas);
            }
            if (czas < minCzas) {
                minCzas = czas;
                System.arraycopy(trasa, 0, optymalnaKolejnosc, 0, 7);
            }
            // Wyświetlanie aktualnie sprawdzanej kolejności
            System.out.print("\nSprawdzana kolejność: 1 ");
            for (int i = 1; i < 6; i++) {
                System.out.print((trasa[i] + 1) + " ");
            }
            System.out.println(", Czas: " + czas+"\n");
            return;
        }

        for (int i = 1; i < 6; i++) {
            if (!odwiedzone[i]) {
                System.out.printf("Jakie aktualnie elementy są zamienione do liczenia: ["+i+"] ["+(i+1)+"]\n");
                trasa[krok] = i;
                odwiedzone[i] = true;
                szukaj(krok + 1);
                odwiedzone[i] = false;
            }
        }
    }
}

