package B.B4_DST;

// B4 Implementacja kolejki za pomocą klasy "LinkedListQueue" - DST

//Implementacja kolejki liczb calkowitych za pomoca klasy LinkedList przez OSADZANIE

import java.util.LinkedList;


public class LinkedListQueue
{

    private LinkedList<Integer> intQueue;

    public LinkedListQueue()          // konstruktor
    {
        intQueue = new LinkedList<Integer>();
    }

    public void insert(int elem)   // wstawia element na koniec kolejki
    {
        intQueue.addLast(elem);
    }

    public int remove()         // usuwa element z początku kolejki
    {
        int firstElem = intQueue.get(0).intValue();
        intQueue.removeFirst();
        return firstElem;
    }

    public int peek()      // podgląda element na początku kolejki
    {
        return intQueue.peekFirst().intValue();
    }

    public boolean isEmpty()    // zwraca true, jeżeli kolejka pusta
    {
        return intQueue.isEmpty();
    }

    public int size()           // zwraca liczbę elementów w kolejce
    {
        return intQueue.size();
    }

    public static void main(String[] args)
    {
        LinkedListQueue theQueue = new LinkedListQueue();  // kolejka

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

