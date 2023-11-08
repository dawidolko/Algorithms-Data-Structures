package Labirynt;

class Point {
    int x;
    int y;
    Point parent;

    public Point(int x, int y, Point parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
    }
}
