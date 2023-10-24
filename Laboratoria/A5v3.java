public class IceCreams {

    public static void main() {
        //Problem produkcji lodow

        iceCreams(0);

        System.out.println("Najlepsza kombinacja smakow to na przyklad: ");
        for (int i=0;i<numberOfFlavors+1;i++) {
            System.out.print(bestAttempt[i] + " ");
        }
        System.out.println("\nCzas potrzebny do przestrojenia maszyn wynosi wtedy " + bestTime);
    }

    static int[][] times = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}
        };

        final static int numberOfFlavors = times.length;
        static int[] L = new int[numberOfFlavors+1];

        static int bestTime = Integer.MAX_VALUE;
        static int[] bestAttempt = new int[numberOfFlavors+1];

    static void iceCreams(int i) {
        int localTime = 0;

        if (i == numberOfFlavors) {

            L[numberOfFlavors] = L[0];

            for (int j=0;j<numberOfFlavors;j++) {
                localTime += times[L[j]-1][L[j+1]-1];
            }

            if (localTime < bestTime) {
                bestTime = localTime;
                System.arraycopy(L, 0, bestAttempt, 0, numberOfFlavors+1);
            }

        } else {
            for (int j = 1; j <= numberOfFlavors; j++) {
                int k;
                for (k = 0; k < i; k++) if (L[k] == j) break;
                if (k == i) {
                    L[k] = j;
                    iceCreams(i + 1);
                }
            }
        }
    }
}
