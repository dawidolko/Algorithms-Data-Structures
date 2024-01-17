package B.B2_DB;

// B2 Implementacja stosu za pomocą klasy "LinkedList" - DB

import java.util.LinkedList;

public class LinkedListStack {
    private LinkedList<Integer> intStack;

    public LinkedListStack() {
        intStack = new LinkedList<Integer>();
    }

    public void push(Integer elem) {  // Zmiana typu argumentu na Integer
        intStack.push(elem);
    }

    public Integer pop() {  // Zmiana zwracanego typu na Integer
        return intStack.pop();
    }

    public Integer peek() {  // Zmiana zwracanego typu na Integer
        return intStack.peek();
    }

    public boolean isEmpty() {
        return intStack.isEmpty();
    }

    public static void main(String[] args) {
        LinkedListStack theStack = new LinkedListStack();
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while (!theStack.isEmpty()) {
            Integer value = theStack.pop(); // Zmiana typu zmiennej na Integer
            System.out.print(value + "\n");
        }
        System.out.println("");
    }
}

