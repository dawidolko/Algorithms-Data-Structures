package B.B1_BDB;
// B1 Implementacja stosu za pomocą klasy "ArrayLisStack" - BDB
import java.util.ArrayList;
public class ArrayListStack {
    private ArrayList<Drink> stack;
    public ArrayListStack() {
        stack = new ArrayList<Drink>();
    }
    public void push(Drink d) {
        stack.add(0, d); // Dodawanie elementu na początek listy
    }
    public Drink pop() {
        return stack.remove(0); // Usuwanie i zwracanie elementu z początku listy (stosu)
    }
    public Drink peek() {
        return stack.get(0); // Pobieranie elementu z początku listy (stosu) bez usuwania
    }
    public boolean isEmpty() {
        return stack.isEmpty(); // Sprawdzanie czy stos jest pusty
    }
    public static void main(String[] args) {
        var stack = new ArrayListStack();
        Drink A = new Drink(1.99, "Pepsi");
        Drink B = new Drink(3.99, "Mirinda");
        Drink C = new Drink(1.59, "7Up");
        Drink D = new Drink(2.99, "Cola");
        Drink E = new Drink(3.99, "Tea");
        stack.push(A);
        stack.push(B);
        stack.push(C);
        System.out.println(stack.pop().toString()); // Wyświetlanie i usuwanie elementu ze stosu
        System.out.println(stack.pop().toString()); // Wyświetlanie i usuwanie elementu ze stosu
        stack.push(D);
        stack.push(E);
        System.out.println("===========================");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toString()); // Wyświetlanie i usuwanie wszystkich elementów ze stosu
        }
    }
}
