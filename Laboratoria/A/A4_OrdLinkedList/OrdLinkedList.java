package A.A4_OrdLinkedList;

import java.util.Random;

public class OrdLinkedList {
    public ListElem first, last;

    public OrdLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int x) {
        ListElem e = new ListElem(x);

        if (isEmpty()) last = e;
        else first.previous = e;

        e.next = first;
        first = e;
    }

    public void insertLast(int x) {
        ListElem e = new ListElem(x);

        if (isEmpty()) first = e;
        else last.next = e;

        e.previous = last;
        last = e;
    }

    public void insert(int x) {
        ListElem e = new ListElem(x);
        ListElem previous = null;
        ListElem current = first;

        while (current!=null && e.Data>=current.Data) {
            previous = current;
            current = current.next;
        }

        if (isEmpty()) {
            first = e;
            last = e;
        } else {
            if (previous==null) {
                first.previous = e;
                first = e;
            }

            if (current==null) {
                last.next = e;
                last = e;
            }

            if (previous!=null && current!=null) {
                previous.next = e;
                current.previous = e;
            }
        }

        e.previous = previous;
        e.next = current;
    }

    public ListElem delete(int x) {
        if (isEmpty()) return null;

        ListElem previous = null;
        ListElem current = first;

        while (current.Data!=x) {
            previous = current;
            current = current.next;
        }

        if (current==null) return null;

        if (previous==null) {
            first.next.previous = null;
            first = first.next;
        } else if (current.next == null) {
            last.previous.next = null;
            last = last.previous;
        } else {
            previous.next = current.next;
            current.next.previous = previous;
        }

        return current;
    }

    public ListElem deleteLast() {
        if (isEmpty()) return null;

        ListElem temp = last;
        if (last.previous==null) first = null;
        else last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public ListElem deleteFirst() {
        if (isEmpty()) return null;

        ListElem temp = first;
        if (first.next==null) last = null;
        else first.next.previous = null;
        first = first.next;
        return temp;
    }

    public void print() {
        System.out.print("Lista (początek-->koniec): ");
        ListElem current = first;

        while (current!=null) {
            System.out.print(current.Data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListElem find(int elem) {
        if (isEmpty()) return null;

        ListElem current = first;

        while(current.Data!=elem) {
            if (current==null) return null;
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        OrdLinkedList list = new OrdLinkedList();

        Random rand = new Random();
        for (int j = 0; j < 15; j++) {
            int number = rand.nextInt(100);
            list.insert(number);
        }
        list.print();

        list.insertFirst(9);
        list.print();

        list.delete(9);
        list.print();

        list.insertLast(9);
        list.print();

        list.delete(9);
        list.print();

        list.insert(45);
        list.print();
        list.delete(45);
        list.print();

        list.insert(14);
        System.out.println(list.find(14));
    }

}
