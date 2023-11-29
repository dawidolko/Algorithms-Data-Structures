package B.B4_LinkedListQueue;

import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Auto> queue;

    public LinkedListQueue() {
        queue = new LinkedList<>();
    }

    public void push(Auto a) {
        queue.addLast(a);
    }

    public Auto peek() {
        return queue.getFirst();
    }

    public Auto pop() {
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        var queue = new LinkedListQueue();

        Auto A = new Auto("Honda", 1.1);
        Auto B = new Auto("Audi", 1.2);
        Auto C = new Auto("BMW", 1.9);
        Auto D = new Auto("Opel", 2.2);
        Auto E = new Auto("Rolls Royce", 1.1);

        queue.push(A);
        queue.push(B);
        queue.push(C);

        System.out.println(queue.pop().toString());
        System.out.println(queue.pop().toString());

        queue.push(D);
        queue.push(E);

        while (!queue.isEmpty()) {
            System.out.println(queue.pop().toString());
        }
    }
}
