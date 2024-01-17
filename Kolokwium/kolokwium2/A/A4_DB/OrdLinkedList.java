package A.A4_DB;

// A4 Implementacja listy powiązanej uporządkowanej liczb całkowitch "OrdLinkedList" - DB

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
        ListElem newElem = new ListElem(x);
        if (isEmpty()) {
            first = last = newElem;
        } else {
            ListElem current = first;
            ListElem previous = null;
            while (current != null && x > current.Data) {
                previous = current;
                current = current.next;
            }
            if (previous == null) {
                newElem.next = first;
                first = newElem;
            } else {
                previous.next = newElem;
                newElem.next = current;
            }
            if (current == null) {
                last = newElem;
            }
        }
    }

    public ListElem delete(int x) {
        if (isEmpty()) return null;

        ListElem previous = null;
        ListElem current = first;

        while (current != null && current.Data != x) {
            previous = current;
            current = current.next;
        }

        if (current == null) return null;
        if (previous == null) {
            first = first.next;
            if (first == null) last = null;
        } else {
            previous.next = current.next;
            if (current.next == null) last = previous;
        }

        return current;
    }

    public void print() {
        System.out.print("Lista (początek-->koniec): ");
        ListElem current = first;
        while (current != null) {
            System.out.print(current.Data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean find(int elem)     // Wyszukiwanie elementu
    {
        if (isEmpty()) return false;

        ListElem current = first;  // Rozpoczynamy od pierwszego elementu
        while (current.Data != elem)
        {
            if (current.next == null) return false;
            else
                current = current.next;
        }
        return true;
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
        System.out.println(list.find(40));
    }

}
