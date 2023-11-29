package A.A6_HashTable;

import java.util.LinkedList;
import java.util.Random;

public class HashTable {
    private LinkedList<Integer>[] hashArray;
    private int arraySize;

    public HashTable(int size) {
        hashArray = new LinkedList[size];
        arraySize = size;

        for (int i=0;i<size;i++) hashArray[i] = new LinkedList<>();
    }

    public int size() {
        return arraySize;
    }

    public int hashFunc(int x) {
        return x % arraySize;
    }

    public void add(int x) {
        int index = hashFunc(x);

        if (!hashArray[index].contains(x)) hashArray[index].add(x);
    }

    public void remove(int x) {
        int index = hashFunc(x);

        if (hashArray[index].contains(x)) hashArray[index].remove(x);
    }

    public LinkedList<Integer> getLinkedList(int index) {
        return hashArray[index];
    }

    public boolean find(int x) {
        int index = hashFunc(x);
        return hashArray[index].contains(x);
    }

    public void print() {
        System.out.println("Zawartosc listy: ");

        for (int i=0;i<arraySize;i++) {
            for (Object e : hashArray[i]) System.out.print(e+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashTable hash = new HashTable(5);
        Random rand = new Random();

        for (int i=0;i<15;i++) {
            int num = rand.nextInt(0,100);
            hash.add(num);
        }

        hash.print();
    }
}
