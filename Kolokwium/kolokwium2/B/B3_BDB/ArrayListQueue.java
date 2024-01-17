package B.B3_BDB;
import java.util.ArrayList;
// B3 Implementacja kolejki za pomocą klasy "ArrayListQueue" - BDB
public class ArrayListQueue {
    private ArrayList<Auto> queue; // Prywatne pole przechowujące kolejkę samochodów
    public ArrayListQueue() {
        queue = new ArrayList<>(); // Konstruktor tworzący nową kolejkę na bazie listy dynamicznej
    }
    public void push(Auto a) { // Metoda push do dodawania samochodu do kolejki
        queue.add(a); // Dodawanie na końcu listy, co odpowiada dodaniu do kolejki
    }
    public Auto pop() { // Metoda pop do usuwania i zwracania samochodu z początku kolejki
        return queue.remove(0); // Usuwanie i zwracanie pierwszego elementu listy, co odpowiada zdjęciu samochodu z początku kolejki
    }
    public Auto peek() { // Metoda peek do podglądania samochodu na początku kolejki
        return queue.get(0); // Pobieranie pierwszego elementu listy, co odpowiada podglądaniu samochodu na początku kolejki
    }
    public boolean isEmpty() { // Metoda isEmpty do sprawdzania, czy kolejka jest pusta
        return queue.isEmpty(); // Sprawdzanie, czy lista jest pusta, co oznacza pustą kolejkę
    }
    public int size() { // Metoda size do pobierania rozmiaru kolejki
        return queue.size(); // Pobieranie rozmiaru listy, co odpowiada rozmiarowi kolejki
    }
    public static void main(String[] args) {
        var queue = new ArrayListQueue(); // Tworzenie nowej kolejki na bazie listy dynamicznej
        Auto A = new Auto("Honda", 1.1);
        Auto B = new Auto("Audi", 1.2);
        Auto C = new Auto("BMW", 1.9);
        Auto D = new Auto("Opel", 2.2);
        Auto E = new Auto("Rolls Royce", 1.1);
        System.out.println("DODAWANIE");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        queue.push(A); // Dodawanie samochodów do kolejki
        queue.push(B);
        queue.push(C);
        System.out.println("USUWAM");
        System.out.println(queue.pop().toString()); // Usuwanie i wypisywanie samochodu z początku kolejki
        System.out.println(queue.pop().toString());
        System.out.println("DODAWANIE");
        System.out.println(D);
        System.out.println(E);
        queue.push(D); // Dodawanie kolejnych samochodów do kolejki
        queue.push(E);
        System.out.println("USUWAM");
        while (!queue.isEmpty()) { // Wypisywanie zawartości kolejki, aż kolejka nie będzie pusta
            System.out.println(queue.pop().toString()); // Usuwanie i wypisywanie samochodu z początku kolejki
        }
    }
}
