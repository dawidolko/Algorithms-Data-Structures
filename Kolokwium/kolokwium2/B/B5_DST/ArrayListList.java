package B.B5_DST;

// B5 Implementacja listy z bezpośrednim dostępem do każdego elementu poprzez podanie jego numeru za pomocą klasy "ArrayList" - DST

import java.util.ArrayList;

public class ArrayListList {
    private ArrayList<Integer> intList;

    public ArrayListList() {  // Konstruktor
        intList = new ArrayList<>();
    }

    public boolean addLast(int elem) {  // Dodawanie elementów (int)
        return intList.add(elem);
    }

    public int removeLast() {  // Usuwanie elementów (int)
        if (!intList.isEmpty()) {
            int lastIndex = intList.size() - 1;
            return intList.remove(lastIndex);
        }
        return -1; // Zwraca -1, jeśli lista jest pusta
    }

    public int get(int index) {  // Pobieranie elementu o danym indeksie (int)
        return intList.get(index);
    }

    public int find(int elem) {  // Wyszukiwanie elementów (int)
        return intList.indexOf(elem);
    }

    public int size() {  // Rozmiar listy
        return intList.size();
    }

    public void print() {  // Wypisywanie listy
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayListList theList = new ArrayListList();

        // Dodaj liczby całkowite (int) do listy
        theList.addLast(10);
        theList.addLast(20);
        theList.addLast(30);
        theList.addLast(40);
        theList.addLast(50);

        theList.print();
        System.out.println();

        System.out.println(theList.get(3));
        System.out.println();

        theList.print();
        System.out.println();

        System.out.println(theList.removeLast());
        System.out.println();

        System.out.println(theList.find(50));
        System.out.println();

        theList.print();
        System.out.println();
    }
}
