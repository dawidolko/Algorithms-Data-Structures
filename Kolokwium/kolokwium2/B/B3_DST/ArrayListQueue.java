package B.B3_DST;

// B3 Implementacja kolejki za pomocą klasy "ArrayListQueue" - DST

//Implementacja kolejki liczb calkowitych za pomoca klasy ArrayList przez OSADZANIE

import java.util.ArrayList;


public class ArrayListQueue
{
    private ArrayList<Integer> intQueue;

    public ArrayListQueue()          // konstruktor
    {
        intQueue = new ArrayList<Integer>();
    }

    public void insert(int elem)   // wstawia element na koniec kolejki
    {
        intQueue.add(elem);
    }

    public int remove()         // usuwa element z początku kolejki
    {
        int firstElem = intQueue.get(0).intValue();
        intQueue.remove(0);
        return firstElem;
    }

    public int peek()      // podgląda element na początku kolejki
    {
        return intQueue.get(0).intValue();
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
        ArrayListQueue theQueue = new ArrayListQueue();  // kolejka pięcioelementowa z relokacja

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

