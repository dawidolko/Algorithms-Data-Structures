package SortedLinkedList;

import java.util.List;
import java.util.Random;

public class SortedLinkedList {
    private ListElem first, last;

    public SortedLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first==null;
    }

    public void insertFirst(int elem) {
        ListElem newElem = new ListElem(elem);

        if (isEmpty()) last = newElem;
        else first.previous = newElem;

        newElem.next = first;
        first = newElem;
    }

    public void insertLast(int elem) {
        ListElem newElem = new ListElem(elem);

        if (isEmpty()) first = newElem;
        else last.next = newElem;

        newElem.previous = last;
        last = newElem;
    }

    public ListElem deleteFirst() {
        if (isEmpty()) return null;

        ListElem temp = first;

        if (first.next==null) last = null;
        else first.next.previous = null;
        first = first.next;

        return temp;
    }

    public ListElem deleteLast() {
        if (isEmpty()) return null;

        ListElem temp = last;
        if (last.previous==null) first = null;
        else last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public void print() {
        System.out.print("Lista (początek-->koniec): ");
        ListElem current = first;

        while (current!=null) {
            System.out.print(current.toString() + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void insert(int elem) {
        ListElem newElem = new ListElem(elem);
        ListElem previous = null;
        ListElem current = first;

        while (current!=null && current.data < newElem.data) {
            previous = current;
            current = current.next;
        }

        if (isEmpty()) {
            first = newElem;
            last = newElem;
        } else {
            if (previous==null) {
                first.previous = newElem;
                first = newElem;
            }

            if (current == null) {
                last.next = newElem;
                last = newElem;
            }

            if (current!=null && previous!=null) {
                current.previous = newElem;
                previous.next = newElem;
            }
        }
        newElem.previous = previous;
        newElem.next = current;
    }

    public ListElem delete(int elem) {
        if (isEmpty()) return null;

        ListElem previous = null;
        ListElem current = first;

        while (current.data!=elem) {
            previous = current;
            current = current.next;
        }

        if (previous==null) {
            first.next.previous = null;
            first = first.next;
        } else {
            previous.next = current.next;
            current.next.previous = previous;
        }

        return current;
    }

    public ListElem find(int elem) {
        if (isEmpty()) return null;

        ListElem current = first;

        while(current.data!=elem) {
            if (current==null) return null;
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        Random rand = new Random();
        for (int j = 0; j < 15; j++) {
            int number = rand.nextInt(100);
            list.insert(number);
        }
        list.print();

        list.insertFirst(9);
        list.print();

        list.deleteFirst();
        list.print();

        list.insertLast(9);
        list.print();

        list.deleteLast();
        list.print();

        list.insert(45);
        list.print();
        list.delete(45);
        list.print();

        list.insert(14);
        System.out.println(list.find(14));
    }
}
