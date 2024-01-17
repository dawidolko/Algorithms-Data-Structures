package A.A3_BDB;
// A3 Implementacja listy powiązanej liczb całkowitch "LinkedList" - BDB
// Klasa LinkedList reprezentuje listę powiązaną przechowującą liczby całkowite.
public class LinkedList {
    public ListElem first, last; // Referencje do pierwszego i ostatniego elementu listy
    // Konstruktor inicjuje listę jako pustą.
    public LinkedList() {
        first = null;
        last = null;
    }
    // Metoda isEmpty sprawdza, czy lista jest pusta.
    public boolean isEmpty() {
        return first == null;
    }
    // Metoda insertFirst dodaje nowy element na początek listy.
    public void insertFirst(int x) {
        ListElem e = new ListElem(x);

        if (isEmpty()) last = e; // Jeśli lista była pusta, ustawia "last" na nowy element
        else first.previous = e; // W przeciwnym razie, ustawia "previous" obecnie pierwszego elementu na nowy element
        e.next = first; // Ustawia "next" nowego elementu na dotychczasowy pierwszy element
        first = e; // Ustawia "first" na nowy element
    }
    // Metoda insertLast dodaje nowy element na koniec listy.
    public void insertLast(int x) {
        ListElem e = new ListElem(x);

        if (isEmpty()) first = e; // Jeśli lista była pusta, ustawia "first" na nowy element
        else last.next = e; // W przeciwnym razie, ustawia "next" obecnie ostatniego elementu na nowy element
        e.previous = last; // Ustawia "previous" nowego elementu na dotychczasowy ostatni element
        last = e; // Ustawia "last" na nowy element
    }
    // Metoda removeFirst usuwa pierwszy element z listy i zwraca go.
    public ListElem removeFirst() {
        if (isEmpty()) return null;

        ListElem temp = first;

        if (first.next == null) last = null; // Jeśli był tylko jeden element, ustawia "last" na null
        else first.next.previous = null; // W przeciwnym razie, ustawia "previous" drugiego elementu na null
        first = first.next; // Ustawia "first" na drugi element
        return temp;
    }
    // Metoda removeLast usuwa ostatni element z listy i zwraca go.
    public ListElem removeLast() {
        if (isEmpty()) return null;

        ListElem temp = last;

        if (last.previous == null) first = null; // Jeśli był tylko jeden element, ustawia "first" na null
        else last.previous.next = null; // W przeciwnym razie, ustawia "next" przedostatniego elementu na null
        last = last.previous; // Ustawia "last" na przedostatni element
        return temp;
    }
    // Metoda print wypisuje zawartość listy na konsoli.
    public void print() {
        System.out.println("Zawartosc listy:");
        ListElem current = first;

        while (current != null) {
            System.out.print(current.Data + " ");
            current = current.next;
        }
    }
    // Metoda find wyszukuje element o określonej wartości w liście.
    // Zwraca true, jeśli element zostanie znaleziony, lub false w przeciwnym przypadku.
    public boolean find(int elem) {
        if (isEmpty()) return false;

        ListElem current = first; // Rozpoczynamy od pierwszego elementu
        while (current.Data != elem) {
            if (current.next == null) return false;
            else current = current.next;
        }
        return true;
    }
    // Metoda main zawiera przykładowe użycie klasy LinkedList.
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int p1 = 12;
        list.insertFirst(p1);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertLast(2);
        list.insertLast(7);
        list.insertLast(5);
        list.print();
        list.removeFirst();
        list.print();
        System.out.println("\n" + list.find(133333));
    }
}