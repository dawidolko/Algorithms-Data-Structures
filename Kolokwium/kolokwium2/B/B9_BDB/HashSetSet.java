package B.B9_BDB;
// B9 Implementacja zbioru za pomocą klasy "HashSet" - BDB
import java.util.HashSet;
import java.util.Iterator;
public class HashSetSet {
    private HashSet<Book> set;
    public HashSetSet() {
        set = new HashSet<>();
    }
    public HashSet<Book> getHashSet() {
        return set;
    }
    public int size() {
        return set.size();
    }
    public boolean member(Book b) {
        return set.contains(b);
    }
    public void insert(Book b) {
        if (!member(b)) set.add(b);
    }
    public boolean delete(Book b) {
        if (member(b)) {
            set.remove(b);
            return true;
        } else return false;
    }
    public HashSetSet union(HashSetSet secondSet) {
        var unionSet = new HashSetSet();
        Iterator<Book> it = set.iterator();
        while (it.hasNext()) {
            Book e = it.next();
            unionSet.insert(e);
        }
        Iterator<Book> it2 = secondSet.getHashSet().iterator();
        while (it2.hasNext()) {
            Book e = it2.next();
            unionSet.insert(e);
        }

        return unionSet;
    }
    public HashSetSet intersection(HashSetSet secondSet) {
        var resultSet = new HashSetSet();
        Iterator<Book> it = set.iterator();
        while (it.hasNext()) {
            Book e = it.next();
            if (secondSet.member(e)) resultSet.insert(e);
        }
        return resultSet;
    }
    public HashSetSet difference(HashSetSet secondSet) {
        var resultSet = new HashSetSet();

        Iterator<Book> it = set.iterator();
        while (it.hasNext()) {
            Book e = it.next();
            if (!secondSet.member(e)) resultSet.insert(e);
        }
        return resultSet;
    }
    public void print()  {
        Iterator<Book> iterator = set.iterator();
        System.out.println("Zawartosc zbioru:");
        while (iterator.hasNext())  {
            Book locElem = iterator.next();
            System.out.println(locElem.toString());
        }
    }
    public static void main(String[] args) {
        Book A = new Book("A", 111);
        Book B = new Book("B", 111);
        Book C = new Book("C", 111);
        Book D = new Book("D", 111);
        Book E = new Book("E", 111);
//        Book F = new Book("F", 111);
//        Book G = new Book("G", 111);
//        Book H = new Book("H", 111);
//        Book I = new Book("I", 111);

        HashSetSet theSetA = new HashSetSet();
        theSetA.insert(A);
        theSetA.insert(B);
        theSetA.insert(C);
        theSetA.insert(D);
        HashSetSet theSetB = new HashSetSet();
        theSetB.insert(C);
        theSetB.insert(D);
        theSetB.insert(E);
        System.out.println("Zbior A: ");
        theSetA.print();
        System.out.println("Zbiór B: ");
        theSetB.print();
        HashSetSet unionSet = theSetA.union(theSetB);
        System.out.println("Suma A i B: ");
        unionSet.print();
        HashSetSet intersecionSet = theSetA.intersection(theSetB);
        System.out.println("Iloczyn A i B: ");
        intersecionSet.print();
        HashSetSet differenceSet = theSetA.difference(theSetB);
        System.out.println("Różnica A-B: ");
        differenceSet.print();

        theSetA.delete(C);
        theSetB.delete(E);

        System.out.println("Zbior A: ");
        theSetA.print();
        System.out.println("Zbiór B: ");
        theSetB.print();
        unionSet = theSetA.union(theSetB);
        System.out.println("Suma A i B: ");
        unionSet.print();
        intersecionSet = theSetA.intersection(theSetB);
        System.out.println("Iloczyn A i B: ");
        intersecionSet.print();
        differenceSet = theSetA.difference(theSetB);
        System.out.println("Różnica A-B: ");
        differenceSet.print();
//        Book A = new Book("A", 111);
//        Book B = new Book("B", 111);
//        Book C = new Book("C", 111);
//        Book D = new Book("D", 111);
//        Book E = new Book("E", 111);
//        Book F = new Book("F", 111);
//        Book G = new Book("G", 111);
//        Book H = new Book("H", 111);
//        Book I = new Book("I", 111);
//        HashSetSet theSetA = new HashSetSet();  // tworzymy nowy zbior A
//        theSetA.insert(A);     // dodajemy elementy do zbioru
//        theSetA.insert(B);
//        theSetA.insert(C);
//        theSetA.print();
//        boolean test20 = theSetA.member(A);
//        System.out.println("Wynik testu w zbiorze A dla 20: "+test20);
//        theSetA.print();
//        boolean test30 = theSetA.member(D);
//        System.out.println("Wynik w zbiorze A pierwszego testu dla 30: "+test30);
//        theSetA.insert(D);
//        theSetA.print();
//        test30 = theSetA.member(D);
//        System.out.println("Wynik w zbiorze A drugiego testu dla 30: "+test30);
//        theSetA.delete(D);
//        theSetA.print();
//        test30 = theSetA.member(D);
//        System.out.println("Wynik w zbiorze A trzeciego testu dla 30: "+test30);
//        theSetA.insert(E); //Dodanie jeszcze dwoch elementow
//        theSetA.insert(F);
//        System.out.println("--------------------------------------------");
//        System.out.println("Zbior A:");
//        theSetA.print();
//        HashSetSet theSetB = new HashSetSet();  // tworzymy nowy zbior B
//        theSetB.insert(G);     // dodajemy elementy do zbioru
//        theSetB.insert(H);
//        System.out.println("Zbior B:");
//        theSetB.print();
//        HashSetSet unionSet = theSetA.union(theSetB); //Obliczenie sumy zbiorow
//        System.out.println("Suma A i B:");
//        unionSet.print();
//        HashSetSet intersectionSet = theSetA.intersection(theSetB); //Obliczenie iloczynu zbiorow
//        System.out.println("Iloczyn A i B:");
//        intersectionSet.print();
//        HashSetSet differenceSet = theSetA.difference(theSetB); //Obliczenie roznicy zbiorow
//        System.out.println("Roznica A-B:");
//        differenceSet.print();
    }
}
