public class A5 {
    static int[][] times = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}
    };

    static int minTime = Integer.MAX_VALUE;
    static int[] optimalOrder = new int[7];
    static int[] currentOrder = new int[7];
    static boolean[] visited = new boolean[6];

    public static void main(String[] args) {
        currentOrder[0] = currentOrder[6] = 0; // Zakładamy, że zaczynamy i kończymy na smaku 1
        for (int i = 1; i < 6; i++) {
            visited[i] = true;
            currentOrder[1] = i;
            findOptimalOrder(i, 2);
            visited[i] = false;
        }

        System.out.print("Najlepsza kolejność: ");
        for (int i = 1; i <= 6; i++) {
            System.out.print((optimalOrder[i] + 1) + " "); // +1 aby dostosować do indeksów bazujących na 1
        }
        System.out.println("\nNajmniejszy czas: " + minTime);
    }

    public static void findOptimalOrder(int last, int depth) {
        if (depth == 6) {
            int totalTime = 0;
            for (int i = 0; i < 6; i++) {
                totalTime += times[currentOrder[i]][currentOrder[i+1]];
            }
            if (totalTime < minTime) {
                minTime = totalTime;
                for (int i = 0; i < 7; i++) {
                    optimalOrder[i] = currentOrder[i];
                }
            }
            System.out.print("Sprawdzana kolejność: 1 "); // Zakładamy że zawsze zaczynamy od 1
            for (int i = 1; i < 6; i++) {
                System.out.print((currentOrder[i] + 1) + " "); // +1 aby dostosować do indeksów bazujących na 1
            }
            System.out.println(", Czas: " + totalTime);
            return;
        }

        for (int i = 1; i < 6; i++) {
            if (!visited[i]) {
                visited[i] = true;
                currentOrder[depth] = i;
                findOptimalOrder(i, depth+1);
                visited[i] = false;
            }
        }
    }
}
