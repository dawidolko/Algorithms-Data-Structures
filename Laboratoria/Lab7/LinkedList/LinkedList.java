public class LinkedList {
    private ListElement first;
    private ListElement last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first==null);
    }

    public void insertFirst(int x) {
        var newElem = new ListElement(x);

        if (isEmpty()) last = newElem;
        else first.previous = newElem;

        newElem.next = first;
        first = newElem;
    }

    public void insertLast(int x) {
        var newElem = new ListElement(x);

        if (isEmpty()) first = newElem;
        else {
            last.next = newElem;
            newElem.previous = last;
        }

        last = newElem;
    }

    public ListElement deleteFirst() {
        if (isEmpty()) return null;

        ListElement temp = last;

        if (first.next==null) last = null;
        else first.next.previous = null;
        first = first.next;

        return temp;
    }

    public ListElement deleteLast() {
        if (isEmpty()) return null;

        ListElement temp = last;

        if (last.previous==null) first = null;
        else last.previous.next = null;
        last = last.previous;

        return temp;
    }

    public void print() {
        System.out.println("Lista: ");
        ListElement current = first;

        while (current!=null) {
            System.out.println(current.toString());
            current = current.next;
        }

        System.out.println();
    }
}
