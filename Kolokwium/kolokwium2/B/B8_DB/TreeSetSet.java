package B.B8_DB;

// B8 Implementacja zbioru za pomocą klasy "TreeSet" - DB

//Implementacja zbioru liczb calkowitych za pomoca klasy TreeSet

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetSet
{
    private TreeSet<Integer> treeSet;


    public TreeSetSet() {  // Konstruktor
        treeSet = new TreeSet<>();
    }

    public TreeSet<Integer> getTreeSet() {
        return treeSet;
    }

    public int size() { // Zwraca liczbę elementów w zbiorze
        return treeSet.size();
    }

    public void insert(Integer elem) {  // Wstawia element do zbioru
        if (!member(elem))  // Sprawdza, czy dany element należy do zbioru
            treeSet.add(elem);
    }

    public boolean member(Integer elem) {  // Sprawdza, czy dany element należy do zbioru
        return treeSet.contains(elem);
    }

    public boolean delete(Integer elem) {  // Usuwa element ze zbioru
        if (member(elem)) { // Sprawdza, czy dany element należy do zbioru
            treeSet.remove(elem);
            return true;
        }
        else return false;
    }


    public B.B8_DST.TreeSetSet union(B.B8_DST.TreeSetSet secondSet) //Oblicza sume zbioru biezacego ze zbiorem z parametru metody
    {
        B.B8_DST.TreeSetSet unionSet = new B.B8_DST.TreeSetSet();
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            int locElem = iterator.next().intValue();
            unionSet.insert(locElem);
        }

        Iterator<Integer> iteratorS = secondSet.getTreeSet().iterator();
        while (iteratorS.hasNext())
        {
            int locElem = iteratorS.next().intValue();
            unionSet.insert(locElem);
        }

        return unionSet;
    }

    public B.B8_DST.TreeSetSet intersection(B.B8_DST.TreeSetSet secondSet) //Oblicza iloczyn zbioru biezacego ze zbiorem z parametru metody
    {
        B.B8_DST.TreeSetSet intersectionSet = new B.B8_DST.TreeSetSet();

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            int locElem = iterator.next().intValue();
            if (secondSet.member(locElem))
                intersectionSet.insert(locElem);
        }

        return intersectionSet;
    }

    public B.B8_DST.TreeSetSet difference(B.B8_DST.TreeSetSet secondSet) //Oblicza roznice zbioru biezacego ze zbiorem z parametru metody
    {
        B.B8_DST.TreeSetSet differenceSet = new B.B8_DST.TreeSetSet();

        Iterator<Integer> iterator = treeSet.iterator();

        while (iterator.hasNext())
        {
            int locElem = iterator.next().intValue();
            if (!secondSet.member(locElem))
                differenceSet.insert(locElem);
        }

        return differenceSet;
    }

    public void print()
    {
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            int locElem = iterator.next().intValue();
            System.out.print(locElem+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        B.B8_DST.TreeSetSet theSetA = new B.B8_DST.TreeSetSet();  // tworzymy nowy zbior A
        theSetA.insert(60);     // dodajemy elementy do zbioru
        theSetA.insert(20);
        theSetA.insert(40);

        theSetA.print();

        boolean test20 = theSetA.member(20);
        System.out.println("Wynik testu w zbiorze A dla 20: "+test20);

        theSetA.print();

        boolean test30 = theSetA.member(30);
        System.out.println("Wynik w zbiorze A pierwszego testu dla 30: "+test30);

        theSetA.insert(30);

        theSetA.print();

        test30 = theSetA.member(30);
        System.out.println("Wynik w zbiorze A drugiego testu dla 30: "+test30);

        theSetA.delete(30);

        theSetA.print();

        test30 = theSetA.member(30);
        System.out.println("Wynik w zbiorze A trzeciego testu dla 30: "+test30);

        theSetA.insert(10); //Dodanie jeszcze dwoch elementow
        theSetA.insert(90);

        System.out.println("--------------------------------------------");

        System.out.println("Zbior A:");
        theSetA.print();

        B.B8_DST.TreeSetSet theSetB = new B.B8_DST.TreeSetSet();  // tworzymy nowy zbior B
        theSetB.insert(40);     // dodajemy elementy do zbioru
        theSetB.insert(70);
        theSetB.insert(60);
        theSetB.insert(80);

        System.out.println("Zbior B:");
        theSetB.print();


        B.B8_DST.TreeSetSet unionSet = theSetA.union(theSetB); //Obliczenie sumy zbiorow
        System.out.println("Suma A i B:");
        unionSet.print();

        B.B8_DST.TreeSetSet intersectionSet = theSetA.intersection(theSetB); //Obliczenie iloczynu zbiorow
        System.out.println("Iloczyn A i B:");
        intersectionSet.print();

        B.B8_DST.TreeSetSet differenceSet = theSetA.difference(theSetB); //Obliczenie roznicy zbiorow
        System.out.println("Roznica A-B:");
        differenceSet.print();

        B.B8_DST.TreeSetSet differenceSet2 = theSetB.difference(theSetA); //Obliczenie roznicy zbiorow
        System.out.println("Roznica B-A:");
        differenceSet2.print();

    }
}
