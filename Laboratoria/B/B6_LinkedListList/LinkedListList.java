package B.B6_LinkedListList;

import java.util.LinkedList;

public class LinkedListList {
    private LinkedList<Cat> list;

    public LinkedListList() {
        list = new LinkedList<>();
    }

    public void insertFirst(Cat c) {
        list.addFirst(c);
    }

    public void insertLast(Cat c) {
        list.addLast(c);
    }

    public Cat removeLast() {
        return list.removeLast();
    }

    public Cat removeFirst() {
        return list.removeFirst();
    }

    public Cat getLast() {
        return list.getLast();
    }

    public Cat getFirst() {
        return list.getFirst();
    }

    public void print() {
        System.out.println("Zawartosc listy:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        Cat A = new Cat("Puszek", 4.78);
        Cat B = new Cat("Pisek", 4.21);
        Cat C = new Cat("Borys", 11.33);
        Cat D = new Cat("Cargo", 1.98);
        Cat E = new Cat("Wasek", 2.65);
        Cat F = new Cat("Czarny", 3.08);

        var list = new LinkedListList();

        list.insertLast(A);
        list.insertLast(B);
        list.insertLast(C);

        list.print();

        list.removeLast();
        list.removeLast();

        list.print();

        list.insertLast(D);
        list.insertLast(E);
        list.insertLast(F);

        list.print();
    }
}
