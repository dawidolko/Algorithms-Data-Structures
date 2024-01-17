package B.B2_BDB;
import java.util.LinkedList;
// B2 Implementacja stosu za pomocą klasy "LinkedList" - BDB
public class LinkedListStack {
    private LinkedList<Drink> stack; // Prywatne pole przechowujące stos napojów
    public LinkedListStack() {
        stack = new LinkedList<>(); // Konstruktor tworzący nowy stos na bazie listy wiązanej
    }
    public void push(Drink d) { // Metoda push do dodawania napoju na wierzch stosu
        stack.addFirst(d); // Dodawanie na początek listy, co odpowiada dodaniu na wierzch stosu
    }
    public Drink peek() { // Metoda peek do podglądania napoju na wierzchu stosu
        return stack.getFirst(); // Zwracanie pierwszego elementu listy, czyli napoju na wierzchu stosu
    }
    public Drink pop() { // Metoda pop do usuwania napoju z wierzchu stosu
        return stack.removeFirst(); // Usuwanie i zwracanie pierwszego elementu listy, co odpowiada zdjęciu napoju z wierzchu stosu
    }
    public boolean isEmpty() { // Metoda isEmpty do sprawdzania, czy stos jest pusty
        return stack.isEmpty(); // Sprawdzanie, czy lista jest pusta, co oznacza pusty stos
    }
    public static void main(String[] args) {
        var stack = new LinkedListStack(); // Tworzenie nowego stosu na bazie listy wiązanej
        Drink A = new Drink(1.99, "Pepsi");
        Drink B = new Drink(3.99, "Mirinda");
        Drink C = new Drink(1.59, "7Up");
        Drink D = new Drink(2.99, "Cola");
        Drink E = new Drink(3.99, "Tea");
        stack.push(A); // Dodawanie napojów na stos
        stack.push(B);
        stack.push(C);
        System.out.println(stack.pop().toString()); // Usuwanie i wypisywanie napoju z wierzchu stosu
        System.out.println(stack.pop().toString());
        stack.push(D); // Dodawanie kolejnych napojów na stos
        stack.push(E);
        System.out.println("============================");
        while (!stack.isEmpty()) { // Wypisywanie zawartości stosu, aż stos nie będzie pusty
            System.out.println(stack.pop().toString()); // Usuwanie i wypisywanie napoju z wierzchu stosu
        }
    }
}
