package A.A1_BDB;
// A1 Implementacja tablicy dynamicznej "DynArray" - BDB
// Klasa DynArray reprezentuje dynamiczną tablicę przechowującą obiekty klasy Point.
public class DynArray {
    public int nElems; // Liczba elementów w tablicy
    public Point[] tab; // Tablica przechowująca obiekty klasy Point
    // Konstruktor inicjalizuje tablicę o początkowej wielkości n.
    public DynArray(int n) {
        tab = new Point[n];
        nElems = 0; // Inicjalizacja liczby elementów na zero.
    }
    // Metoda add dodaje obiekt klasy Point do tablicy.
    // Jeśli tablica jest zapełniona, zwiększa jej rozmiar o 2.
    public void add(Point p) {
        if (nElems >= tab.length) {
            Point[] tempTab = new Point[nElems + 2];
            for (int i = 0; i < nElems; i++) tempTab[i] = tab[i];
            tab = tempTab;
        }
        tab[nElems] = p; // Dodawanie elementu do tablicy
        nElems++; // Zwiększanie liczby elementów w tablicy
    }
    // Metoda remove usuwa element o podanym indeksie z tablicy.
    // Zwraca true, jeśli operacja powiedzie się, lub false w przeciwnym przypadku.
    public boolean remove(int index) {
        if (index < 0 || index >= nElems) return false;
        for (int i = index; i < nElems - 1; i++) tab[i] = tab[i + 1];
        nElems--;
        return true;
    }
    // Metoda get zwraca element o podanym indeksie.
    public Point get(int index) {
        return tab[index];
    }
    // Metoda size zwraca aktualną liczbę elementów w tablicy.
    public int size() {
        return nElems;
    }
    // Metoda find1 szuka obiektu klasy Point w tablicy i zwraca jego indeks.
    // Zwraca -1, jeśli nie znajdzie.
    public int find1(Point p) {
        for (int i = 0; i < nElems; i++) {
            if (p.equals(tab[i])) return i;
        }
        return -1;
    }
    // Metoda find2 szuka obiektu klasy Point w tablicy na podstawie współrzędnych x i y.
    // Zwraca indeks, jeśli znajdzie, lub -1, jeśli nie.
    public int find2(Point p) {
        for (int i = 0; i < nElems; i++) {
            if (p.getX() == tab[i].getX() && p.getY() == tab[i].getY()) return i;
        }
        return -1;
    }
    // Metoda print1 wypisuje zawartość tablicy na konsoli.
    public void print1() {
        System.out.println("Zawartosc listy:");
        for (int i = 0; i < nElems; i++) {
            System.out.println(tab[i].toString());
        }
    }
    // Metoda print2 wypisuje zawartość tablicy w formie czytelnej, zawierając nazwę punktu.
    public void print2() {
        System.out.println("Zawartosc listy:");
        for (int i = 0; i < nElems; i++) {
            System.out.println("Punkt: x=" + tab[i].getX() + ", y=" + tab[i].getY() + " Nazwa: " + tab[i].getNazwa());
        }
    }
    // Metoda main zawiera przykładowe użycie klasy DynArray.
    public static void main(String[] args) {
        Point p1 = new Point(1, 2, "kwadrat");
        Point p2 = new Point(3, 4, "kwadrat");
        Point p3 = new Point(0, 9, "kwadrat");
        Point p4 = new Point(4, 5, "kwadrat");
        DynArray tab = new DynArray(1);
        tab.add(p1);
        tab.add(p2);
        tab.add(p3);
        tab.add(p4);
        tab.print1();
        tab.remove(2);
        System.out.println(tab.find2(p1));
        System.out.println(tab.find2(p3));
        System.out.println(tab.find1(new Point(1, 2, "kwadrat")));
        tab.print2();
    }
}
