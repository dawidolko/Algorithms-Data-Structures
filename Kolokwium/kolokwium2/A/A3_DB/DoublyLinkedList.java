package A.A3_DB;

// A3 Implementacja listy powiązanej liczb całkowitch "LinkedList" - DB

public class DoublyLinkedList {
    private DListElem first;  // Referencja do pierwszego elementu listy
    private DListElem last;   // Referencja do ostatniego elementu listy

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int value) {
        DListElem newElem = new DListElem(value);

        if(isEmpty()) last = newElem;
        newElem.next = first;
        first = newElem;
    }

    public void insertLast(int value) {
        DListElem newElem = new DListElem(value);
        if (isEmpty()) first = newElem;
        else {
            last.next = newElem;
        }
        last = newElem;
    }

    public DListElem deleteFirst() {
        if (isEmpty()) return null;

        DListElem temp = first;
        if(first.next == null) last = null;
        first = first.next;
        return temp;
    }

    public DListElem deleteLast() {
        // Ten fragment kodu wymaga przeglądania całej listy, aby znaleźć przedostatni element
        if (isEmpty()) return null;

        DListElem temp = last;
        if(first.next == null) {
            first = null;
        } else {
            DListElem current = first;
            while (current.next != last) {
                current = current.next;
            }
            last = current;
            last.next = null;
        }
        return temp;
    }

    public void print() {
        System.out.print("Lista: ");
        DListElem current = first;
        while (current != null) {
            System.out.print(current.toString() + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();


        theList.insertFirst(22);       // wstawiamy na początek
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);        // wstawiamy na koniec
        theList.insertLast(33);
        theList.insertLast(55);

        theList.print();         // wypisujemy zawartość listy

        theList.deleteFirst();         // usuwamy pierwsze dwa elementy
        theList.deleteFirst();

        theList.print();         // wypisujemy ponownie

        theList.deleteLast(); //usuwamy ostatni element

        theList.print();         // wypisujemy ponownie
    }
}

