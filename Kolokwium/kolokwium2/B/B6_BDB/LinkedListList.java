package B.B6_BDB;
// B6 Implementacja listy z bezpośrednim dostępem do każdego elementu poprzez podanie jego numeru za pomocą klasy "LinkedList" - BDB
import java.util.LinkedList;
public class LinkedListList {
    private LinkedList<Cat> list; // Prywatna lista przechowująca obiekty klasy Cat
    public LinkedListList() {
        list = new LinkedList<>(); // Inicjalizacja listy w konstruktorze
    }
    public void insertFirst(Cat c) {
        list.addFirst(c); // Wstawienie obiektu na początek listy
    }
    public void insertLast(Cat c) {
        list.addLast(c); // Wstawienie obiektu na koniec listy
    }
    public Cat removeLast() {
        return list.removeLast(); // Usunięcie i zwrócenie ostatniego obiektu z listy
    }
    public Cat removeFirst() {
        return list.removeFirst(); // Usunięcie i zwrócenie pierwszego obiektu z listy
    }
    public Cat getLast() {
        return list.getLast(); // Pobranie ostatniego obiektu z listy
    }
    public Cat getFirst() {
        return list.getFirst(); // Pobranie pierwszego obiektu z listy
    }
    public void print() {
        System.out.println("Zawartosc listy:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " "); // Wyświetlenie zawartości listy
        }
    }
    public static void main(String[] args) {
        Cat A = new Cat("Puszek", 4.78);
        Cat B = new Cat("Pisek", 4.21);
        Cat C = new Cat("Borys", 11.33);
        Cat D = new Cat("Cargo", 1.98);
        Cat E = new Cat("Wasek", 2.65);
        Cat F = new Cat("Czarny", 3.08);
        var list = new LinkedListList();
        list.insertLast(A);
        list.insertLast(B);
        list.insertLast(C);
        list.print();
        list.removeLast();
        list.removeLast();
        list.print();
        list.insertFirst(D);
        list.insertFirst(E);
        list.insertFirst(F);
        list.print();
        list.removeFirst();
        list.removeFirst();
        list.print();
    }
}
