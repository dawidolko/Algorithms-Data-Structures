package A.A4_DB;


public class ListElem {
    public int Data;
    public ListElem previous;
    public ListElem next;

    public ListElem( int n) {
        previous = null;
        next = null;
        Data = n;
    }
}
