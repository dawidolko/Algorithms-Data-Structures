package B.B4_BDB;
// B4 Implementacja kolejki za pomocą klasy "LinkedListQueue" - BDB
import java.util.LinkedList;
public class LinkedListQueue {
    private LinkedList<Auto> queue; // Prywatne pole przechowujące kolejkę samochodów
    public LinkedListQueue() {
        queue = new LinkedList<>(); // Inicjalizacja kolejki jako pustej listy wiązanej
    }
    public void push(Auto a) {
        queue.addLast(a); // Dodawanie samochodu na końcu kolejki
    }
    public Auto peek() {
        return queue.getFirst(); // Pobieranie pierwszego samochodu w kolejce (bez usuwania)
    }
    public Auto pop() {
        return queue.removeFirst(); // Pobieranie i usuwanie pierwszego samochodu w kolejce
    }
    public boolean isEmpty() {
        return queue.isEmpty(); // Sprawdzanie, czy kolejka jest pusta
    }
    public int size() {
        return queue.size(); // Pobieranie rozmiaru kolejki
    }
    public static void main(String[] args) {
        var queue = new LinkedListQueue(); // Tworzenie obiektu kolejki
        Auto A = new Auto("Honda", 1.1);
        Auto B = new Auto("Audi", 1.2);
        Auto C = new Auto("BMW", 1.9);
        Auto D = new Auto("Opel", 2.2);
        Auto E = new Auto("Rolls Royce", 1.1);
        System.out.println("DODAWANIE");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        queue.push(A);
        queue.push(B);
        queue.push(C);
        System.out.println("USUWAM");
        System.out.println(queue.pop().toString()); // Wyświetlanie i usuwanie pierwszego samochodu
        System.out.println(queue.pop().toString()); // Wyświetlanie i usuwanie pierwszego samochodu
        System.out.println("DODAWANIE");
        System.out.println(D);
        System.out.println(E);
        queue.push(D);
        queue.push(E);
        System.out.println("USUWAM");
        while (!queue.isEmpty()) { // Wyświetlanie i usuwanie wszystkich samochodów w kolejce
            System.out.println(queue.pop().toString());
        }
    }
}