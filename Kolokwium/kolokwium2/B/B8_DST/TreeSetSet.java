
package B.B8_DST;

// B8 Implementacja zbioru za pomocą klasy "TreeSet" - DST

//Implementacja zbioru liczb calkowitych za pomoca klasy TreeSet

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetSet
{
    private TreeSet<Integer> treeSet;

    public TreeSetSet()    // konstruktor
    {
        treeSet = new TreeSet<Integer>();        
    }

    public TreeSet<Integer> getTreeSet() 
    { 
        return treeSet; 
    }

    public int size() //Zwraca liczbe elementow w zbiorze
    {
        return treeSet.size();
    }

    public void insert(int elem)    // wstawia element do zbioru
    {
        if (!member(elem)) // sprawdza, czy dany element nalezy do zbioru
            treeSet.add(elem);            
    }

    public boolean member(int elem)  // sprawdza, czy dany element nalezy do zbioru
    {
        return treeSet.contains(elem);
    }

    public boolean delete(int elem)  // usuwa element ze zbioru
    {
        if (member(elem)) // sprawdza, czy dany element nalezy do zbioru
        {
            treeSet.remove(elem);
            return true;
        }
        else return false;
    }


    public TreeSetSet union(TreeSetSet secondSet) //Oblicza sume zbioru biezacego ze zbiorem z parametru metody
    {
        TreeSetSet unionSet = new TreeSetSet();
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

    public TreeSetSet intersection(TreeSetSet secondSet) //Oblicza iloczyn zbioru biezacego ze zbiorem z parametru metody
    {
        TreeSetSet intersectionSet = new TreeSetSet();

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext())
        {
            int locElem = iterator.next().intValue();
            if (secondSet.member(locElem))
                intersectionSet.insert(locElem);
        }

        return intersectionSet;
    }

    public TreeSetSet difference(TreeSetSet secondSet) //Oblicza roznice zbioru biezacego ze zbiorem z parametru metody
    {
        TreeSetSet differenceSet = new TreeSetSet();

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
        TreeSetSet theSetA = new TreeSetSet();  // tworzymy nowy zbior A
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

        TreeSetSet theSetB = new TreeSetSet();  // tworzymy nowy zbior B
        theSetB.insert(40);     // dodajemy elementy do zbioru
        theSetB.insert(70);
        theSetB.insert(60);
        theSetB.insert(80);

        System.out.println("Zbior B:");
        theSetB.print();


        TreeSetSet unionSet = theSetA.union(theSetB); //Obliczenie sumy zbiorow
        System.out.println("Suma A i B:");
        unionSet.print();

        TreeSetSet intersectionSet = theSetA.intersection(theSetB); //Obliczenie iloczynu zbiorow
        System.out.println("Iloczyn A i B:");
        intersectionSet.print();

        TreeSetSet differenceSet = theSetA.difference(theSetB); //Obliczenie roznicy zbiorow
        System.out.println("Roznica A-B:");
        differenceSet.print();
        
        TreeSetSet differenceSet2 = theSetB.difference(theSetA); //Obliczenie roznicy zbiorow
        System.out.println("Roznica B-A:");
        differenceSet2.print();
       
    }
}
