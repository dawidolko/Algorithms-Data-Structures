import java.util.Calendar;
import java.util.List;

public class ListNotSort {
    public ListElem first, last;
    ListNotSort()
    {
        first = null;
        last = null;
    }
    public boolean isEmpty()
    {
        return first == null;
    }
    public void insertFirst(int x)
    {
        ListElem nElem = new ListElem(x);
        if(isEmpty()) last = nElem;
        else first.prev = nElem;
        nElem.next = first;
        first = nElem;
    }
    public void insertLast(int x)
    {
        ListElem nElem = new ListElem(x);
        if(isEmpty()) first = nElem;
        else last.next = nElem;
        nElem.prev = last;
        last = nElem;
    }
    public ListElem removeFirst()
    {
        if(isEmpty()) return null;
        if(first.next == null) last = null;
        ListElem temp = first;
        first.next.prev = null;
        first = first.next;
        return temp;
    }
    public ListElem removeLast()
    {
        if(isEmpty())return null;
        ListElem temp = last;
        if(first.next == null) first = null;
        last.prev.next = null;
        last = last.prev;
        return temp;
    }
    public ListElem find(int elem)
    {
        if(isEmpty()) return null;
        ListElem curr = first;
        while(curr != null)
        {
            if(curr.iData == elem) return curr;
            curr = curr.next;
        }
        return null;
    }
    public void print()
    {
        ListElem curr = first;
        while(curr != null)
        {
            System.out.print(curr);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNotSort lll = new ListNotSort();
        lll.insertFirst(33);
        lll.insertFirst(22);
        lll.insertFirst(11);
        lll.insertFirst(1);
        lll.insertLast(33);
        lll.insertLast(22);
        lll.insertLast(11);
        lll.insertLast(1);
        lll.print();
        lll.removeFirst();
        lll.removeLast();
        lll.removeLast();
        lll.print();
    }
}
class ListElem
{
    public ListElem prev, next;
    public int iData;
    ListElem(int iData)
    {
        next = null;
        prev = null;
        this.iData = iData;
    }

    @Override
    public String toString() {
        return " {" + iData + '}';
    }
}
