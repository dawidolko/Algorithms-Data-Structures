package A.A4_BDB;
import java.util.Random;
// A4 Implementacja listy powiązanej uporządkowanej liczb całkowitch "OrdLinkedList" - BDB
// Klasa OrdLinkedList reprezentuje uporządkowaną listę powiązaną przechowującą liczby całkowite.
public class OrdLinkedList {
    public ListElem first, last; // Referencje do pierwszego i ostatniego elementu listy
    // Konstruktor inicjuje listę jako pustą.
    public OrdLinkedList() {
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
    // Metoda insert dodaje nowy element w odpowiednim miejscu w porządku rosnącym.
    public void insert(int x) {
        ListElem e = new ListElem(x);
        ListElem previous = null;
        ListElem current = first;
        while (current != null && e.Data >= current.Data) {
            previous = current;
            current = current.next;
        }
        if (isEmpty()) {
            first = e;
            last = e;
        } else {
            if (previous == null) {
                first.previous = e;
                first = e;
            }
            if (current == null) {
                last.next = e;
                last = e;
            }
            if (previous != null && current != null) {
                previous.next = e;
                current.previous = e;
            }
        }
        e.previous = previous;
        e.next = current;
    }
    // Metoda delete usuwa element o określonej wartości z listy.
    public ListElem delete(int x) {
        if (isEmpty()) return null;
        ListElem previous = null;
        ListElem current = first;
        while (current.Data != x) {
            previous = current;
            current = current.next;
        }
        if (current == null) return null;
        if (previous == null) {
            first.next.previous = null;
            first = first.next;
        } else if (current.next == null) {
            last.previous.next = null;
            last = last.previous;
        } else {
            previous.next = current.next;
            current.next.previous = previous;
        }
        return current;
    }
    // Metoda deleteLast usuwa ostatni element z listy i zwraca go.
    public ListElem deleteLast() {
        if (isEmpty()) return null;
        ListElem temp = last;
        if (last.previous == null) first = null;
        else last.previous.next = null;
        last = last.previous;
        return temp;
    }
    // Metoda deleteFirst usuwa pierwszy element z listy i zwraca go.
    public ListElem deleteFirst() {
        if (isEmpty()) return null;
        ListElem temp = first;
        if (first.next == null) last = null;
        else first.next.previous = null;
        first = first.next;
        return temp;
    }
    // Metoda print wypisuje zawartość listy na konsoli.
    public void print() {
        System.out.print("Lista (początek-->koniec): ");
        ListElem current = first;
        while (current != null) {
            System.out.print(current.Data + " ");
            current = current.next;
        }
        System.out.println();
    }
    // Metoda find wyszukuje element o określonej wartości w liście.
    // Zwraca true, jeśli element zostanie znaleziony, lub false w przeciwnym przypadku.
    public boolean find(int elem) {
        if (isEmpty()) return false;
        ListElem current = first; // Rozpoczynamy od pierwszego elementu
        while (current.Data != elem) {
            if (current.next == null) return false;
            else
                current = current.next;
        }
        return true;
    }
    // Metoda main zawiera przykładowe użycie klasy OrdLinkedList.
    public static void main(String[] args) {
        OrdLinkedList list = new OrdLinkedList();
        Random rand = new Random();
        for (int j = 0; j < 15; j++) {
            int number = rand.nextInt(100);
            list.insert(number);
        }
        list.print();
        list.insertFirst(9);
        list.print();
        list.delete(9);
        list.print();
        list.insertLast(9);
        list.print();
        list.delete(9);
        list.print();
        list.insert(45);
        list.print();
        list.delete(45);
        list.print();
        list.insert(14);
        System.out.println(list.find(14));
    }
}
