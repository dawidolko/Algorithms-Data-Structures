public class ListElement {
    private int elem;
    public ListElement next;
    public ListElement previous;

    public ListElement(int elem) {
        this.elem = elem;
        this.next = null;
        this.previous = null;
    }

    public String toString() {
        return "ListElement{" +
                "elem=" + elem +
                '}';
    }
}
