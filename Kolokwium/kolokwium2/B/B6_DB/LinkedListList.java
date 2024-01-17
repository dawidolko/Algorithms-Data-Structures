package B.B6_DB;

// B6  Implementacja listy dwustronnej za pomocą klasy  "LinkedList" - DB

import java.util.LinkedList;

public class LinkedListList 
{

    private LinkedList<Object> oList;
    
    public LinkedListList()          // konstruktor
    {
        oList = new LinkedList<Object>();
    }
    
    public boolean isEmpty()  // spr. czy pusta
    {
        return oList.isEmpty();
    }
    
    public void insertFirst(Object elem)  // Wstawienie na poczatek listy
    {
        oList.addFirst(elem);
    }
    
    public void insertLast(Object elem)  // Wstawienie na koniec listy
    {
        oList.addLast(elem);
    }
    
    public Object deleteFirst()     // Usuniecie pierwszego elementu listy
    {
        return oList.removeFirst();
    }
    
    public Object deleteLast()     // Usuniecie ostatniego elementu listy
    {
        return oList.removeLast();
    }
    
    public Object getFirst()     // Pobranie pierwszego elementu listy
    {
        return oList.getFirst();
    }
    
    public Object getLast()     // Pobranie ostatniego elementu listy
    {
        return oList.getLast();
    }
    
    public int size()  // rozmiar listy
    {
        return oList.size();
    }
    
    public void print()
    {
        for (int i = 0; i < oList.size(); i++) 
        {
            System.out.print(oList.get(i)+" ");
        }
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        LinkedListList theList = new LinkedListList();

        theList.insertFirst(22);       // wstawiamy na poczatek
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);        // wstawiamy na koniec
        theList.insertLast(33);
        theList.insertLast("5ssss5");

        theList.print();         // wypisujemy zawartosc listy

        theList.deleteFirst();         // usuwamy pierwsze dwa elementy
        theList.deleteFirst();

        theList.print();         // wypisujemy ponownie

        theList.deleteLast(); //usuwamy ostatni element

        theList.print();         // wypisujemy ponownie
    }
    
}
