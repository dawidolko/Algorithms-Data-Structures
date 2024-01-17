
package B.B6_DST;

// B6 Implementacja listy dwustronnej za pomocą klasy "LinkedList" - DST

import java.util.LinkedList;

public class LinkedListList {
    private LinkedList<Integer> intList;

    public LinkedListList() {  // Konstruktor
        intList = new LinkedList<>();
    }

    public boolean isEmpty() {  // Sprawdzenie, czy lista jest pusta
        return intList.isEmpty();
    }

    public void insertFirst(int elem) {  // Wstawienie na początek listy
        intList.addFirst(elem);
    }

    public void insertLast(int elem) {  // Wstawienie na koniec listy
        intList.addLast(elem);
    }

    public int deleteFirst() {  // Usunięcie pierwszego elementu listy
        if (!intList.isEmpty()) {
            return intList.removeFirst();
        }
        return -1;  // Zwraca -1, jeśli lista jest pusta
    }

    public int deleteLast() {  // Usunięcie ostatniego elementu listy
        if (!intList.isEmpty()) {
            return intList.removeLast();
        }
        return -1;  // Zwraca -1, jeśli lista jest pusta
    }

    public int getFirst() {  // Pobranie pierwszego elementu listy
        return intList.getFirst();
    }

    public int getLast() {  // Pobranie ostatniego elementu listy
        return intList.getLast();
    }

    public int size() {  // Rozmiar listy
        return intList.size();
    }

    public void print() {  // Wypisywanie listy
        for (int elem : intList) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListList theList = new LinkedListList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        theList.print();

        theList.deleteFirst();
        theList.deleteFirst();

        theList.print();

        theList.deleteLast();

        theList.print();
    }
}
