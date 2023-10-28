import java.util.LinkedList;

public class HashTable {
    private LinkedList<Integer>[] hashArray;
    private int arraySize;

    public HashTable(int size) {
        hashArray = new LinkedList[size];
        arraySize = size;

        for (int i=0; i<arraySize;i++) hashArray[i] = new LinkedList<>();
    }

    public LinkedList getLinkedList(int index) {
        return hashArray[index];
    }

    public int size() {
        return arraySize;
    }

    public int hashFunc(int elem) {
        return elem % arraySize;
    }

    public void insert(int elem) {
        int index = hashFunc(elem);
        if (!hashArray[index].contains(elem)) hashArray[index].addFirst(elem);
    }

    public void delete(int elem) {
        int index = hashFunc(elem);

        if (hashArray[index].contains(elem)) hashArray[index].remove((Object)elem);
    }

    public boolean find(int elem) {
        int index = hashFunc(elem);

        return hashArray[index].contains(elem);
    }

    public void print() {
        System.out.println("Tablica hashująca:");

        for (int i=0;i<arraySize;i++) {
            for (int elem : hashArray[i]) {
                System.out.print(elem  + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(4);

        hashTable.insert(1);
        hashTable.insert(11);
        hashTable.insert(2);
        hashTable.insert(32);
        hashTable.insert(42);
        hashTable.insert(3);
        hashTable.insert(33);
        hashTable.insert(4);
        hashTable.insert(89);
        hashTable.insert(78);

        hashTable.print();

        boolean result1 = hashTable.find(3);
        System.out.println("Wynik wyszukiwania 3:"+result1);

        hashTable.delete(3);

        hashTable.print();

        boolean result2 = hashTable.find(3);
        System.out.println("Wynik wyszukiwania 3:"+result2);
    }
}
