public class Posortowana {
    public ListElem first;
    Posortowana()
    {
        first = null;
    }
    public boolean isEmpty()
    {
        return first == null;
    }
    public void insertFirst(int x)
    {
        ListElem nElem = new ListElem(x);
        nElem.next = first;
        first = nElem;
    }
    public void insert(int x)
    {
        if(isEmpty()) insertFirst(x);
        else{
            ListElem curr = first;
            ListElem nElem = new ListElem(x);
            ListElem prev = null;
            while(curr != null)
            {
                if(curr.iData > x) break;
                prev = curr;
                curr = curr.next;
            }
            if(curr== null) prev.next = nElem;
            else if(prev == null) insertFirst(x);
            else{
                prev.next = nElem;
                nElem.next = curr;
            }
        }
    }
    public ListElem deleteFirst()
    {
        if(isEmpty())return null;
        ListElem temp = first;
        first = first.next;
        return temp;
    }
    public ListElem delete(int x)
    {
        if (isEmpty()) return null;
        ListElem curr = first;
        ListElem prev = null;
        while(curr != null)
        {
            if(curr.iData == x) break;
            prev = curr;
            curr = curr.next;
        }
        if(curr == null) return null;
        else if(prev == null) deleteFirst();
        else prev.next = curr.next;
        return curr;
    }
    public void print()
    {
        ListElem curr = first;
        while(curr != null)
        {
            System.out.print(curr.toString());
            curr = curr.next;
        }
        System.out.println();
    }
    public ListElem find(int elem)
    {
        if(isEmpty())return null;
        ListElem curr = first;
        while(curr != null)
        {
            if(curr.iData == elem) return curr;
            curr = curr.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Posortowana ps = new Posortowana();
        ps.insert(6);
        ps.insert(1);
        ps.insert(13);
        ps.insert(44);
        ps.insert(66);
        ps.insert(33);
        ps.insert(11);
        ps.print();
        ps.delete(1);
        ps.delete(44);
        ps.delete(66);
        ps.print();
        System.out.println(ps.find(33));
        System.out.println(ps.find(66));
    }
}
class ListElem{
    public ListElem next;
    public int iData;
    ListElem(int iData)
    {
        next = null;
        this.iData = iData;
    }

    @Override
    public String toString() {
        return " {" + iData + '}';
    }
}
