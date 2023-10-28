package StackLinkedList;

public class Person {
    private final int old, height, weight;

    public Person(int old, int height, int weight) {
        this.old = old;
        this.height = height;
        this.weight = weight;
    }

    public int getOld() {
        return old;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Person{" +
                "old=" + old +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
