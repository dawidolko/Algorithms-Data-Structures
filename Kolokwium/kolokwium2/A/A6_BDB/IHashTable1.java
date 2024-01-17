package A.A6_BDB;
// A6 Implementacja tablicy mieszającej metodą łańcuchową "HashTable" - BDB
import java.util.LinkedList;
/* Implementacja tablicy mieszającej z metodą łańcuchową rozwiązywania kolizji
 * Jest to implementacja zbioru liczb całkowitych o bardzo szybkim dostępie.
 */
public class IHashTable1 {
    private LinkedList[] hashArray;    // Tablica mieszająca
    private int arraySize;             // Rozmiar tablicy mieszającej
    public IHashTable1(int size)       // Konstruktor
    {
        arraySize = size;
        hashArray = new LinkedList[size];
        for (int i = 0; i < size; i++) // Utworzenie pustych list na każdym miejscu w tablicy mieszającej
        {
            hashArray[i] = new LinkedList();
        }
    }
    public LinkedList getLinkedList(int index) // Zwrócenie listy o podanym numerze z tablicy mieszającej
    {
        return hashArray[index];
    }
    public int size() // Zwrócenie rozmiaru tablicy mieszającej
    {
        return arraySize;
    }
    private int hashFunc(int elem) // Funkcja mieszająca
    {
        return elem % arraySize;
    }
    public void insert(int data)  // Wstaw element do tablicy mieszającej
    {
        int hashVal = hashFunc(data);   // Oblicz indeks
        if (!hashArray[hashVal].contains(data)) // Sprawdź, czy element jest już na liście
        {
            hashArray[hashVal].addFirst(data); // Wstaw na listę na pozycji hashVal
        }
    }
    public void delete(int elem)       // Usuń element z tablicy mieszającej
    {
        int hashVal = hashFunc(elem);   // Oblicz indeks
        hashArray[hashVal].remove((Object) elem); // Usuń element z listy
    }
    public boolean find(int elem)   // Sprawdź, czy element jest w tablicy mieszającej
    {
        int hashVal = hashFunc(elem);   // Oblicz indeks
        return hashArray[hashVal].contains(elem);
    }
    public IHashTableIterator1 iterator() // Utworzenie iteratora
    {
        return new IHashTableIterator1(this);
    }
    public void print() // Przeglądanie tablicy mieszającej wraz z wypisywaniem elementów
    {
        System.out.print("Tablica mieszająca:");
        IHashTableIterator1 iterator = this.iterator();
        while (iterator.hasNext())      // Dopóki nie koniec elementów
        {
            Object elem = iterator.next();
            System.out.print(elem.toString()); // Wypisujemy dane i...
            System.out.print(" ");
        }
        System.out.println();
    }
    public void print2()
    {
        for(int i=0; i<size(); i++)
            for (Object val : getLinkedList(i))
                System.out.print(val.toString()+" ");
        System.out.println();
    }
    public static void main(String[] args) // Test tablicy mieszającej
    {
        IHashTable1 hashTable = new IHashTable1(10);
        hashTable.insert(1);
        hashTable.insert(11);
        hashTable.insert(2);
        hashTable.insert(32);
        hashTable.insert(42);
        hashTable.insert(3);
        hashTable.insert(33);
        hashTable.insert(4);
        hashTable.insert(3);
        hashTable.print();
        hashTable.print2();
        boolean result1 = hashTable.find(3);
        System.out.println("Wynik wyszukiwania 3:" + result1);
        hashTable.delete(3);
        hashTable.print();
        hashTable.print2();
        boolean result2 = hashTable.find(3);
        System.out.println("Wynik wyszukiwania 3:" + result2);
    }
}
