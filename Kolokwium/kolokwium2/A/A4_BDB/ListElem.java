package A.A4_BDB;
// Klasa ListElem reprezentuje pojedynczy element listy powiązanej.
public class ListElem {
    public int Data; // Pole przechowujące wartość elementu
    public ListElem previous, next; // Referencje do poprzedniego i następnego elementu w liście
    // Konstruktor klasy ListElem, inicjuje element daną wartością n.
    public ListElem(int n) {
        previous = null;
        next = null;
        Data = n;
    }
}
