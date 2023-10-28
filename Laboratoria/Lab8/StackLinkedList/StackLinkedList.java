package StackLinkedList;

import java.util.LinkedList;

public class StackLinkedList {
    private LinkedList<Person> stack;

    public StackLinkedList() {
        stack = new LinkedList<Person>();
    }

    public void push(Person p) {
        stack.push(p);
    }

    public Person pop() {
        return stack.pop();
    }

    public Person peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        var stack = new StackLinkedList();

        Person p1 = new Person(18, 177, 89);
        Person p2 = new Person(15, 156, 59);
        Person p3 = new Person(2, 81, 12);
        Person p4 = new Person(36, 201, 144);
        Person p5 = new Person(46, 181, 134);

        stack.push(p1);
        stack.push(p2);
        stack.push(p3);

        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());

        stack.push(p4);
        stack.push(p5);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toString());
        }
    }
}
