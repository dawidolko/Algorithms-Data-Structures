package B.B4_DB;

// B4 Implementacja kolejki za pomocą klasy "LinkedListQueue" - DB

import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Integer> intQueue;

    public LinkedListQueue() {  // Konstruktor
        intQueue = new LinkedList<>();
    }

    public void insert(Integer elem) {  // Wstawia element na koniec kolejki
        intQueue.addLast(elem);
    }

    public Integer remove() {  // Usuwa element z początku kolejki
        if (!intQueue.isEmpty()) {
            return intQueue.removeFirst();
        }
        return null;  // Zwraca null, jeśli kolejka jest pusta
    }

    public Integer peek() {  // Podgląda element na początku kolejki
        return intQueue.peekFirst();
    }

    public boolean isEmpty() {  // Zwraca true, jeżeli kolejka pusta
        return intQueue.isEmpty();
    }

    public int size() {  // Zwraca liczbę elementów w kolejce
        return intQueue.size();
    }

    public static void main(String[] args) {
        LinkedListQueue theQueue = new LinkedListQueue();

        System.out.println("Wstawiam: 10");
        theQueue.insert(10);
        System.out.println("Wstawiam: 20");
        theQueue.insert(20);
        System.out.println("Wstawiam: 30");
        theQueue.insert(30);
        System.out.println("Wstawiam: 40");
        theQueue.insert(40);

        Integer elem = theQueue.remove();  // Usuwanie elementów
        System.out.println(" Usuwam: " + elem);
        System.out.println(" Usuwam: " + theQueue.remove());
        System.out.println(" Usuwam: " + theQueue.remove());

        // Reszta kodu pozostaje bez zmian
    }
}
