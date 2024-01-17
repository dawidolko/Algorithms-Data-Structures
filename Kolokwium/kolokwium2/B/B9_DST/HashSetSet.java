package B.B9_DST;

// B9 Implementacja zbioru za pomocą klasy "HashSet" - DST

import java.util.HashSet;
import java.util.Iterator;


public class HashSetSet
{
    private HashSet<Integer> hashSet;

    public HashSetSet()    // konstruktor
    {
        hashSet = new HashSet<Integer>();
    }

    public HashSet<Integer> getHashSet() 
    { 
        return hashSet; 
    }

    public int size() //Zwraca liczbe elementow w zbiorze
    {
        return hashSet.size();
    }

    public void insert(int elem)    // wstawia element do zbioru
    {
        if (!member(elem))
        {
            hashSet.add(elem);
        }
    }

    public boolean member(int elem)  // sprawdza, czy dany element nalezy do zbioru
    {
        return hashSet.contains(elem);
    }

    public boolean delete(int elem)  // usuwa element ze zbioru
    {
        if (member(elem))
        {
            hashSet.remove(elem);
            return true;
        }
        else return false;
    }


    public HashSetSet union(HashSetSet secondSet) //Oblicza sume zbioru biezacego ze zbiorem z parametru metody
    {
        HashSetSet unionSet = new HashSetSet();
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext())
        {
            int locElem = iterator.next().intValue();
            unionSet.insert(locElem);
        }

        Iterator<Integer> iteratorS = secondSet.getHashSet().iterator();
        while (iteratorS.hasNext())
        {
            int locElem = iteratorS.next().intValue();;
            unionSet.insert(locElem);
        }

        return unionSet;
    }

    public HashSetSet intersection(HashSetSet secondSet) //Oblicza iloczyn zbioru biezacego ze zbiorem z parametru metody
    {
        HashSetSet intersectionSet = new HashSetSet();

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext())
        {
            int locElem = iterator.next().intValue();
            if (secondSet.member(locElem))
            {
                intersectionSet.insert(locElem);
            }
        }

        return intersectionSet;
    }

    public HashSetSet difference(HashSetSet secondSet) //Oblicza roznice zbioru biezacego ze zbiorem z parametru metody
    {
        HashSetSet differenceSet = new HashSetSet();

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext())
        {
            int locElem = iterator.next().intValue();
            if (!secondSet.member(locElem))
            {
                differenceSet.insert(locElem);
            }
        }

        return differenceSet;
    }

    public void print()
    {
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext())
        {
            int locElem = iterator.next().intValue();
            System.out.print(locElem+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        HashSetSet theSetA = new HashSetSet();  // tworzymy nowy zbior A
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

        HashSetSet theSetB = new HashSetSet();  // tworzymy nowy zbior B
        theSetB.insert(40);     // dodajemy elementy do zbioru
        theSetB.insert(70);
        theSetB.insert(60);
        theSetB.insert(80);

        System.out.println("Zbior B:");
        theSetB.print();


        HashSetSet unionSet = theSetA.union(theSetB); //Obliczenie sumy zbiorow
        System.out.println("Suma A i B:");
        unionSet.print();

        HashSetSet intersectionSet = theSetA.intersection(theSetB); //Obliczenie iloczynu zbiorow
        System.out.println("Iloczyn A i B:");
        intersectionSet.print();

        HashSetSet differenceSet = theSetA.difference(theSetB); //Obliczenie roznicy zbiorow
        System.out.println("Roznica A-B:");
        differenceSet.print();


    }
}
