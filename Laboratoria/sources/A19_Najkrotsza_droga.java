
package Algorytm_zachlanny;

import java.util.Arrays;

public class A19_Najkrotsza_droga {
    private static final int[][] polaczenia = {
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
    private static final String[] nazwy = {"Warszawa", "Katowice", "Zakopane", "Lwow", "Wieden", "Budapeszt", "Bukareszt", "Zagrzeb", "Sofia"};

    public static void main(String[] args) {
        int start = 0; // Warszawa
        int end = 8; // Sofia
        int[] pred = dijkstra(polaczenia, start);
        System.out.println("Najkrótsza droga z " + nazwy[start] + " do " + nazwy[end] + " ma długość " + polaczenia[start][pred[end]] + " km i prowadzi przez " + getPath(pred, start, end) + ".");
    }

    public static int[] dijkstra(int[][] graph, int start) {
        int[] dist = new int[graph.length];
        int[] pred = new int[graph.length];
        boolean[] visited = new boolean[graph.length];

        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(pred, -1);
        dist[start] = 0;

        for (int i = 0; i < dist.length; i++) {
            int next = minDistance(dist, visited);
            visited[next] = true;

            for (int j = 0; j < graph.length; j++) {
                if (!visited[j] && graph[next][j] != -1 && dist[next] != Integer.MAX_VALUE && dist[next] + graph[next][j] < dist[j]) {
                    dist[j] = dist[next] + graph[next][j];
                    pred[j] = next;
                }
            }
        }
        return pred;
    }

    public static int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static String getPath(int[] pred, int start, int end) {
        StringBuilder path = new StringBuilder();
        int crawl = end;
        path.insert(0, nazwy[crawl]);
        while (pred[crawl] != -1) {
            path.insert(0, nazwy[pred[crawl]] + " oraz ");
            crawl = pred[crawl];
        }
        return path.toString();
    }
}
