package A.A4_DST;

// A4 Implementacja listy powiązanej uporządkowanej liczb całkowitch "OrdLinkedList" - DST

import java.util.Random;

public class SortedLinkedList
{
    private ListElem first;  // Referencja do pierwszego elementu listy

    public SortedLinkedList()  // Konstruktor
    {
        first = null;    // Lista nie ma jeszcze elementów
    }

    public boolean isEmpty()       // Zwraca true, jeżeli lista jest pusta
    {
        return (first == null);
    }

    public void insertFirst(int value)
    {
        ListElem newElem = new ListElem(value);
        newElem.next = first;       // newElem --> dotychczasowy pierwszy element
        first = newElem;            // first --> newElem
    }


    public void insert(int value)  // Wstawianie z zachowaniem porządku
    {
        ListElem newElem = new ListElem(value);
        ListElem previous = null;
        ListElem current = first;            // rozpoczynamy od początku listy

        // dopóki nie koniec listy i elementy sa mniejsze niz value
        while (current != null && newElem.iData > current.iData)
        {
            previous = current;
            current = current.next;   // Przechodzimy do następnego elementu
        }

        if (previous == null) first = newElem;   // Znalazl na poczatku listy
        else previous.next = newElem; /// nie na początku...
        newElem.next = current;
    }

// -------------------------------------------------------------

    public ListElem find(int elem)     // Wyszukiwanie elementu
    {
        if (isEmpty()) return null;

        ListElem current = first;  // Rozpoczynamy od pierwszego elementu
        while (current.iData != elem)
        {
            if (current.next == null) return null;
            else
                current = current.next;
        }
        return current;
    }
// -------------------------------------------------------------

    public ListElem deleteFirst()     // Usunięcie pierwszego elementu listy
    {
        if (isEmpty())
            return null;
        ListElem temp = first;
        first = first.next;
        return temp;
    }

    public ListElem delete(int elem)    // usuwanie elementu z listy
    {
        if (isEmpty()) return null;

        ListElem current = first;
        ListElem previous = null;

        while (current.iData != elem){
            if (current.next == null) return null; //Nie znalazl elementu
            else{
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
// -------------------------------------------------------------

    public void print()
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
        // Tworzymy listę
        SortedLinkedList theSortedList = new SortedLinkedList();

        Random rand = new Random();
        for (int j = 0; j < 10; j++)  // wypełniamy ją elementami losowymi
        {
            int number = rand.nextInt(100);
            theSortedList.insert(number);
        }

        //Wypisujemy liste
        theSortedList.print();
    }
}
