public class HashArray {
    public LinkedList[] hashArray;
    public int size;
    HashArray(int maxSize)
    {
        hashArray = new LinkedList[maxSize];
        size = maxSize;
        for(int i = 0; i < size; i++)
        {
            hashArray[i] = new LinkedList();
        }
    }
    public int size()
    {
        return size;
    }
    public int hashFunct(int x)
    {
        return x % size;
    }
    public void insert(int x)
    {
        int add = hashFunct(x);
        if(!hashArray[add].contains(x)) hashArray[add].addFirst(x);
    }
    public void delete(int elem)
    {
        int del = hashFunct(elem);
        if(hashArray[del].contains(elem)) hashArray[del].remove((Object)elem);
    }
    public boolean find(int elem)
    {
        return hashArray[hashFunct(elem)].contains(elem);
    }
    public void print()
    {
        for(int i = 0; i < size; i++)
        {
            System.out.print(hashArray[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        HashArray es = new HashArray(7);
        es.insert(7);
        es.insert(4);
        es.insert(1);
        es.insert(2);
        es.insert(14);
        es.insert(33);
        es.print();
        System.out.println(es.find(44));
        System.out.println(es.find(33));
    }
}
