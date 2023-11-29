package B.B2_LinkedListStack;

import java.util.LinkedList;

public class LinkedListStack {
    private LinkedList<Drink> stack;

    public LinkedListStack() {
        stack = new LinkedList<>();
    }

    public void push(Drink d) {
        stack.addFirst(d);
    }

    public Drink peek() {
        return stack.getFirst();
    }

    public Drink pop() {
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        var stack = new LinkedListStack();

        Drink A = new Drink(1.99, "Pepsi");
        Drink B = new Drink(3.99, "Mirinda");
        Drink C = new Drink(1.59, "7Up");
        Drink D = new Drink(2.99, "Cola");
        Drink E = new Drink(3.99, "Tea");

        stack.push(A);
        stack.push(B);
        stack.push(C);

        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());

        stack.push(D);
        stack.push(E);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toString());
        }
    }
}
