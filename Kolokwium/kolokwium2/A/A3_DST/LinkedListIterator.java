package A.A3_DST;

public class LinkedListIterator
{
    private ListElem currentElem;

    public LinkedListIterator(LinkedList linkedList)
    {
        currentElem = linkedList.getFirst();
    }

    public boolean hasNext()
    {
        if (currentElem==null) return false;
        return currentElem!=null;
    }

    public ListElem next()
    {
        if (currentElem==null) return null;
        ListElem currElem = currentElem;
        currentElem = currentElem.next;
        return currElem;
    }
}
