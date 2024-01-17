package B.B5_BDB;
// B5 Implementacja listy z bezpośrednim dostępem do każdego elementu poprzez podanie jego numeru za pomocą klasy "ArrayList" - BDB
import java.util.ArrayList;
public class ArrayListList {
    private ArrayList<Cat> list; // Prywatne pole przechowujące listę kotów
    public ArrayListList() {
        list = new ArrayList<>(); // Inicjalizacja listy jako pustej listy tablicowej
    }
    public void addLast(Cat c) {
        list.add(c); // Dodawanie kota na koniec listy
    }
    public Cat removeLast() {
        int index = list.size() - 1;
        return list.remove(index); // Usuwanie i zwracanie ostatniego kota z listy
    }
    public Cat get(int index) {
        return list.get(index); // Pobieranie kota z listy na podstawie indeksu
    }
    public int size() {
        return list.size(); // Pobieranie rozmiaru listy
    }
    public int find(Cat c) {
        return list.indexOf(c); // Znajdowanie indeksu kota w liście
    }
    public void print() {
        System.out.println("Zawartosc listy:");
        for (int i = 0; i < size(); i++) {
            System.out.println(list.get(i).toString()); // Wyświetlanie zawartości listy
        }
    }
    public static void main(String[] args) {
        Cat A = new Cat("Puszek", 4.78);
        Cat B = new Cat("Pisek", 4.21);
        Cat C = new Cat("Borys", 11.33);
        Cat D = new Cat("Cargo", 1.98);
        Cat E = new Cat("Wasek", 2.65);
        Cat F = new Cat("Czarny", 3.08);
        var list = new ArrayListList();
        list.addLast(A);
        list.addLast(B);
        list.addLast(C);
        System.out.println("test" + list.get(2).toString());
        list.print();
        list.removeLast();
        list.removeLast();
        list.print();
        list.addLast(D);
        list.addLast(E);
        list.addLast(F);
        list.print();
    }
}

