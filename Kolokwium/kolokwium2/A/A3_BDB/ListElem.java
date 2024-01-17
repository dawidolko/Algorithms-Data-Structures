package A.A3_BDB;
// Klasa ListElem reprezentuje pojedynczy element listy powiązanej.
public class ListElem {
    public int Data; // Pole przechowujące wartość elementu
    public ListElem next, previous; // Referencje do następnego i poprzedniego elementu w liście
    // Konstruktor klasy ListElem, inicjuje element daną wartością n.
    public ListElem(int n) {
        Data = n;
        next = null;
        previous = null;
    }
}
