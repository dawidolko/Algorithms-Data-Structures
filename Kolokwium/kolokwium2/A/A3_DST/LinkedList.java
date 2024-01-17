package A.A3_DST;

// A3 Implementacja listy powiązanej liczb całkowitch "LinkedList" - DST

public class LinkedList
{
    private ListElem first;  // Referencja do pierwszego elementu listy

    public LinkedList()  // Konstruktor
    {
        first = null;    // Lista nie ma jeszcze elementów
    }

    public boolean isEmpty()       // Zwraca true, jeżeli lista jest pusta
    {
        return (first == null);
    }

    public ListElem getFirst()
    {
        return first;
    }

    public void insertFirst(int value)
    {
        ListElem newElem = new ListElem(value);
        if(!isEmpty())
            newElem.next = first;       // newElem --> dotychczasowy pierwszy element
        first = newElem;            // first --> newElem
    }

    public boolean find(int elem)     // Wyszukiwanie elementu
    {
        if (isEmpty()) return false;

        ListElem current = first;  // Rozpoczynamy od pierwszego elementu
        while (current.iData != elem)
        {
            if (current.next == null) return false;
            else
                current = current.next;
        }
        return true;
    }

    public ListElem deleteFirst()     // Usunięcie pierwszego elementu listy
    {
        if (isEmpty())
        {
            return null;
        }
        ListElem temp = first;
        first = first.next;
        return temp;
    }

    public ListElem delete(int elem)    // usuwanie elementu z listy
    {
        if (isEmpty()) return null;

        ListElem current = first;
        ListElem previous = null;

        while (current.iData != elem)
        {
            if (current.next == null) return null; //Nie znalazl elementu
            else
            {
                previous = current;     // Przechodzimy do następnego elementu
                current = current.next;
            }
        }
        // Usuwamy znaleziony element
        if (previous == null)  // jeżeli jest to pierwszy element...
            first = first.next; // ...zmieniamy pole first
        else                  // jeżeli nie jest to pierwszy
            previous.next = current.next;   // Usuwamy aktualny element przez jego pominiecie

        return current; //Zwracamy usuniety element
    }

    public LinkedListIterator iterator()
    {
       return new LinkedListIterator(this);
    }
// -------------------------------------------------------------

    public void print()
    {
        System.out.print("Lista (początek-->koniec): ");
        LinkedListIterator iterator = this.iterator();

        while (iterator.hasNext())      // Dopóki nie koniec listy...
        {
            ListElem elem = iterator.next();
            System.out.print(elem.toString()+" "); // ...wypisujemy dane i...
        }
        System.out.println();
    }
    
    public void print2()
    {
        System.out.print("Lista (początek-->koniec): ");
        ListElem current = first;   // Zaczynamy na początku listy
        while (current != null)      // Dopóki nie koniec listy...
        {
            System.out.print(current.toString()+" ");
            current = current.next;  // ...przechodzimy do następnego elementu.
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        LinkedList theList = new LinkedList();  // Tworzymy listę

        theList.insertFirst(22);      // wstawiamy 4 elementy
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);

        theList.print();              // wypisujemy zawartość listy

        int liczba = 44;
        boolean wynik = theList.find(liczba);   // Szukamy elementu: 44
        if (wynik)
            System.out.println("Znaleziono element " + liczba);
        else
            System.out.println("Nie znaleziono elementu "+liczba);

        ListElem dElem = theList.delete(66);  // Usuwamy element
        if (dElem != null)
            System.out.println("Usunięto element o kluczu " + dElem.iData);
        else
            System.out.println("Nie można usunąć elementu");

        theList.print();   // Wypisujemy listę
        
        theList.print2();
        
        theList.deleteFirst();
        theList.print2();
    }
}

