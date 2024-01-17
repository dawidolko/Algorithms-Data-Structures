package B.B1_DB;

// B1 Implementacja stosu za pomocą klasy "ArrayLisStack" - DB

import java.util.ArrayList;

public class ArrayListStack {
    private ArrayList<Integer> intStack;

    public ArrayListStack() {
        intStack = new ArrayList<Integer>();
    }

    public void push(int elem) {
        intStack.add(elem);
    }

    public Integer pop() {  // Zmiana zwracanego typu na Integer
        Integer topElem = intStack.get(intStack.size()-1);
        intStack.remove(intStack.size()-1);
        return topElem;
    }

    public Integer peek() {  // Zmiana zwracanego typu na Integer
        return intStack.get(intStack.size()-1);
    }

    public boolean isEmpty() {
        return intStack.isEmpty();
    }

    public static void main(String[] args) {
        ArrayListStack theStack = new ArrayListStack();
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        theStack.push(81);

        while (!theStack.isEmpty()) {
            Integer value = theStack.pop(); // Zmiana typu zmiennej na Integer
            System.out.println(value + " ");
        }
        System.out.println("");
    }
}
