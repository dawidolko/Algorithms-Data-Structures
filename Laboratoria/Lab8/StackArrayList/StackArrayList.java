package StackArrayList;

import java.util.ArrayList;

public class StackArrayList {
    private final ArrayList<Point> stack;

    public StackArrayList() {
        this.stack = new ArrayList<>();
    }

    public void push(Point point) {
        stack.add(0, point);
    }

    public Point peek() {
        return stack.get(0);
    }

    public Point pop() {
        return stack.remove(0);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        var stack = new StackArrayList();

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(1, 5);
        Point p4 = new Point(2, 6);
        Point p5 = new Point(3, 3);

        stack.push(p1);
        stack.push(p2);
        stack.push(p3);

        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());

        stack.push(p4);
        stack.push(p5);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toString());
        }
    }
}
