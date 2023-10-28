package SortedLinkedList;

public class ListElem {
    public int data;
    public ListElem previous, next;

    public ListElem(int data) {
        this.data = data;
        previous = null;
        next = null;
    }

    public String toString() {
        return String.valueOf(data);
    }
}
