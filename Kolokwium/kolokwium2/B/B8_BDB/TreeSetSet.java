package B.B8_BDB;
// B8 Implementacja zbioru za pomocą klasy "TreeSet" - BDB
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetSet {
    private TreeSet<Book> set; // Prywatne pole przechowujące zbiór książek
    public TreeSetSet() {
        set = new TreeSet<>(); // Konstruktor inicjalizujący zbiór
    }
    public TreeSet<Book> getTreeSet() {
        return set; // Metoda zwracająca zbiór
    }
    public int size() {
        return set.size(); // Metoda zwracająca liczbę elementów w zbiorze
    }
    public void insert(Book b) {
        if (!member(b)) set.add(b); // Metoda dodająca książkę do zbioru, jeśli jej nie ma jeszcze w zbiorze
    }
    public boolean member(Book b) {
        return set.contains(b); // Metoda sprawdzająca, czy książka jest już w zbiorze
    }
    public boolean delete(Book b) {
        if (member(b)) {
            set.remove(b);
            return true; // Metoda usuwająca książkę ze zbioru, jeśli istnieje w zbiorze
        } else return false;
    }
    public void print() {
        Iterator<Book> iterator = set.iterator();
        System.out.println("Zawartosc zbioru:");
        while (iterator.hasNext()) {
            Book locElem = iterator.next();
            System.out.println(locElem.toString()); // Metoda wypisująca zawartość zbioru
        }
    }
    public TreeSetSet union(TreeSetSet secondSet) {
        TreeSetSet unionSet = new TreeSetSet();
        Iterator<Book> iterator = set.iterator();
        while (iterator.hasNext()) {
            Book e = iterator.next();
            unionSet.insert(e);
        }
        Iterator<Book> secondIterator = secondSet.getTreeSet().iterator();
        while (secondIterator.hasNext()) {
            Book e = secondIterator.next();
            unionSet.insert(e);
        }
        return unionSet; // Metoda obliczająca sumę dwóch zbiorów i zwracająca wynik
    }
    public TreeSetSet intersection(TreeSetSet secondSet) {
        TreeSetSet intersectionSet = new TreeSetSet();
        Iterator<Book> it = set.iterator();
        while (it.hasNext()) {
            Book elem = it.next();
            if (secondSet.member(elem)) intersectionSet.insert(elem);
        }
        return intersectionSet; // Metoda obliczająca iloczyn dwóch zbiorów i zwracająca wynik
    }
    public TreeSetSet difference(TreeSetSet secondSet) {
        TreeSetSet differenceSet = new TreeSetSet();
        Iterator<Book> it = set.iterator();
        while (it.hasNext()) {
            Book elem = it.next();
            if (!secondSet.member(elem)) differenceSet.insert(elem);
        }
        return differenceSet; // Metoda obliczająca różnicę dwóch zbiorów i zwracająca wynik
    }
    public static void main(String[] args) {
        Book A = new Book("A", 111);
        Book B = new Book("B", 111);
        Book C = new Book("C", 111);
        Book D = new Book("D", 111);
        Book E = new Book("E", 111);
        Book F = new Book("F", 111);
        Book G = new Book("G", 111);
        Book H = new Book("H", 111);
        Book I = new Book("I", 111);
        TreeSetSet theSetA = new TreeSetSet(); // Tworzymy nowy zbiór A
        theSetA.insert(A); // Dodajemy elementy do zbioru
        theSetA.insert(B);
        theSetA.insert(C);
        theSetA.print();
        boolean test20 = theSetA.member(A);
        System.out.println("Wynik testu w zbiorze A dla 20: " + test20);
        theSetA.print();
        boolean test30 = theSetA.member(D);
        System.out.println("Wynik w zbiorze A pierwszego testu dla 30: " + test30);
        theSetA.insert(D);
        theSetA.print();
        test30 = theSetA.member(D);
        System.out.println("Wynik w zbiorze A drugiego testu dla 30: " + test30);
        theSetA.delete(D);
        theSetA.print();
        test30 = theSetA.member(D);
        System.out.println("Wynik w zbiorze A trzeciego testu dla 30: " + test30);
        theSetA.insert(E); // Dodanie jeszcze dwóch elementów
        theSetA.insert(F);
        System.out.println("--------------------------------------------");
        System.out.println("Zbior A:");
        theSetA.print();
        TreeSetSet theSetB = new TreeSetSet(); // Tworzymy nowy zbiór B
        theSetB.insert(G); // Dodajemy elementy do zbioru
        theSetB.insert(H);
        System.out.println("Zbior B:");
        theSetB.print();
        TreeSetSet unionSet = theSetA.union(theSetB); // Obliczenie sumy zbiorów
        System.out.println("Suma A i B:");
        unionSet.print();
        TreeSetSet intersectionSet = theSetA.intersection(theSetB); // Obliczenie iloczynu zbiorów
        System.out.println("Iloczyn A i B:");
        intersectionSet.print();
        TreeSetSet differenceSet = theSetA.difference(theSetB); // Obliczenie różnicy zbiorów
        System.out.println("Roznica A-B:");
        differenceSet.print();
    }
}
