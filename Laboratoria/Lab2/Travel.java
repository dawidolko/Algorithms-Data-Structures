public class Travel {

    public static void main() {
        //Problem najkrotszej drogi

        travel(0);

        System.out.println("Najlepsza droga z Warszawy do Sofii prowadzi przez " + bestWay + "i mierzy " + bestDistance + " km.");
    }

    static String[] cities = {"Warszawa", "Katowice", "Zakopane", "Lwow", "Wieden", "Budapeszt", "Bukareszt", "Zagrzeb", "Sofia"};

    final static int[][] distances = {
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

    static int numberOfCities = distances.length;
    static int[] L = new int[numberOfCities];

    static int bestDistance = Integer.MAX_VALUE;
    static String bestWay = "";


    static void travel(int i) {
        int localDistance = 0;
        int status = 0;
        String Way = "";
        boolean canYouReach = true;

        if (i==numberOfCities) {
            for (int j=0;j<numberOfCities-1;j++) {

                if (distances[L[j]][L[j + 1]]!=-1) {
                    if (L[j] == 0 || L[j] == 8) status++;

                    if (status == 1) {
                        localDistance += distances[L[j]][L[j + 1]];
                        if (L[j] != 0) Way += (cities[L[j]] + " ");
                    }
                } else canYouReach = false;
            }

            if (localDistance <= bestDistance && canYouReach) {
                bestDistance = localDistance;
                bestWay = Way;
            }

        } else {
            for (int j = 0; j < numberOfCities; j++) {
                int k;
                for (k = 0; k < i; k++) if (L[k] == j) break;
                if (k == i) {
                    L[k] = j;
                    travel(i + 1);
                }
            }
        }
    }
}
