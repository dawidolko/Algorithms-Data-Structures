package A.A6_BDB;
import java.util.Iterator;
/*
 Implementacja iteratora dla tablicy mieszającej IHashTable
 */
public class IHashTableIterator1 {
    private IHashTable1 hashTable; // Tablica mieszająca, dla której jest ten iterator
    private int size; // Rozmiar tablicy mieszającej
    private int listIndex; // Numer aktualnej listy, na którą wskazuje iterator
    private Iterator listIterator; // Iterator aktualnej listy, na którą wskazuje iterator tablicy mieszającej
    public IHashTableIterator1(IHashTable1 hashTable) {
        this.hashTable = hashTable;
        listIndex = 0;
        size = hashTable.size();
        listIterator = hashTable.getLinkedList(listIndex).iterator();
    }
    public boolean hasNext() // Sprawdzenie, czy w tablicy mieszającej jest jeszcze następny element
    {
        if (listIterator.hasNext()) return true; // Na bieżącej liście jest następny element
        int locListIndex = listIndex;
        Iterator locListIterator = listIterator;
        while (true) // Poszukiwanie listy z elementami
        {
            locListIndex++;
            if (locListIndex == size) return false; // Nie znaleziono listy niepustej, zatem brak następnego elementu
            locListIterator = hashTable.getLinkedList(locListIndex).iterator(); // Pobranie iteratora dla kolejnej listy
            if (locListIterator.hasNext()) return true; // Znalazł się następny element
        }
    }
    public Object next() // Pobranie kolejnego elementu z tablicy mieszającej
    {
        if (listIterator.hasNext()) // Czy na aktualnej liście jest następny element
        {
            return listIterator.next(); // Pobranie kolejnego elementu z bieżącej listy
        } else {
            while (!listIterator.hasNext()) // Dopóki lista jest pusta (poszukiwanie listy niepustej)
            {
                listIndex++;
                if (listIndex == size) return null; // Nie znaleziono listy niepustej, zatem brak następnego elementu
                listIterator = hashTable.getLinkedList(listIndex).iterator(); // Pobranie iteratora dla kolejnej listy
            }
            return listIterator.next();
        }
    }
}
