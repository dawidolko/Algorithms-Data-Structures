package B.B1_ArrayListStack;

import java.util.ArrayList;

public class ArrayListStack {
    private ArrayList<Drink> stack;

    public ArrayListStack() {
        stack = new ArrayList<Drink>();
    }

    public void push(Drink d) {
        stack.add(0, d);
    }

    public Drink pop() {
        return stack.remove(0);
    }

    public Drink peek() {
        return stack.get(0);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
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

        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());

        stack.push(D);
        stack.push(E);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toString());
        }
    }
}
