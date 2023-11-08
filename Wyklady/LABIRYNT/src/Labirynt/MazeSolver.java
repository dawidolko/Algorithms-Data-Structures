package Labirynt;

import java.util.LinkedList;
import java.util.Queue;

public class MazeSolver {
    public static void solve(int[][] maze, Point start, Point end) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        boolean[][] visited = new boolean[maze.length][maze[0].length];

        while (!queue.isEmpty()) {
            Point point = queue.poll();
            if (point.x == end.x && point.y == end.y) {
                markPath(maze, point);
                return;
            }
            visit(maze, visited, queue, point.x - 1, point.y, point);
            visit(maze, visited, queue, point.x + 1, point.y, point);
            visit(maze, visited, queue, point.x, point.y - 1, point);
            visit(maze, visited, queue, point.x, point.y + 1, point);
        }
    }

    private static void visit(int[][] maze, boolean[][] visited, Queue<Point> queue, int x, int y, Point parent) {
        if (x < 0 || y < 0 || x >= maze.length || y >= maze[0].length || maze[x][y] == 1 || visited[x][y]) {
            return;
        }
        queue.add(new Point(x, y, parent));
        visited[x][y] = true;
    }

    private static void markPath(int[][] maze, Point point) {
        while (point.parent != null) {
            maze[point.x][point.y] = 2;  // Znak * będzie reprezentowany przez wartość 2
            point = point.parent;
        }
        maze[point.x][point.y] = 2;
    }

    public static void printMaze(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (maze[i][j] == 2) {
                    System.out.print('*');
                } else if (maze[i][j] == 1) {
                    System.out.print('#');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
