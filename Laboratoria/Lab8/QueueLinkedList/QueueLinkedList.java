package QueueLinkedList;

import java.util.LinkedList;

public class QueueLinkedList {
    private LinkedList<Dog> queue;

    public QueueLinkedList() {
        queue = new LinkedList<>();
    }

    public void insert(Dog d) {
        queue.addLast(d);
    }

    public Dog remove() {
        return queue.removeFirst();
    }

    public Dog peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        var queue = new QueueLinkedList();

        Dog d1 = new Dog("Azor", 3);
        Dog d2 = new Dog("Agata", 5);
        Dog d3 = new Dog("Hilkiasz", 2);
        Dog d4 = new Dog("Atramedes", 4);
        Dog d5 = new Dog("Wspak", 3);

        queue.insert(d1);
        queue.insert(d2);
        queue.insert(d3);

        System.out.println(queue.remove().toString());
        System.out.println(queue.remove().toString());

        queue.insert(d4);
        queue.insert(d5);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove().toString());
        }
    }
}
