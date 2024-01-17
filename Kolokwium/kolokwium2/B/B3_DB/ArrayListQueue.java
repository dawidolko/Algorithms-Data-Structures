package B.B3_DB;

// B3 Implementacja kolejki za pomocą klasy "ArrayListQueue" - DB

import java.util.ArrayList;

public class ArrayListQueue {
    private ArrayList<Integer> intQueue;

    public ArrayListQueue() {
        intQueue = new ArrayList<>();
    }

    public void insert(Integer elem) {  // Zmiana typu argumentu na Integer
        intQueue.add(elem);
    }

    public Integer remove() {  // Zmiana zwracanego typu na Integer
        if (!intQueue.isEmpty()) {
            return intQueue.remove(0);
        }
        return null; // Zwróć null, jeśli kolejka jest pusta
    }

    public Integer peek() {  // Zmiana zwracanego typu na Integer
        if (!intQueue.isEmpty()) {
            return intQueue.get(0);
        }
        return null; // Zwróć null, jeśli kolejka jest pusta
    }

    public boolean isEmpty() {
        return intQueue.isEmpty();
    }

    public int size() {
        return intQueue.size();
    }

    public static void main(String[] args) {
        ArrayListQueue theQueue = new ArrayListQueue();
        System.out.println("Wstawiam: 10");
        theQueue.insert(10);
        System.out.println("Wstawiam: 20");
        theQueue.insert(20);
        System.out.println("Wstawiam: 30");
        theQueue.insert(30);
        System.out.println("Wstawiam: 40");
        theQueue.insert(40);

        int elem = theQueue.remove();              // usuwamy 3 elementy
        System.out.println(" Usuwam: "+elem);
        System.out.println(" Usuwam: "+theQueue.remove());
        System.out.println(" Usuwam: "+theQueue.remove());

        System.out.println("Wstawiam: 50");
        theQueue.insert(50);
        System.out.println("Wstawiam: 60");
        theQueue.insert(60);
        System.out.println("Wstawiam: 70");
        theQueue.insert(70);
        System.out.println("Wstawiam: 80");
        theQueue.insert(80);

        while (!theQueue.isEmpty())    // usuwamy i wypisujemy...
        {                            // ...wszystkie elementy
            System.out.println(" Usuwam: "+theQueue.remove());
        }
        System.out.println("");
    }
}