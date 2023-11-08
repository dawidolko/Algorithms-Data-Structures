package Labirynt;

import static Labirynt.MazeSolver.printMaze;
import static Labirynt.MazeSolver.solve;

public class Main {
    public static void main(String[] args) {
        int[][] maze = {
                {0, 0, 1, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 1, 0},
                {0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}
        };
        printMaze(maze);
        System.out.println();
        Point start=new Point(0,0,null);
        Point koniec= new Point(4,4,null);
        solve(maze,start,koniec);
        printMaze(maze);

    }
}
